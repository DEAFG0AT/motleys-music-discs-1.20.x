package net.grace.motleysmusicdiscs;

import net.fabricmc.api.ModInitializer;

import net.grace.motleysmusicdiscs.item.ModItemGroup;
import net.grace.motleysmusicdiscs.item.ModItems;
import net.grace.motleysmusicdiscs.sound.ModSounds;
import net.grace.motleysmusicdiscs.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotleysMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "motleys-music-discs";
    public static final Logger LOGGER = LoggerFactory.getLogger("motleys-music-discs");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();

		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();
	}
}