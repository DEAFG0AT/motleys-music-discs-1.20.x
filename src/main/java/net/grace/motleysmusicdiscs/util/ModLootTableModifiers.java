package net.grace.motleysmusicdiscs.util;

import com.mojang.datafixers.kinds.Const;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.grace.motleysmusicdiscs.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier ABANDONED_MINESHAFT_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft_chest");
    private static final Identifier ANCIENT_CITY_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/ancient_city_chest");
    private static final Identifier BASTION_BRIDGE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_bridge_chest");
    private static final Identifier BASTION_TREASURE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_treasure_chest");
    private static final Identifier BURIED_TREASURE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/buried_treasure_chest");
    private static final Identifier DESERT_PYRAMID_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/desert_pyramid_chest");
    private static final Identifier END_CITY_TREASURE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/end_city_treasure_chest");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier JUNGLE_TEMPLE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple_chest");
    private static final Identifier NETHER_BRIDGE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/nether_bridge_chest");
    private static final Identifier PILLAGER_OUTPOST_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/pillager_outpost_chest");
    private static final Identifier SHIPWRECK_SUPPLY_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_supply_chest");
    private static final Identifier SIMPLE_DUNGEON_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon_chest");
    private static final Identifier STRONGHOLD_CORRIDOR_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_corridor_chest");
    private static final Identifier WOODLAND_MANSION_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/woodland_mansion_chest");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (SIMPLE_DUNGEON_STRUCTURE_CHEST_ID.equals(id)) {
                // Adds a music disc to the simple dungeon loot table.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Spawns 100% of the time
                        .with(ItemEntry.builder(ModItems.ALLEYESONME_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}