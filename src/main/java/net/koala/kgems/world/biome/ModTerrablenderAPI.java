package net.koala.kgems.world.biome;

import net.fabricmc.api.ModInitializer;
import net.koala.kgems.KGems;
import net.koala.kgems.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverWorldRegion(new Identifier(KGems.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, KGems.MOD_ID, ModMaterialRules.makeRules());
    }

}
