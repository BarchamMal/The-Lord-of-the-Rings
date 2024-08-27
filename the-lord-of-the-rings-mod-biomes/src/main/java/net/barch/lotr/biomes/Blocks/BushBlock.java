package net.barch.lotr.biomes.Blocks;

import net.barch.lotr.biomes.TheLordOfTheRingsModBiomes;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

import java.util.List;

import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class BushBlock extends SweetBerryBushBlock {

    String lootTableId;
    int resetAge;
    Item pickStack;

    public BushBlock(Settings settings, String lootTableId, int resetAge) {
        super(settings);
        this.lootTableId = lootTableId;
        this.resetAge = resetAge;
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return this.pickStack.getDefaultStack();
    }

    public void setPickStack(Item pickStack) {
        this.pickStack = pickStack;
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        if (!(state.get(AGE) >= 2) || !(world instanceof ServerWorld)) {return super.onUse(state, world, pos, player, hit);}

        Identifier lootTableName = Identifier.of(TLOTRMB, "bushes/" + this.lootTableId + "_" + ((state.get(AGE))-2));
        TheLordOfTheRingsModBiomes.LOGGER.info(lootTableName.toString());

        LootContextParameterSet.Builder builder = (new LootContextParameterSet.Builder((ServerWorld) world))
                .add(LootContextParameters.THIS_ENTITY, player)
                .add(LootContextParameters.ORIGIN, player.getPos());

        RegistryKey<LootTable> lootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE, lootTableName);
        LootTable lootTable = world.getServer().getReloadableRegistries().getLootTable(lootTableKey);

        LootContextParameterSet lootContextParameterSet = builder.build(LootContextTypes.GIFT);

        List<ItemStack> lootDrops =  lootTable.generateLoot(lootContextParameterSet);
        for (ItemStack drop : lootDrops) {

            ItemEntity item = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), drop);
            world.spawnEntity(item);

        }

        world.setBlockState(pos, state.with(AGE, this.resetAge));
        world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, .8f + world.random.nextFloat() * 0.4f);
        world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, state));
        return ActionResult.PASS;

    }
}
