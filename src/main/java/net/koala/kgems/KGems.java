package net.koala.kgems;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.koala.kgems.block.ModBlocks;
import net.koala.kgems.block.entity.ModBlockEntities;
import net.koala.kgems.datagen.ModWorldGenerator;
import net.koala.kgems.entity.ModBoats;
import net.koala.kgems.entity.ModEntities;
import net.koala.kgems.entity.custom.PorcupineEntity;
import net.koala.kgems.item.ModItemGroups;
import net.koala.kgems.item.ModItems;
import net.koala.kgems.recipe.ModRecipes;
import net.koala.kgems.screen.ModScreenHandlers;
import net.koala.kgems.sound.ModSounds;
import net.koala.kgems.util.ModCustomTrades;
import net.koala.kgems.util.ModLootTableModifiers;
import net.koala.kgems.villager.ModVillagers;
import net.koala.kgems.world.gen.ModWorldGeneration;
import net.koala.kgems.world.tree.ModTrunkPlacerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KGems implements ModInitializer {
    public static final String MOD_ID = "kgems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.registerSounds();

		ModBlockEntities.RegisterBlockEntities();
		ModScreenHandlers.registerScreenHandler();
		ModRecipes.registerRecipes();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 30, 60);

		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();
		ModTrunkPlacerTypes.register();

	}
}