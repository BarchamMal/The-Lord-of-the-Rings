package net.barch.lotr.biomes;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;

import java.util.function.Supplier;

import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class LOTRBiomesConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_TREE = ofConfiguredFeature("plum_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_BEE_TREE = ofConfiguredFeature("plum_tree_bee");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_TREE = ofConfiguredFeature("olive_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_BEE_TREE = ofConfiguredFeature("olive_tree_bee");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_MEGA_TREE = ofConfiguredFeature("olive_tree_mega");

    public static RegistryKey<ConfiguredFeature<?, ?>> ofConfiguredFeature(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TLOTRMB, id));
    }

    public static void onInitialize() {

        LOGGER.info("The Lord of The Rings Mod: Biomes mod configured features initialized.");
    }


}
