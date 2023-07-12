package net.grace.motleysmusicdiscs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MotleysMusicDiscs.MOD_ID, "disc_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.disc_group"))
                    .icon(() -> new ItemStack(ModItems.ALLEYESONME_MUSICDISC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ALLEYESONME_MUSICDISC);
                        entries.add(ModItems.KOKOMO_MUSICDISC);
                        entries.add(ModItems.UNDERPRESSURE_MUSICDISC);

                    }).build());



    public static void registerItemGroups() {
        MotleysMusicDiscs.LOGGER.info("Registering Item Groups for " + MotleysMusicDiscs.MOD_ID);
    }
}
