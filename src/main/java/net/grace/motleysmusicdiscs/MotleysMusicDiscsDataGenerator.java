package net.grace.motleysmusicdiscs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.grace.motleysmusicdiscs.datagen.ModItemTagProvider;
import net.grace.motleysmusicdiscs.datagen.ModModelProvider;

public class MotleysMusicDiscsDataGenerator implements DataGeneratorEntrypoint {

	// Implement ModItemTagProvider + ModModelProvider here
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
