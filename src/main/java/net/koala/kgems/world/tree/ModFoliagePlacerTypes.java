package net.koala.kgems.world.tree;

import net.koala.kgems.KGems;
import net.koala.kgems.mixin.FoliagePlacerTypeInvoker;
import net.koala.kgems.world.tree.custom.ChestnutFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> CHESTNUT_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("chestnut_foliage_placer", ChestnutFoliagePlacer.CODEC);

    public static void register(){
        KGems.LOGGER.info("registering Foliage Placer for " + KGems.MOD_ID);
    }

}
