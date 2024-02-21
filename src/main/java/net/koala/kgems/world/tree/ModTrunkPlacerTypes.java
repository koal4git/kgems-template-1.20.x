package net.koala.kgems.world.tree;

import net.koala.kgems.KGems;
import net.koala.kgems.mixin.TrunkPlacerTypeInvoker;
import net.koala.kgems.world.tree.custom.ChestnutTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> CHESTNUT_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("chestnut_trunk_placer", ChestnutTrunkPlacer.CODEC);

    public static void register(){
        KGems.LOGGER.info("Registering Trunk Placers for " + KGems.MOD_ID);
    }
}
