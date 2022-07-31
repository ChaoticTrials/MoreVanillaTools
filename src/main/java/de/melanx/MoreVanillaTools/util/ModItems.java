package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.*;
import net.minecraft.world.item.Item;
import org.moddingx.libx.annotation.registration.RegisterClass;
import org.moddingx.libx.base.ItemBase;

@RegisterClass(registry = "ITEM_REGISTRY")
public class ModItems {

    @SuppressWarnings("ConstantConditions")
    public static final Item boneSword = new SwordBase(ToolMaterials.BONE, 0, -2.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item boneShovel = new ShovelBase(ToolMaterials.BONE, -3.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item bonePickaxe = new PickaxeBase(ToolMaterials.BONE, -0.5f, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item boneAxe = new AxeBase(ToolMaterials.BONE, 2.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item boneHoe = new HoeBase(ToolMaterials.BONE, -3.5f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item coalSword = new SwordBase(ToolMaterials.COAL, 0, -2.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalShovel = new ShovelBase(ToolMaterials.COAL, -1.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalPickaxe = new PickaxeBase(ToolMaterials.COAL, 1.5f, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalAxe = new AxeBase(ToolMaterials.COAL, 4.0f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalHoe = new HoeBase(ToolMaterials.COAL, -2.5f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item copperSword = new SwordBase(ToolMaterials.COPPER, 0, -2.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item copperShovel = new ShovelBase(ToolMaterials.COPPER, -1.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item copperPickaxe = new PickaxeBase(ToolMaterials.COPPER, -0.5f, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item copperAxe = new AxeBase(ToolMaterials.COPPER, 1.0f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item copperHoe = new HoeBase(ToolMaterials.COPPER, -1.0f, -1.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item emeraldSword = new SwordBase(ToolMaterials.EMERALD, -2, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldShovel = new ShovelBase(ToolMaterials.EMERALD, -3.6f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldPickaxe = new PickaxeBase(ToolMaterials.EMERALD, -4.2f, -2.9f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldAxe = new AxeBase(ToolMaterials.EMERALD, 1.0f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldHoe = new HoeBase(ToolMaterials.EMERALD, -7.2f, -1.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item enderSword = new SwordBase(ToolMaterials.ENDER, -2, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderShovel = new ShovelBase(ToolMaterials.ENDER, -3.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderPickaxe = new PickaxeBase(ToolMaterials.ENDER, -3.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderAxe = new AxeBase(ToolMaterials.ENDER, -2.5f, -3.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderHoe = new HoeBase(ToolMaterials.ENDER, -6.3f, -1.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item fierySword = new SwordBase(ToolMaterials.FIERY, -2, -2.5f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryShovel = new ShovelBase(ToolMaterials.FIERY, -2.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryPickaxe = new PickaxeBase(ToolMaterials.FIERY, -3.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryAxe = new AxeBase(ToolMaterials.FIERY, -2.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryHoe = new HoeBase(ToolMaterials.FIERY, -6.0f, -1.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item glowstoneSword = new SwordBase(ToolMaterials.GLOWSTONE, -3, -1.5f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstoneShovel = new ShovelBase(ToolMaterials.GLOWSTONE, -1.5f, -2.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstonePickaxe = new PickaxeBase(ToolMaterials.GLOWSTONE, -2.0f, -1.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstoneAxe = new AxeBase(ToolMaterials.GLOWSTONE, -1.0f, -2.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstoneHoe = new HoeBase(ToolMaterials.GLOWSTONE, -5.0f, 0.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item lapisSword = new SwordBase(ToolMaterials.LAPIS, 1, -2.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisShovel = new ShovelBase(ToolMaterials.LAPIS, -0.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisPickaxe = new PickaxeBase(ToolMaterials.LAPIS, -1.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisAxe = new AxeBase(ToolMaterials.LAPIS, 5.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisHoe = new HoeBase(ToolMaterials.LAPIS, -3.0f, -2.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item netherSword = new SwordBase(ToolMaterials.NETHER, 1, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherShovel = new ShovelBase(ToolMaterials.NETHER, -1.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherPickaxe = new PickaxeBase(ToolMaterials.NETHER, -1.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherAxe = new AxeBase(ToolMaterials.NETHER, 4.5f, -3.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherHoe = new HoeBase(ToolMaterials.NETHER, -2.5f, -2.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item obsidianSword = new SwordBase(ToolMaterials.OBSIDIAN, -2, -3.5f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianShovel = new ShovelBase(ToolMaterials.OBSIDIAN, -5.5f, -3.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianPickaxe = new PickaxeBase(ToolMaterials.OBSIDIAN, -5.0f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianAxe = new AxeBase(ToolMaterials.OBSIDIAN, 1.0f, -3.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianHoe = new HoeBase(ToolMaterials.OBSIDIAN, -6.5f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item paperSword = new SwordBase(ToolMaterials.PAPER, 1, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperShovel = new ShovelBase(ToolMaterials.PAPER, 0.0f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperPickaxe = new PickaxeBase(ToolMaterials.PAPER, 0.5f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperAxe = new AxeBase(ToolMaterials.PAPER, 2.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperHoe = new HoeBase(ToolMaterials.PAPER, -0.5f, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item prismarineSword = new SwordBase(ToolMaterials.PRISMARINE, -2, -2.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarineShovel = new ShovelBase(ToolMaterials.PRISMARINE, -3.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarinePickaxe = new PickaxeBase(ToolMaterials.PRISMARINE, -4.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarineAxe = new AxeBase(ToolMaterials.PRISMARINE, 2.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarineHoe = new HoeBase(ToolMaterials.PRISMARINE, -6.0f, -2.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item quartzSword = new SwordBase(ToolMaterials.QUARTZ, -1, -2.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzShovel = new ShovelBase(ToolMaterials.QUARTZ, -3.5f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzPickaxe = new PickaxeBase(ToolMaterials.QUARTZ, -4.0f, -2.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzAxe = new AxeBase(ToolMaterials.QUARTZ, 2.0f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzHoe = new HoeBase(ToolMaterials.QUARTZ, -6.0f, -1.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item redstoneSword = new SwordBase(ToolMaterials.REDSTONE, 1, -2.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstoneShovel = new ShovelBase(ToolMaterials.REDSTONE, -0.5f, -3.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstonePickaxe = new PickaxeBase(ToolMaterials.REDSTONE, -1.0f, -2.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstoneAxe = new AxeBase(ToolMaterials.REDSTONE, 5.0f, -3.2f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstoneHoe = new HoeBase(ToolMaterials.REDSTONE, -3.0f, -2.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item slimeSword = new SwordBase(ToolMaterials.SLIME, -4, -0.6f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimeShovel = new ShovelBase(ToolMaterials.SLIME, -5.5f, -1.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimePickaxe = new PickaxeBase(ToolMaterials.SLIME, -6.0f, -0.8f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimeAxe = new AxeBase(ToolMaterials.SLIME, -1.0f, -1.4f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimeHoe = new HoeBase(ToolMaterials.SLIME, -7.0f, 0.0f, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item obsidianShard = new ItemBase(MoreVanillaTools.getInstance(), new Item.Properties());
}
