package net.barch.lotr.biomes.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.List;

import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;


public class FruitingLeavesBlock extends LeavesBlock implements Fertilizable {

    public static final IntProperty FRUIT;
    public static final int MAX_AGE = 2; // AGE_2 only supports 0, 1, 2
    public static Identifier lootTableId;

    public FruitingLeavesBlock(Settings settings, String lootTableId) {
        super(settings);
        this.lootTableId = Identifier.of(TLOTRMB, "fruit_trees/"+lootTableId);
        this.setDefaultState(this.stateManager.getDefaultState().with(DISTANCE, 7).with(PERSISTENT, false).with(WATERLOGGED, false).with(FRUIT, 0));
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return state.get(FRUIT) != MAX_AGE;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }
    public boolean canGrow(BlockState state) {
        return !(getAge(state) == getMaxAge());
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if (canGrow(state)) {
            grow(world, random, pos, state);
        }
    }

    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    public int getAge(BlockState state) {
        return state.get(FRUIT);
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (random.nextInt(5) >= 4) {
            world.setBlockState(pos, state.with(FRUIT, getAge(state) + 1), 2);
        }
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        if (!(world instanceof ServerWorld) || !(getAge(state) == getMaxAge()) || player.getAbilities().creativeMode || player.isUsingItem()) {
            return ActionResult.PASS;
        }
        LootContextParameterSet.Builder builder = (new LootContextParameterSet.Builder((ServerWorld) world))
                .add(LootContextParameters.THIS_ENTITY, player)
                .add(LootContextParameters.ORIGIN, player.getPos());

        RegistryKey<LootTable> lootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE, lootTableId);
        LootTable lootTable = world.getServer().getReloadableRegistries().getLootTable(lootTableKey);

        LootContextParameterSet lootContextParameterSet = builder.build(LootContextTypes.GIFT);

        List<ItemStack> lootDrops =  lootTable.generateLoot(lootContextParameterSet);
        for (ItemStack drop : lootDrops) {

            ItemEntity item = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), drop);
            world.spawnEntity(item);

        }

        world.setBlockState(pos, state.with(FRUIT, 0));

        return ActionResult.PASS;

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FRUIT);
    }

    static {
        FRUIT = Properties.AGE_2;
    }
}