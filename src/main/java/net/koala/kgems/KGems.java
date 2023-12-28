package net.koala.kgems;

import net.fabricmc.api.ModInitializer;

import net.koala.kgems.item.ModItemGroups;
import net.koala.kgems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KGems implements ModInitializer {
    public static final String MOD_ID = "kgems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}