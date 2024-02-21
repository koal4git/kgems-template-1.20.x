package net.koala.kgems.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.koala.kgems.KGems;
import net.koala.kgems.entity.custom.DiceProjectileEntity;
import net.koala.kgems.entity.custom.PorcupineEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static void registerModEntities() {
        KGems.LOGGER.info("Registering Entities for " + KGems.MOD_ID);
    }

    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(KGems.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<DiceProjectileEntity> DICE_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(KGems.MOD_ID, "dice_projectile"),
            FabricEntityTypeBuilder.<DiceProjectileEntity>create(SpawnGroup.MISC, DiceProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

}
