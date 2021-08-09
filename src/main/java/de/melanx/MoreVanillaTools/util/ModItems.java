package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ObsidianPickaxe;
import de.melanx.MoreVanillaTools.items.SwordBase;
import de.melanx.morevanillalib.api.BaseToolItem;
import de.melanx.morevanillalib.api.normal.ToolMaterials;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;

@RegisterClass
public class ModItems {

    @SuppressWarnings("ConstantConditions")
    public static final Item boneSword = new SwordBase(ToolMaterials.BONE, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item boneAxe = new BaseToolItem(ToolMaterials.BONE, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item bonePickaxe = new BaseToolItem(ToolMaterials.BONE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item boneShovel = new BaseToolItem(ToolMaterials.BONE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item boneHoe = new BaseToolItem(ToolMaterials.BONE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item coalSword = new SwordBase(ToolMaterials.COAL, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalAxe = new BaseToolItem(ToolMaterials.COAL, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalPickaxe = new BaseToolItem(ToolMaterials.COAL, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalShovel = new BaseToolItem(ToolMaterials.COAL, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item coalHoe = new BaseToolItem(ToolMaterials.COAL, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item emeraldSword = new SwordBase(ToolMaterials.EMERALD, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldAxe = new BaseToolItem(ToolMaterials.EMERALD, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldPickaxe = new BaseToolItem(ToolMaterials.EMERALD, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldShovel = new BaseToolItem(ToolMaterials.EMERALD, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item emeraldHoe = new BaseToolItem(ToolMaterials.EMERALD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item enderSword = new SwordBase(ToolMaterials.ENDER, 0, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderAxe = new BaseToolItem(ToolMaterials.ENDER, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderPickaxe = new BaseToolItem(ToolMaterials.ENDER, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderShovel = new BaseToolItem(ToolMaterials.ENDER, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item enderHoe = new BaseToolItem(ToolMaterials.ENDER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item fierySword = new SwordBase(ToolMaterials.FIERY, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryAxe = new BaseToolItem(ToolMaterials.FIERY, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryPickaxe = new BaseToolItem(ToolMaterials.FIERY, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryShovel = new BaseToolItem(ToolMaterials.FIERY, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item fieryHoe = new BaseToolItem(ToolMaterials.FIERY, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item glowstoneSword = new SwordBase(ToolMaterials.GLOWSTONE, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstoneAxe = new BaseToolItem(ToolMaterials.GLOWSTONE, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstonePickaxe = new BaseToolItem(ToolMaterials.GLOWSTONE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstoneShovel = new BaseToolItem(ToolMaterials.GLOWSTONE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item glowstoneHoe = new BaseToolItem(ToolMaterials.GLOWSTONE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item lapisSword = new SwordBase(ToolMaterials.LAPIS, 3, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisAxe = new BaseToolItem(ToolMaterials.LAPIS, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisPickaxe = new BaseToolItem(ToolMaterials.LAPIS, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisShovel = new BaseToolItem(ToolMaterials.LAPIS, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item lapisHoe = new BaseToolItem(ToolMaterials.LAPIS, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item netherSword = new SwordBase(ToolMaterials.NETHER, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherAxe = new BaseToolItem(ToolMaterials.NETHER, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherPickaxe = new BaseToolItem(ToolMaterials.NETHER, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherShovel = new BaseToolItem(ToolMaterials.NETHER, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item netherHoe = new BaseToolItem(ToolMaterials.NETHER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item obsidianSword = new SwordBase(ToolMaterials.OBSIDIAN, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianAxe = new BaseToolItem(ToolMaterials.OBSIDIAN, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianPickaxe = new ObsidianPickaxe(ToolMaterials.OBSIDIAN, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianShovel = new BaseToolItem(ToolMaterials.OBSIDIAN, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item obsidianHoe = new BaseToolItem(ToolMaterials.OBSIDIAN, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item paperSword = new SwordBase(ToolMaterials.PAPER, 3, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperAxe = new BaseToolItem(ToolMaterials.PAPER, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperPickaxe = new BaseToolItem(ToolMaterials.PAPER, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperShovel = new BaseToolItem(ToolMaterials.PAPER, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item paperHoe = new BaseToolItem(ToolMaterials.PAPER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item prismarineSword = new SwordBase(ToolMaterials.PRISMARINE, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarineAxe = new BaseToolItem(ToolMaterials.PRISMARINE, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarinePickaxe = new BaseToolItem(ToolMaterials.PRISMARINE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarineShovel = new BaseToolItem(ToolMaterials.PRISMARINE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item prismarineHoe = new BaseToolItem(ToolMaterials.PRISMARINE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item quartzSword = new SwordBase(ToolMaterials.QUARTZ, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzAxe = new BaseToolItem(ToolMaterials.QUARTZ, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzPickaxe = new BaseToolItem(ToolMaterials.QUARTZ, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzShovel = new BaseToolItem(ToolMaterials.QUARTZ, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item quartzHoe = new BaseToolItem(ToolMaterials.QUARTZ, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item redstoneSword = new SwordBase(ToolMaterials.REDSTONE, 3, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstoneAxe = new BaseToolItem(ToolMaterials.REDSTONE, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstonePickaxe = new BaseToolItem(ToolMaterials.REDSTONE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstoneShovel = new BaseToolItem(ToolMaterials.REDSTONE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item redstoneHoe = new BaseToolItem(ToolMaterials.REDSTONE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));

    public static final Item slimeSword = new SwordBase(ToolMaterials.SLIME, 2, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimeAxe = new BaseToolItem(ToolMaterials.SLIME, BlockTags.MINEABLE_WITH_AXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimePickaxe = new BaseToolItem(ToolMaterials.SLIME, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimeShovel = new BaseToolItem(ToolMaterials.SLIME, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
    public static final Item slimeHoe = new BaseToolItem(ToolMaterials.SLIME, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().tab(MoreVanillaTools.getInstance().tab));
}
