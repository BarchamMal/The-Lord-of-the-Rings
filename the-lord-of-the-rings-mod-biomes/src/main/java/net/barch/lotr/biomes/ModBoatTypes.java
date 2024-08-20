package net.barch.lotr.biomes;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.barch.lotr.biomes.Blocks.ModBlocks.PLUM_PLANKS;
import static net.barch.lotr.biomes.ModItems.PLUM_BOAT_CHEST_ITEM;
import static net.barch.lotr.biomes.ModItems.PLUM_BOAT_ITEM;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class ModBoatTypes {

    public static final TerraformBoatType PLUM_BOAT_TYPE = registerBoatType(PLUM_BOAT_ITEM, PLUM_BOAT_CHEST_ITEM, PLUM_PLANKS);


    public static TerraformBoatType registerBoatType(Item boatItem, Item chestBoatItem, Block planks) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, Identifier.of(TLOTRMB, "plum"),
                new TerraformBoatType.Builder().item(boatItem).chestItem(chestBoatItem).planks(planks.asItem()).build());
    }

    public static void onInitialize() {
        LOGGER.info("The Lord of The Rings Mod: Biomes mod boats initialized.");
    }

}
