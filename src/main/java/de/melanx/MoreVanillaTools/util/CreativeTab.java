package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.NonNullList;

import javax.annotation.Nonnull;

public class CreativeTab extends ItemGroup {

    public CreativeTab() {
        super(MoreVanillaTools.MODID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Registry.REDSTONE_PICKAXE.get());
    }
}
