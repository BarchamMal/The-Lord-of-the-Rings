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

import static net.barch.lotr.biomes.ModItems.BLACKBERRY_ITEM;
import static net.barch.lotr.biomes.ModMisc.*;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;
import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.LOGGER;

public class ModBlocks {


    public static final Block ATHELAS = registerBlock("athelas", new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block ELANOR = registerBlock("elanor", new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block NIPHREDIL = registerBlock("niphredil", new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block VIOLETS = registerBlock("violets", new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block BLACKBERRY_BUSH_BLOCK = registerBlock("blackberry_bush", new BushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH), "blackberry", 1));

    public static final Block PLUM_LOG = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_log");
    public static final Block PLUM_LOG_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_log_stripped");
    public static final Block PLUM_WOOD = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_wood");
    public static final Block PLUM_WOOD_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.DARK_CRIMSON, "plum_wood_stripped");
    public static final Block PLUM_FENCE_GATE = registerBlock("plum_fence_gate", new FenceGateBlock(PLUM, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block PLUM_FENCE = registerBlock("plum_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block PLUM_SLAB = registerBlock("plum_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block PLUM_PLANKS = registerBlock("plum_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block PLUM_STAIRS = registerBlock("plum_stairs", new StairsBlock(PLUM_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block PLUM_BUTTON = registerBlock("plum_button", new ButtonBlock(PLUM_SET_TYPE, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));
    public static final Block PLUM_SIGN = registerBlock("plum_sign", new TerraformSignBlock(Identifier.of(TLOTRMB, "entity/signs/plum"), AbstractBlock.Settings.copy(Blocks.OAK_SIGN).noCollision()));
    public static final Block PLUM_WALL_SIGN = registerBlock("plum_wall_sign", new TerraformWallSignBlock(Identifier.of(TLOTRMB, "entity/signs/plum"), AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).noCollision()));
    public static final Block PLUM_HANGING_SIGN = registerBlock("plum_hanging_sign", new TerraformHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/plum"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/plum"), AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).noCollision()));
    public static final Block PLUM_WALL_HANGING_SIGN = registerBlock("plum_wall_hanging_sign", new TerraformWallHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/plum"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/plum"), AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block PLUM_TRAPDOOR = registerBlock("plum_trapdoor", new TrapdoorBlock(PLUM_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque()));
    public static final Block PLUM_DOOR = registerBlock("plum_door", new DoorBlock(PLUM_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block PLUM_PRESSURE_PLATE = registerBlock("plum_pressure_plate", new PressurePlateBlock(PLUM_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block PLUM_LEAVES = registerBlock("plum_leaves", new FruitingLeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).nonOpaque().ticksRandomly(), "plum"));
    public static final Block PLUM_SAPLING = registerBlock("plum_sapling", new SaplingBlock(ModMisc.PLUM_SAPLING_GENERATOR, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision().nonOpaque().ticksRandomly()));


    public static final Block OLIVE_LOG = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_log");
    public static final Block OLIVE_LOG_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_log_stripped");
    public static final Block OLIVE_WOOD = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_wood");
    public static final Block OLIVE_WOOD_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "olive_wood_stripped");
    public static final Block OLIVE_FENCE_GATE = registerBlock("olive_fence_gate", new FenceGateBlock(OLIVE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block OLIVE_FENCE = registerBlock("olive_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block OLIVE_SLAB = registerBlock("olive_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block OLIVE_PLANKS = registerBlock("olive_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block OLIVE_STAIRS = registerBlock("olive_stairs", new StairsBlock(OLIVE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block OLIVE_BUTTON = registerBlock("olive_button", new ButtonBlock(OLIVE_SET_TYPE, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));
    public static final Block OLIVE_SIGN = registerBlock("olive_sign", new TerraformSignBlock(Identifier.of(TLOTRMB, "entity/signs/olive"), AbstractBlock.Settings.copy(Blocks.OAK_SIGN).noCollision()));
    public static final Block OLIVE_WALL_SIGN = registerBlock("olive_wall_sign", new TerraformWallSignBlock(Identifier.of(TLOTRMB, "entity/signs/olive"), AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).noCollision()));
    public static final Block OLIVE_HANGING_SIGN = registerBlock("olive_hanging_sign", new TerraformHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/olive"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/olive"), AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).noCollision()));
    public static final Block OLIVE_WALL_HANGING_SIGN = registerBlock("olive_wall_hanging_sign", new TerraformWallHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/olive"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/olive"), AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block OLIVE_TRAPDOOR = registerBlock("olive_trapdoor", new TrapdoorBlock(OLIVE_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque()));
    public static final Block OLIVE_DOOR = registerBlock("olive_door", new DoorBlock(OLIVE_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block OLIVE_PRESSURE_PLATE = registerBlock("olive_pressure_plate", new PressurePlateBlock(OLIVE_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block OLIVE_LEAVES = registerBlock("olive_leaves", new FruitingLeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).nonOpaque().ticksRandomly(), "olive"));
    public static final Block OLIVE_SAPLING = registerBlock("olive_sapling", new SaplingBlock(ModMisc.OLIVE_SAPLING_GENERATOR, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision().nonOpaque().ticksRandomly()));


    public static final Block FIR_LOG = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "fir_log");
    public static final Block FIR_LOG_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "fir_log_stripped");
    public static final Block FIR_WOOD = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "fir_wood");
    public static final Block FIR_WOOD_STRIPPED = registerLogBlock(MapColor.DARK_DULL_PINK, MapColor.PALE_GREEN, "fir_wood_stripped");
    public static final Block FIR_FENCE_GATE = registerBlock("fir_fence_gate", new FenceGateBlock(FIR, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block FIR_FENCE = registerBlock("fir_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block FIR_SLAB = registerBlock("fir_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block FIR_PLANKS = registerBlock("fir_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block FIR_STAIRS = registerBlock("fir_stairs", new StairsBlock(FIR_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block FIR_BUTTON = registerBlock("fir_button", new ButtonBlock(FIR_SET_TYPE, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));
    public static final Block FIR_SIGN = registerBlock("fir_sign", new TerraformSignBlock(Identifier.of(TLOTRMB, "entity/signs/fir"), AbstractBlock.Settings.copy(Blocks.OAK_SIGN).noCollision()));
    public static final Block FIR_WALL_SIGN = registerBlock("fir_wall_sign", new TerraformWallSignBlock(Identifier.of(TLOTRMB, "entity/signs/fir"), AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).noCollision()));
    public static final Block FIR_HANGING_SIGN = registerBlock("fir_hanging_sign", new TerraformHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/fir"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/fir"), AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).noCollision()));
    public static final Block FIR_WALL_HANGING_SIGN = registerBlock("fir_wall_hanging_sign", new TerraformWallHangingSignBlock(Identifier.of(TLOTRMB, "entity/signs/hanging/fir"), Identifier.of(TLOTRMB, "textures/gui/hanging_signs/fir"), AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block FIR_TRAPDOOR = registerBlock("fir_trapdoor", new TrapdoorBlock(FIR_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque()));
    public static final Block FIR_DOOR = registerBlock("fir_door", new DoorBlock(FIR_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate", new PressurePlateBlock(FIR_SET_TYPE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block FIR_LEAVES = registerBlock("fir_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).nonOpaque().ticksRandomly()));
    public static final Block FIR_SAPLING = registerBlock("fir_sapling", new SaplingBlock(ModMisc.FIR_SAPLING_GENERATOR, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision().nonOpaque().ticksRandomly()));


    public static Block registerLogBlock(MapColor topMapColor, MapColor sideMapColor, String name) {

        return Registry.register(Registries.BLOCK, Identifier.of(TLOTRMB, name), new PillarBlock(AbstractBlock.Settings.create().mapColor((state) -> {
            return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    }

    public static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TLOTRMB, name), block);
    }

    public static void onInitialize() {

        ((BushBlock)BLACKBERRY_BUSH_BLOCK).setPickStack(BLACKBERRY_ITEM);

        LOGGER.info("The Lord of The Rings Mod: Biomes mod blocks initialized.");
    }

}
