package net.koala.kgems;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.koala.kgems.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class KGemsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());
    }
}
