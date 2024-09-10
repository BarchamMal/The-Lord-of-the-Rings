package net.barch.lotr.biomes.Blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.CherryLeavesBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class ModdedCherryLeavesBlock extends FruitingLeavesBlock {
    public static final MapCodec<CherryLeavesBlock> CODEC = createCodec(CherryLeavesBlock::new);

    public ModdedCherryLeavesBlock(Settings settings, String lootTableId) {
        super(settings, lootTableId);
    }

    public MapCodec<CherryLeavesBlock> getCodec() {
        return CODEC;
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0 && getAge(state) == 1) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                ParticleUtil.spawnParticle(world, pos, random, ParticleTypes.CHERRY_LEAVES);
            }
        }
    }
}
