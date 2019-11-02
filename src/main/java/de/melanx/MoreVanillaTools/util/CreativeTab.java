package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.NonNullList;

import javax.annotation.Nonnull;

public class CreativeTab extends ItemGroup {

    private NonNullList<ItemStack> list;

    public CreativeTab() {
        super(MoreVanillaTools.MODID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.redstone_pickaxe);
    }

    @Override
    public void fill(@Nonnull NonNullList<ItemStack> list) {
        this.list = list;

        addItem(ModItems.redstone_sword);
        addItem(ModItems.redstone_axe);
        addItem(ModItems.redstone_pickaxe);
        addItem(ModItems.redstone_shovel);
        addItem(ModItems.redstone_hoe);

        addItem(ModItems.lapis_sword);
        addItem(ModItems.lapis_axe);
        addItem(ModItems.lapis_pickaxe);
        addItem(ModItems.lapis_shovel);
        addItem(ModItems.lapis_hoe);

        addItem(ModItems.obsidian_sword);
        addItem(ModItems.obsidian_axe);
        addItem(ModItems.obsidian_pickaxe);
        addItem(ModItems.obsidian_shovel);
        addItem(ModItems.obsidian_hoe);

        addItem(ModItems.coal_sword);
        addItem(ModItems.coal_axe);
        addItem(ModItems.coal_pickaxe);
        addItem(ModItems.coal_shovel);
        addItem(ModItems.coal_hoe);

        addItem(ModItems.glowstone_sword);
        addItem(ModItems.glowstone_axe);
        addItem(ModItems.glowstone_pickaxe);
        addItem(ModItems.glowstone_shovel);
        addItem(ModItems.glowstone_hoe);

        addItem(ModItems.emerald_sword);
        addItem(ModItems.emerald_axe);
        addItem(ModItems.emerald_pickaxe);
        addItem(ModItems.emerald_shovel);
        addItem(ModItems.emerald_hoe);

        addItem(ModItems.quartz_sword);
        addItem(ModItems.quartz_axe);
        addItem(ModItems.quartz_pickaxe);
        addItem(ModItems.quartz_shovel);
        addItem(ModItems.quartz_hoe);

        addItem(ModItems.bone_sword);
        addItem(ModItems.bone_axe);
        addItem(ModItems.bone_pickaxe);
        addItem(ModItems.bone_shovel);
        addItem(ModItems.bone_hoe);

        addItem(ModItems.paper_sword);
        addItem(ModItems.paper_axe);
        addItem(ModItems.paper_pickaxe);
        addItem(ModItems.paper_shovel);
        addItem(ModItems.paper_hoe);
    }

    private void addItem(IItemProvider item) {
        item.asItem().fillItemGroup(this, list);
    }

}
