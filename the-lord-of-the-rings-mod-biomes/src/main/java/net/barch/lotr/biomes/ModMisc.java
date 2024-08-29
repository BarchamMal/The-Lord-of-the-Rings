package net.barch.lotr.biomes;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.barch.lotr.biomes.LOTRBiomesConfiguredFeatures.*;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class ModMisc {

    public static final BlockSetType PLUM_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).build(Identifier.of(TLOTRMB, "plum"));
    public static final BlockSetType OLIVE_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).build(Identifier.of(TLOTRMB, "olive"));
    public static final BlockSetType FIR_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).build(Identifier.of(TLOTRMB, "fir"));
    public static final WoodType PLUM = new WoodTypeBuilder().register(Identifier.of(TLOTRMB, "plum"), PLUM_SET_TYPE);
    public static final WoodType OLIVE = new WoodTypeBuilder().register(Identifier.of(TLOTRMB, "olive"), OLIVE_SET_TYPE);
    public static final WoodType FIR = new WoodTypeBuilder().register(Identifier.of(TLOTRMB, "fir"), FIR_SET_TYPE);

    public static final SaplingGenerator PLUM_SAPLING_GENERATOR = new SaplingGenerator("plum", Optional.empty(), Optional.of(PLUM_TREE), Optional.of(PLUM_BEE_TREE));
    public static final SaplingGenerator OLIVE_SAPLING_GENERATOR = new SaplingGenerator("olive",  Optional.of(OLIVE_MEGA_TREE), Optional.of(OLIVE_TREE), Optional.of(OLIVE_BEE_TREE));
    public static final SaplingGenerator FIR_SAPLING_GENERATOR = new SaplingGenerator("fir",  Optional.of(FIR_MEGA_TREE), Optional.of(FIR_TREE), Optional.empty());

    public static void onInitialize() {
        LOGGER.info("The Lord of The Rings Mod: Biomes mod misc initialized.");
    }


}
