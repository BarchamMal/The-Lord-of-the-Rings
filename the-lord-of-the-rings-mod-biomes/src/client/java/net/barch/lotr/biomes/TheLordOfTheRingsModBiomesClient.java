package net.barch.lotr.biomes;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.barch.lotr.biomes.Blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

import static net.barch.lotr.biomes.TheLordOfTheRingsModBiomes.TLOTRMB;

public class TheLordOfTheRingsModBiomesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				ModBlocks.PLUM_DOOR, ModBlocks.PLUM_TRAPDOOR, ModBlocks.PLUM_SAPLING,
				ModBlocks.OLIVE_DOOR, ModBlocks.OLIVE_TRAPDOOR, ModBlocks.OLIVE_SAPLING,
				ModBlocks.ATHELAS, ModBlocks.ELANOR, ModBlocks.VIOLETS, ModBlocks.NIPHREDIL,
				ModBlocks.BLACKBERRY_BUSH_BLOCK);
		TerraformBoatClientHelper.registerModelLayers(Identifier.of(TLOTRMB, "plum"), false);
		TerraformBoatClientHelper.registerModelLayers(Identifier.of(TLOTRMB, "olive"), false);
	}
}