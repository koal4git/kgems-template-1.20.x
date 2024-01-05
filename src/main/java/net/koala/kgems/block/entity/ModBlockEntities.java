package net.koala.kgems.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.koala.kgems.KGems;
import net.koala.kgems.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<GemPolishingStationBlockEntity> GEM_POLISHING_STATION_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(KGems.MOD_ID, "gem_polishing_be"),
                    FabricBlockEntityTypeBuilder.create(GemPolishingStationBlockEntity::new,
                            ModBlocks.GEM_POLISHING_STATION).build());

    public static void RegisterBlockEntities() {
        KGems.LOGGER.info("Registering Block Entities for " + KGems.MOD_ID);
    }
}