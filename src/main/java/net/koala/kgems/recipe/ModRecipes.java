package net.koala.kgems.recipe;

import net.koala.kgems.KGems;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(KGems.MOD_ID, GemPolishingRecipe.Serializer.ID),
                GemPolishingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(KGems.MOD_ID, GemPolishingRecipe.Type.ID),
                GemPolishingRecipe.Type.INSTANCE);
    }
}