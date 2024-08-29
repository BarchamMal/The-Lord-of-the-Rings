package net.barch.lotr.biomes;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.barch.lotr.biomes.Blocks.ModBlocks.*;
import static net.barch.lotr.biomes.ModItems.*;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class ModBoatTypes {

    public static final TerraformBoatType PLUM_BOAT_TYPE = registerBoatType(PLUM_BOAT_ITEM, PLUM_BOAT_CHEST_ITEM, PLUM_PLANKS, "plum");
    public static final TerraformBoatType OLIVE_BOAT_TYPE = registerBoatType(OLIVE_BOAT_ITEM, OLIVE_BOAT_CHEST_ITEM, OLIVE_PLANKS, "olive");
    public static final TerraformBoatType FIR_BOAT_TYPE = registerBoatType(FIR_BOAT_ITEM, FIR_BOAT_CHEST_ITEM, FIR_PLANKS, "fir");


    public static TerraformBoatType registerBoatType(Item boatItem, Item chestBoatItem, Block planks, String name) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, Identifier.of(TLOTRMB, name),
                new TerraformBoatType.Builder().item(boatItem).chestItem(chestBoatItem).planks(planks.asItem()).build());
    }

    public static void onInitialize() {
        LOGGER.info("The Lord of The Rings Mod: Biomes mod boats initialized.");
    }

}
