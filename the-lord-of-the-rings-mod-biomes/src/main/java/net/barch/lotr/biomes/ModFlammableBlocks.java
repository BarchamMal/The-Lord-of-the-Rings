package net.barch.lotr.biomes;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import static net.barch.lotr.biomes.Blocks.ModBlocks.*;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;

public class ModFlammableBlocks {

    public static void onInitialize() {
        LOGGER.info("The Lord of The Rings Mod: Biomes flammable blocks flammablized.");

        registerFlammable(PLUM_LOG, Blocks.OAK_LOG);
        registerFlammable(PLUM_LOG_STRIPPED, Blocks.STRIPPED_OAK_LOG);
        registerFlammable(PLUM_WOOD, Blocks.OAK_WOOD);
        registerFlammable(PLUM_WOOD_STRIPPED, Blocks.STRIPPED_OAK_WOOD);
        registerFlammable(PLUM_FENCE_GATE, Blocks.OAK_FENCE_GATE);
        registerFlammable(PLUM_FENCE, Blocks.OAK_FENCE);
        registerFlammable(PLUM_SLAB, Blocks.OAK_SLAB);
        registerFlammable(PLUM_STAIRS, Blocks.OAK_STAIRS);
        registerFlammable(PLUM_PLANKS, Blocks.OAK_PLANKS);

        registerFlammable(OLIVE_LOG, Blocks.OAK_LOG);
        registerFlammable(OLIVE_LOG_STRIPPED, Blocks.STRIPPED_OAK_LOG);
        registerFlammable(OLIVE_WOOD, Blocks.OAK_WOOD);
        registerFlammable(OLIVE_WOOD_STRIPPED, Blocks.STRIPPED_OAK_WOOD);
        registerFlammable(OLIVE_FENCE_GATE, Blocks.OAK_FENCE_GATE);
        registerFlammable(OLIVE_FENCE, Blocks.OAK_FENCE);
        registerFlammable(OLIVE_SLAB, Blocks.OAK_SLAB);
        registerFlammable(OLIVE_STAIRS, Blocks.OAK_STAIRS);
        registerFlammable(OLIVE_PLANKS, Blocks.OAK_PLANKS);

    }

    public static void registerFlammable(Block toRegister, Block toStealStatsFrom) {

        FlammableBlockRegistry.getDefaultInstance().add(
                toRegister,
                FlammableBlockRegistry.getDefaultInstance().get(toStealStatsFrom).getBurnChance(),
                FlammableBlockRegistry.getDefaultInstance().get(toStealStatsFrom).getSpreadChance());
    }

    public static void registerFlammable(Block toRegister, int burnChance, int spreadChance) {
        FlammableBlockRegistry.getDefaultInstance().add(toRegister, burnChance, spreadChance);
    }

}
