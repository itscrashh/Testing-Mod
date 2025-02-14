package net.ilyas.testingmod;

import net.fabricmc.api.ModInitializer;

import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.item.ModItemGroups;
import net.ilyas.testingmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingMod implements ModInitializer {
	public static final String MOD_ID = "testingmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}