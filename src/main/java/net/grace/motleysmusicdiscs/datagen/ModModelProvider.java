package net.grace.motleysmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.grace.motleysmusicdiscs.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ALLEYESONME_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KOKOMO_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNDERPRESSURE_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTERCUP_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAP_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BODIES_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTOFGLASS_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVERYBODY_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALLSTAR_MUSICDISC, Models.GENERATED);
    }
}
