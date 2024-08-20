package net.barch.lotr.biomes;

import net.barch.barch_lib.Items.ItemGrouper;
import net.barch.lotr.biomes.Blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheLordOfTheRingsModBiomes implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String TLOTRMB = "the-lord-of-the-rings-mod-biomes";
    public static final Logger LOGGER = LoggerFactory.getLogger(TLOTRMB);

	public static final RegistryKey<ItemGroup> LOTR_BIOMES_ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TLOTRMB, "biomes_group"));

	public static final ItemGrouper LOTR_BIOMES_ITEM_GROUPER = new ItemGrouper(LOTR_BIOMES_ITEM_GROUP);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		LOTRBiomesConfiguredFeatures.onInitialize();
		ModBlocks.onInitialize();
		ModItems.onInitialize();
		ModBoatTypes.onInitialize();
		ModMisc.onInitialize();
		ModFlammableBlocks.onInitialize();

		Registry.register(Registries.ITEM_GROUP, LOTR_BIOMES_ITEM_GROUP, FabricItemGroup.builder()
				.icon(() -> new ItemStack(ModItems.PLUM_ITEM))
				.displayName(Text.translatable("itemGroup."+TLOTRMB+".biomes_group"))
				.build());

	}
}