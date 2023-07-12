package net.grace.motleysmusicdiscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.grace.motleysmusicdiscs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.IdentityHashMap;

public class ModItems {

    public static final Item ALLEYESONME_MUSICDISC = registerItem("alleyesonme_musicdisc",
            new MusicDiscItem(9, ModSounds.ALLEYESONME, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 216));
    public static final Item KOKOMO_MUSICDISC = registerItem("kokomo_musicdisc",
            new MusicDiscItem(9, ModSounds.KOKOMO, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 214));
    public static final Item UNDERPRESSURE_MUSICDISC = registerItem("underpressure_musicdisc",
            new MusicDiscItem(9, ModSounds.UNDERPRESSURE, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 243));
    public static final Item BUTTERCUP_MUSICDISC = registerItem("buttercup_musicdisc",
            new MusicDiscItem(9, ModSounds.BUTTERCUP, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 201));
    public static final Item WAP_MUSICDISC = registerItem("wap_musicdisc",
            new MusicDiscItem(9, ModSounds.WAP, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 188));
    public static final Item BODIES_MUSICDISC = registerItem("bodies_musicdisc",
            new MusicDiscItem(9, ModSounds.BODIES, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 200));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MotleysMusicDiscs.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MotleysMusicDiscs.LOGGER.info("Registering Mod Items for " + MotleysMusicDiscs.MOD_ID);

    }
}
