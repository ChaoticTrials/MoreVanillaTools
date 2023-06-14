package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import org.moddingx.libx.annotation.registration.RegisterClass;

@RegisterClass(registry = "CREATIVE_MODE_TAB")
public class ModCreativeTab {

    public static final CreativeModeTab morevanillatoolsTab = CreativeModeTab.builder()
            .title(Component.literal("MoreVanillaTools"))
            .icon(() -> new ItemStack(ModItems.redstonePickaxe))
            .displayItems((enabledFlags, output) -> {
                ForgeRegistries.ITEMS.getValues().forEach(item -> {
                    //noinspection DataFlowIssue
                    if (MoreVanillaTools.getInstance().modid.equals(ForgeRegistries.ITEMS.getKey(item).getNamespace())) {
                        output.accept(new ItemStack(item));
                    }
                });
            })
            .build();
}
