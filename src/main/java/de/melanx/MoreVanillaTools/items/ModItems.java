package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.items.lapis.*;
import de.melanx.MoreVanillaTools.items.obsidian.*;
import de.melanx.MoreVanillaTools.items.redstone.*;
import de.melanx.MoreVanillaTools.items.coal.*;
import de.melanx.MoreVanillaTools.items.glowstone.*;
import net.minecraft.item.Item;

public class ModItems {

    public static Item redstone_sword;
    public static Item redstone_axe;
    public static Item redstone_pickaxe;
    public static Item redstone_shovel;
    public static Item redstone_hoe;

    public static Item lapis_sword;
    public static Item lapis_axe;
    public static Item lapis_pickaxe;
    public static Item lapis_shovel;
    public static Item lapis_hoe;

    public static Item obsidian_sword;
    public static Item obsidian_axe;
    public static Item obsidian_pickaxe;
    public static Item obsidian_shovel;
    public static Item obsidian_hoe;

    public static Item coal_sword;
    public static Item coal_axe;
    public static Item coal_pickaxe;
    public static Item coal_shovel;
    public static Item coal_hoe;

    public static Item glowstone_sword;
    public static Item glowstone_axe;
    public static Item glowstone_pickaxe;
    public static Item glowstone_shovel;
    public static Item glowstone_hoe;


    public static void init() {
        redstone_sword = new RedstoneSword();
        redstone_axe = new RedstoneAxe();
        redstone_pickaxe = new RedstonePickaxe();
        redstone_shovel = new RedstoneShovel();
        redstone_hoe = new RedstoneHoe();

        lapis_sword = new LapisSword();
        lapis_axe = new LapisAxe();
        lapis_pickaxe = new LapisPickaxe();
        lapis_shovel = new LapisShovel();
        lapis_hoe = new LapisHoe();

        obsidian_sword = new ObsidianSword();
        obsidian_axe = new ObsidianAxe();
        obsidian_pickaxe = new ObsidianPickaxe();
        obsidian_shovel = new ObsidianShovel();
        obsidian_hoe = new ObsidianHoe();

        coal_sword = new CoalSword();
        coal_axe = new CoalAxe();
        coal_pickaxe = new CoalPickaxe();
        coal_shovel = new CoalShovel();
        coal_hoe = new CoalHoe();

        glowstone_sword = new GlowstoneSword();
        glowstone_axe = new GlowstoneAxe();
        glowstone_pickaxe = new GlowstonePickaxe();
        glowstone_shovel = new GlowstoneShovel();
        glowstone_hoe = new GlowstoneHoe();

    }

}
