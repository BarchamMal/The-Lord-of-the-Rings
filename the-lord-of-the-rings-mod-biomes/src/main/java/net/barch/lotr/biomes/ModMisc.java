package net.barch.lotr.biomes;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.barch.lotr.biomes.LOTRBiomesConfiguredFeatures.PLUM_BEE_TREE;
import static net.barch.lotr.biomes.LOTRBiomesConfiguredFeatures.PLUM_TREE;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class ModMisc {

    public static final BlockSetType PLUM_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).build(Identifier.of(TLOTRMB, "plum"));
    public static final WoodType PLUM = new WoodTypeBuilder().register(Identifier.of(TLOTRMB, "plum"), PLUM_SET_TYPE);

    public static final SaplingGenerator PLUM_SAPLING_GENERATOR = new SaplingGenerator("plum", Optional.empty(), Optional.of(PLUM_TREE), Optional.of(PLUM_BEE_TREE));

    public static void onInitialize() {
        LOGGER.info("The Lord of The Rings Mod: Biomes mod misc initialized.");
    }


}
