package net.koala.kgems.entity.client;

import net.koala.kgems.KGems;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(KGems.MOD_ID, "porcupine"), "main");
}
