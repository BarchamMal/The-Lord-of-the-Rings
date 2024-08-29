package net.barch.lotr.biomes;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.impl.item.TerraformBoatItem;
import net.barch.barch_lib.Items.ItemGroupItem;
import net.barch.lotr.biomes.Blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry.createKey;
import static net.barch.lotr.biomes.Blocks.ModBlocks.*;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.*;

public class ModItems {

    public static final RegistryKey<TerraformBoatType> PLUM_BOAT_KEY = createKey(Identifier.of(TLOTRMB, "plum"));
    public static final RegistryKey<TerraformBoatType> OLIVE_BOAT_KEY = createKey(Identifier.of(TLOTRMB, "olive"));
    public static final RegistryKey<TerraformBoatType> FIR_BOAT_KEY = createKey(Identifier.of(TLOTRMB, "fir"));

    public static final Item ATHELAS_ITEM = registerBlockItem(ATHELAS, "athelas");
    public static final Item ELANOR_ITEM = registerBlockItem(ELANOR, "elanor");
    public static final Item NIPHREDIL_ITEM = registerBlockItem(NIPHREDIL, "niphredil");
    public static final Item VIOLETS_ITEM = registerBlockItem(VIOLETS, "violets");

    public static final Item PLUM_LOG_BLOCK_ITEM = registerBlockItem(PLUM_LOG, "plum_log");
    public static final Item PLUM_LOG_STRIPPED_BLOCK_ITEM = registerBlockItem(PLUM_LOG_STRIPPED, "plum_log_stripped");
    public static final Item PLUM_WOOD_BLOCK_ITEM = registerBlockItem(PLUM_WOOD, "plum_wood");
    public static final Item PLUM_WOOD_STRIPPED_BLOCK_ITEM = registerBlockItem(PLUM_WOOD_STRIPPED, "plum_wood_stripped");
    public static final Item PLUM_FENCE_GATE_ITEM = registerBlockItem(PLUM_FENCE_GATE, "plum_fence_gate");
    public static final Item PLUM_FENCE_ITEM = registerBlockItem(PLUM_FENCE, "plum_fence");
    public static final Item PLUM_SLAB_ITEM = registerBlockItem(PLUM_SLAB, "plum_slab");
    public static final Item PLUM_PLANKS_ITEM = registerBlockItem(PLUM_PLANKS, "plum_planks");
    public static final Item PLUM_STAIRS_ITEM = registerBlockItem(PLUM_STAIRS, "plum_stairs");
    public static final Item PLUM_BUTTON_ITEM = registerBlockItem(PLUM_BUTTON, "plum_button");
    public static final Item PLUM_SIGN_ITEM = registerSignItem(PLUM_SIGN, PLUM_WALL_SIGN, "plum_sign");
    public static final Item PLUM_HANGING_SIGN_ITEM = registerSignItem(PLUM_HANGING_SIGN, PLUM_WALL_HANGING_SIGN, "plum_hanging_sign");
    public static final Item PLUM_TRAPDOOR_ITEM = registerBlockItem(PLUM_TRAPDOOR, "plum_trapdoor");
    public static final Item PLUM_DOOR_ITEM = registerBlockItem(PLUM_DOOR, "plum_door");
    public static final Item PLUM_PRESSURE_PLATE_ITEM = registerBlockItem(PLUM_PRESSURE_PLATE, "plum_pressure_plate");
    public static final Item PLUM_LEAVES_ITEM = registerBlockItem(PLUM_LEAVES, "plum_leaves");
    public static final Item PLUM_SAPLING_ITEM = registerBlockItem(PLUM_SAPLING, "plum_sapling");

    public static final Item OLIVE_LOG_BLOCK_ITEM = registerBlockItem(OLIVE_LOG, "olive_log");
    public static final Item OLIVE_LOG_STRIPPED_BLOCK_ITEM = registerBlockItem(OLIVE_LOG_STRIPPED, "olive_log_stripped");
    public static final Item OLIVE_WOOD_BLOCK_ITEM = registerBlockItem(OLIVE_WOOD, "olive_wood");
    public static final Item OLIVE_WOOD_STRIPPED_BLOCK_ITEM = registerBlockItem(OLIVE_WOOD_STRIPPED, "olive_wood_stripped");
    public static final Item OLIVE_FENCE_GATE_ITEM = registerBlockItem(OLIVE_FENCE_GATE, "olive_fence_gate");
    public static final Item OLIVE_FENCE_ITEM = registerBlockItem(OLIVE_FENCE, "olive_fence");
    public static final Item OLIVE_SLAB_ITEM = registerBlockItem(OLIVE_SLAB, "olive_slab");
    public static final Item OLIVE_PLANKS_ITEM = registerBlockItem(OLIVE_PLANKS, "olive_planks");
    public static final Item OLIVE_STAIRS_ITEM = registerBlockItem(OLIVE_STAIRS, "olive_stairs");
    public static final Item OLIVE_BUTTON_ITEM = registerBlockItem(OLIVE_BUTTON, "olive_button");
    public static final Item OLIVE_SIGN_ITEM = registerSignItem(OLIVE_SIGN, OLIVE_WALL_SIGN, "olive_sign");
    public static final Item OLIVE_HANGING_SIGN_ITEM = registerSignItem(OLIVE_HANGING_SIGN, OLIVE_WALL_HANGING_SIGN, "olive_hanging_sign");
    public static final Item OLIVE_TRAPDOOR_ITEM = registerBlockItem(OLIVE_TRAPDOOR, "olive_trapdoor");
    public static final Item OLIVE_DOOR_ITEM = registerBlockItem(OLIVE_DOOR, "olive_door");
    public static final Item OLIVE_PRESSURE_PLATE_ITEM = registerBlockItem(OLIVE_PRESSURE_PLATE, "olive_pressure_plate");
    public static final Item OLIVE_LEAVES_ITEM = registerBlockItem(OLIVE_LEAVES, "olive_leaves");
    public static final Item OLIVE_SAPLING_ITEM = registerBlockItem(OLIVE_SAPLING, "olive_sapling");

    public static final Item FIR_LOG_BLOCK_ITEM = registerBlockItem(FIR_LOG, "fir_log");
    public static final Item FIR_LOG_STRIPPED_BLOCK_ITEM = registerBlockItem(FIR_LOG_STRIPPED, "fir_log_stripped");
    public static final Item FIR_WOOD_BLOCK_ITEM = registerBlockItem(FIR_WOOD, "fir_wood");
    public static final Item FIR_WOOD_STRIPPED_BLOCK_ITEM = registerBlockItem(FIR_WOOD_STRIPPED, "fir_wood_stripped");
    public static final Item FIR_FENCE_GATE_ITEM = registerBlockItem(FIR_FENCE_GATE, "fir_fence_gate");
    public static final Item FIR_FENCE_ITEM = registerBlockItem(FIR_FENCE, "fir_fence");
    public static final Item FIR_SLAB_ITEM = registerBlockItem(FIR_SLAB, "fir_slab");
    public static final Item FIR_PLANKS_ITEM = registerBlockItem(FIR_PLANKS, "fir_planks");
    public static final Item FIR_STAIRS_ITEM = registerBlockItem(FIR_STAIRS, "fir_stairs");
    public static final Item FIR_BUTTON_ITEM = registerBlockItem(FIR_BUTTON, "fir_button");
    public static final Item FIR_SIGN_ITEM = registerSignItem(FIR_SIGN, FIR_WALL_SIGN, "fir_sign");
    public static final Item FIR_HANGING_SIGN_ITEM = registerSignItem(FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN, "fir_hanging_sign");
    public static final Item FIR_TRAPDOOR_ITEM = registerBlockItem(FIR_TRAPDOOR, "fir_trapdoor");
    public static final Item FIR_DOOR_ITEM = registerBlockItem(FIR_DOOR, "fir_door");
    public static final Item FIR_PRESSURE_PLATE_ITEM = registerBlockItem(FIR_PRESSURE_PLATE, "fir_pressure_plate");
    public static final Item FIR_LEAVES_ITEM = registerBlockItem(FIR_LEAVES, "fir_leaves");
    public static final Item FIR_SAPLING_ITEM = registerBlockItem(FIR_SAPLING, "fir_sapling");

    public static final Item PLUM_ITEM = registerFoodItem(FoodComponents.APPLE, "plum");
    public static final Item OLIVE_ITEM = registerFoodItem(FoodComponents.APPLE, "olive");
    public static final Item BLACKBERRY_ITEM = registerItem(new AliasedBlockItem(BLACKBERRY_BUSH_BLOCK, new Item.Settings().food(FoodComponents.SWEET_BERRIES)), "blackberry");

    public static final Item PLUM_BOAT_ITEM = registerBoatItem(PLUM_BOAT_KEY, false, "plum_boat");
    public static final Item PLUM_BOAT_CHEST_ITEM = registerBoatItem(PLUM_BOAT_KEY, true, "plum_boat_chest");
    public static final Item OLIVE_BOAT_ITEM = registerBoatItem(OLIVE_BOAT_KEY, false, "olive_boat");
    public static final Item OLIVE_BOAT_CHEST_ITEM = registerBoatItem(OLIVE_BOAT_KEY, true, "olive_boat_chest");
    public static final Item FIR_BOAT_ITEM = registerBoatItem(FIR_BOAT_KEY, false, "fir_boat");
    public static final Item FIR_BOAT_CHEST_ITEM = registerBoatItem(FIR_BOAT_KEY, true, "fir_boat_chest");
    public static Item registerBlockItem(Block block, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(TLOTRMB, name), new BlockItem(block, new Item.Settings()));
    }

    public static Item registerSignItem(Block stangingBlock, Block wallBlock, String name) {
        if (name.contains("hang")) {
            return Registry.register(Registries.ITEM, Identifier.of(TLOTRMB, name), new SignItem(new Item.Settings(), stangingBlock, wallBlock));
        }
        else {
            return Registry.register(Registries.ITEM, Identifier.of(TLOTRMB, name), new HangingSignItem(stangingBlock, wallBlock, new Item.Settings()));
        }
    }

    public static Item registerBoatItem(RegistryKey<TerraformBoatType> key, boolean chest, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(TLOTRMB, name), new TerraformBoatItem(key, chest, new Item.Settings().maxCount(1)));
    }

    public static Item registerFoodItem(FoodComponent foodComponent, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(TLOTRMB, name), new Item(new Item.Settings().food(foodComponent)));
    }

    public static Item registerItem(Item item, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(TLOTRMB, name), item);
    }

    public static void onInitialize() {

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_LOG_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, Items.CHERRY_LOG), new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, Items.CHERRY_BUTTON)});

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_WOOD_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_LOG_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_LOG_STRIPPED_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_WOOD_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_WOOD_STRIPPED_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_LOG_STRIPPED_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_PLANKS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_WOOD_STRIPPED_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_STAIRS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_PLANKS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_SLAB_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_STAIRS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_FENCE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_SLAB_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_FENCE_GATE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_FENCE_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_DOOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_FENCE_GATE_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_TRAPDOOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_DOOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_PRESSURE_PLATE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_TRAPDOOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_BUTTON_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_PRESSURE_PLATE_ITEM)});

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_LOG_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, PLUM_LOG_BLOCK_ITEM), new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, PLUM_BUTTON_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_WOOD_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_LOG_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_LOG_STRIPPED_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_WOOD_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_WOOD_STRIPPED_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_LOG_STRIPPED_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_PLANKS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_WOOD_STRIPPED_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_STAIRS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_PLANKS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_SLAB_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_STAIRS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_FENCE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_SLAB_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_FENCE_GATE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_FENCE_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_DOOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_FENCE_GATE_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_TRAPDOOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_DOOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_PRESSURE_PLATE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_TRAPDOOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_BUTTON_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_PRESSURE_PLATE_ITEM)});

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_LOG_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, OLIVE_LOG_BLOCK_ITEM), new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, OLIVE_BUTTON_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_WOOD_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_LOG_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_LOG_STRIPPED_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_WOOD_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_WOOD_STRIPPED_BLOCK_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_LOG_STRIPPED_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_PLANKS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_WOOD_STRIPPED_BLOCK_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_STAIRS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_PLANKS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_SLAB_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_STAIRS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_FENCE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_SLAB_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_FENCE_GATE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_FENCE_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_DOOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_FENCE_GATE_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_TRAPDOOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_DOOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_PRESSURE_PLATE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_TRAPDOOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_BUTTON_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.BUILDING_BLOCKS, FIR_PRESSURE_PLATE_ITEM)});

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_SIGN_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FUNCTIONAL, Items.CHERRY_HANGING_SIGN)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_HANGING_SIGN_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FUNCTIONAL, PLUM_SIGN_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_SIGN_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FUNCTIONAL, PLUM_HANGING_SIGN_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_HANGING_SIGN_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FUNCTIONAL, OLIVE_SIGN_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_SIGN_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FUNCTIONAL, OLIVE_HANGING_SIGN_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_HANGING_SIGN_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FUNCTIONAL, FIR_SIGN_ITEM)});


        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_BOAT_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.TOOLS, Items.CHERRY_CHEST_BOAT)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_BOAT_CHEST_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.TOOLS, PLUM_BOAT_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_BOAT_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.TOOLS, PLUM_BOAT_CHEST_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_BOAT_CHEST_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.TOOLS, OLIVE_BOAT_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_BOAT_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.TOOLS, OLIVE_BOAT_CHEST_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_BOAT_CHEST_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.TOOLS, FIR_BOAT_ITEM)});

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_LEAVES_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, Items.CHERRY_LEAVES)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_SAPLING_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, Items.CHERRY_SAPLING)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_LEAVES_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, PLUM_LEAVES_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_SAPLING_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, OLIVE_SAPLING_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_LEAVES_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, OLIVE_LEAVES_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(FIR_SAPLING_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, FIR_SAPLING_ITEM)});

        LOTR_BIOMES_ITEM_GROUPER.GroupItem(PLUM_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FOOD_AND_DRINK, Items.APPLE)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(OLIVE_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FOOD_AND_DRINK, PLUM_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(BLACKBERRY_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.FOOD_AND_DRINK, OLIVE_ITEM)});


        LOTR_BIOMES_ITEM_GROUPER.GroupItem(ATHELAS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, Items.LILY_OF_THE_VALLEY)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(ELANOR_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, ATHELAS_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(NIPHREDIL_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, ELANOR_ITEM)});
        LOTR_BIOMES_ITEM_GROUPER.GroupItem(VIOLETS_ITEM, new ItemGroupItem[]{new ItemGroupItem(ItemGroups.NATURAL, NIPHREDIL_ITEM)});

        LOGGER.info("The Lord of The Rings Mod: Biomes mod items initialized.");
    }

}
