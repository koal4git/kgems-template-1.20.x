package net.koala.kgems;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.koala.kgems.block.ModBlocks;
import net.koala.kgems.block.entity.ModBlockEntities;
import net.koala.kgems.block.entity.renderer.GemPolishingStationBlockEntityRenderer;
import net.koala.kgems.entity.ModBoats;
import net.koala.kgems.entity.ModEntities;
import net.koala.kgems.entity.client.ModModelLayers;
import net.koala.kgems.entity.client.PorcupineModel;
import net.koala.kgems.entity.client.PorcupineRenderer;
import net.koala.kgems.screen.GemPolishingScreen;
import net.koala.kgems.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.SpriteIdentifier;

public class KGemsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DAHLIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DAHLIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHESTNUT_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);

        HandledScreens.register(ModScreenHandlers.GEM_POLISHING_SCREEN_HANDLER, GemPolishingScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.GEM_POLISHING_STATION_BLOCK_ENTITY, GemPolishingStationBlockEntityRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHESTNUT_LEAVES, RenderLayer.getCutout());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.CHESTNUT_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.CHESTNUT_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.CHESTNUT_BOAT_ID, false);

        EntityRendererRegistry.register(ModEntities.DICE_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
