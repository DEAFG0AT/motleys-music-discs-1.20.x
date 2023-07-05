package net.grace.motleysmusicdiscs;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotleysMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "motleys-music-discs";
    public static final Logger LOGGER = LoggerFactory.getLogger("motleys-music-discs");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}