package net.ilyas.testingmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.component.ModDataComponentTypes;
import net.ilyas.testingmod.item.ModItemGroups;
import net.ilyas.testingmod.item.ModItems;
import net.ilyas.testingmod.util.HammerUsageEvent;
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
		ModDataComponentTypes.registerDataComponentTypes();
		LOGGER.info("Hello Fabric world!");

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}