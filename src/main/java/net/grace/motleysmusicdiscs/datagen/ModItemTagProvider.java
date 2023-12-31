package net.grace.motleysmusicdiscs.datagen;

import io.netty.util.concurrent.CompleteFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.grace.motleysmusicdiscs.item.ModItems;
import net.grace.motleysmusicdiscs.sound.ModSounds;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);


    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.ALLEYESONME_MUSICDISC, ModItems.KOKOMO_MUSICDISC, ModItems.UNDERPRESSURE_MUSICDISC, ModItems.BUTTERCUP_MUSICDISC, ModItems.WAP_MUSICDISC, ModItems.BODIES_MUSICDISC, ModItems.HEARTOFGLASS_MUSICDISC, ModItems.EVERYBODY_MUSICDISC, ModItems.ALLSTAR_MUSICDISC);
    }
}
