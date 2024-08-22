package net.barch.lotr.biomes.Blocks;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.barch.lotr.biomes.ModMisc;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static net.barch.barch_lib.Blocks.BlockBuilder.CloneBlock;
import static net.barch.lotr.biomes.ModMisc.*;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;

public class ModBlocks {


    public static final Block PLUM_LOG = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_log");
    public static final Block PLUM_LOG_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_log_stripped");
    public static final Block PLUM_WOOD = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_wood");
    public static final Block PLUM_WOOD_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_wood_stripped");
    public static final Block PLUM_FENCE_GATE = registerBlock("plum_fence_gate", new FenceGateBlock(PLUM, CloneBlock(Blocks.OAK_FENCE_GATE)));
    public static final Block PLUM_FENCE = registerBlock("plum_fence", new FenceBlock(CloneBlock(Blocks.OAK_FENCE)));
    public static final Block PLUM_SLAB = registerBlock("plum_slab", new SlabBlock(CloneBlock(Blocks.OAK_SLAB)));
    public static final Block PLUM_PLANKS = registerBlock("plum_planks", new Block(CloneBlock(Blocks.OAK_PLANKS)));
    public static final Block PLUM_STAIRS = registerBlock("plum_stairs", new StairsBlock(PLUM_PLANKS.getDefaultState(), CloneBlock(Blocks.OAK_STAIRS)));
    public static final Block PLUM_BUTTON = registerBlock("plum_button", new ButtonBlock(PLUM_SET_TYPE, 30, CloneBlock(Blocks.OAK_BUTTON).noCollision()));
    public static final Block PLUM_SIGN = registerBlock("plum_sign", new TerraformSignBlock(Identifier.of(TLOTRMB, "entity/signs/plum"), CloneBlock(Blocks.OAK_SIGN).noCollision()));
    public static final Block PLUM_WALL_SIGN = registerBlock("plum_wall_sign", new TerraformWallSignBlock(Identifier.of(TLOTRMB, "entity/signs/plum"), CloneBlock(Blocks.OAK_WALL_SIGN).noCollision()));
    public static final Block PLUM_HANGING_SIGN = registerBlock("plum_hanging_sign", new TerraformHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/plum"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/plum"), CloneBlock(Blocks.OAK_HANGING_SIGN).noCollision()));
    public static final Block PLUM_WALL_HANGING_SIGN = registerBlock("plum_wall_hanging_sign", new TerraformWallHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/plum"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/plum"), CloneBlock(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block PLUM_TRAPDOOR = registerBlock("plum_trapdoor", new TrapdoorBlock(PLUM_SET_TYPE, CloneBlock(Blocks.OAK_TRAPDOOR).nonOpaque()));
    public static final Block PLUM_DOOR = registerBlock("plum_door", new DoorBlock(PLUM_SET_TYPE, CloneBlock(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block PLUM_PRESSURE_PLATE = registerBlock("plum_pressure_plate", new PressurePlateBlock(PLUM_SET_TYPE, CloneBlock(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block PLUM_LEAVES = registerBlock("plum_leaves", new FruitingLeavesBlock(CloneBlock(Blocks.OAK_LEAVES).allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).nonOpaque().ticksRandomly(), "plum"));
    public static final Block PLUM_SAPLING = registerBlock("plum_sapling", new SaplingBlock(ModMisc.PLUM_SAPLING_GENERATOR, CloneBlock(Blocks.OAK_SAPLING).noCollision().nonOpaque().ticksRandomly()));




    public static final Block OLIVE_LOG = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_log");
    public static final Block OLIVE_LOG_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_log_stripped");
    public static final Block OLIVE_WOOD = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_wood");
    public static final Block OLIVE_WOOD_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_wood_stripped");
    public static final Block OLIVE_FENCE_GATE = registerBlock("olive_fence_gate", new FenceGateBlock(OLIVE, CloneBlock(Blocks.OAK_FENCE_GATE)));
    public static final Block OLIVE_FENCE = registerBlock("olive_fence", new FenceBlock(CloneBlock(Blocks.OAK_FENCE)));
    public static final Block OLIVE_SLAB = registerBlock("olive_slab", new SlabBlock(CloneBlock(Blocks.OAK_SLAB)));
    public static final Block OLIVE_PLANKS = registerBlock("olive_planks", new Block(CloneBlock(Blocks.OAK_PLANKS)));
    public static final Block OLIVE_STAIRS = registerBlock("olive_stairs", new StairsBlock(OLIVE_PLANKS.getDefaultState(), CloneBlock(Blocks.OAK_STAIRS)));
    public static final Block OLIVE_BUTTON = registerBlock("olive_button", new ButtonBlock(OLIVE_SET_TYPE, 30, CloneBlock(Blocks.OAK_BUTTON).noCollision()));
    public static final Block OLIVE_SIGN = registerBlock("olive_sign", new TerraformSignBlock(Identifier.of(TLOTRMB, "entity/signs/olive"), CloneBlock(Blocks.OAK_SIGN).noCollision()));
    public static final Block OLIVE_WALL_SIGN = registerBlock("olive_wall_sign", new TerraformWallSignBlock(Identifier.of(TLOTRMB, "entity/signs/olive"), CloneBlock(Blocks.OAK_WALL_SIGN).noCollision()));
    public static final Block OLIVE_HANGING_SIGN = registerBlock("olive_hanging_sign", new TerraformHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/olive"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/olive"), CloneBlock(Blocks.OAK_HANGING_SIGN).noCollision()));
    public static final Block OLIVE_WALL_HANGING_SIGN = registerBlock("olive_wall_hanging_sign", new TerraformWallHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/olive"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/olive"), CloneBlock(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block OLIVE_TRAPDOOR = registerBlock("olive_trapdoor", new TrapdoorBlock(OLIVE_SET_TYPE, CloneBlock(Blocks.OAK_TRAPDOOR).nonOpaque()));
    public static final Block OLIVE_DOOR = registerBlock("olive_door", new DoorBlock(OLIVE_SET_TYPE, CloneBlock(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block OLIVE_PRESSURE_PLATE = registerBlock("olive_pressure_plate", new PressurePlateBlock(OLIVE_SET_TYPE, CloneBlock(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block OLIVE_LEAVES = registerBlock("olive_leaves", new FruitingLeavesBlock(CloneBlock(Blocks.OAK_LEAVES).allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).nonOpaque().ticksRandomly(), "olive"));
    public static final Block OLIVE_SAPLING = registerBlock("olive_sapling", new SaplingBlock(ModMisc.OLIVE_SAPLING_GENERATOR, CloneBlock(Blocks.OAK_SAPLING).noCollision().nonOpaque().ticksRandomly()));


    public static Block registerLogBlock(MapColor topMapColor, MapColor sideMapColor, String name) {

        return Registry.register(Registries.BLOCK, Identifier.of(TLOTRMB, name), new PillarBlock(AbstractBlock.Settings.create().mapColor((state) -> {
            return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    }

    public static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TLOTRMB, name), block);
    }

    public static void onInitialize() {
        LOGGER.info("The Lord of The Rings Mod: Biomes mod blocks initialized.");
    }

}
