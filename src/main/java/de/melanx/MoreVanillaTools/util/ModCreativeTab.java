package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.compat.FarmersDelightCompat;
import de.melanx.MoreVanillaTools.items.KnifeBase;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.moddingx.libx.annotation.registration.RegisterClass;

@RegisterClass(registry = "CREATIVE_MODE_TAB")
public class ModCreativeTab {

    public static final CreativeModeTab morevanillatoolsTab = CreativeModeTab.builder()
            .title(Component.literal("MoreVanillaTools"))
            .icon(() -> new ItemStack(ModItems.redstonePickaxe))
            .displayItems((enabledFlags, output) -> {
                boolean knives = FarmersDelightCompat.isFarmersDelightLoaded();

                BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
                    if (item instanceof KnifeBase && !knives) {
                        return;
                    }

                    if (MoreVanillaTools.getInstance().modid.equals(BuiltInRegistries.ITEM.getKey(item).getNamespace())) {
                        output.accept(new ItemStack(item));
                    }
                });
            })
            .build();
}
