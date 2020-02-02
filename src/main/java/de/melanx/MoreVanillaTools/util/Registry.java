package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.MoreVanillaTools.items.materials.BoneAxe;
import de.melanx.MoreVanillaTools.items.materials.BoneSword;
import de.melanx.MoreVanillaTools.items.materials.CoalPickaxe;
import de.melanx.MoreVanillaTools.items.materials.EmeraldPickaxe;
import de.melanx.MoreVanillaTools.items.materials.GlowstonePickaxe;
import de.melanx.MoreVanillaTools.items.materials.LapisPickaxe;
import de.melanx.MoreVanillaTools.items.materials.ObsidianPickaxe;
import de.melanx.MoreVanillaTools.items.materials.QuartzPickaxe;
import de.melanx.MoreVanillaTools.items.materials.RedstonePickaxe;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreVanillaTools.MODID);

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword", BoneSword::new);
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe", BoneAxe::new);
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () -> new PickaxeBase(ItemTiers.BONE, 0, -3));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel", () -> new ShovelBase(ItemTiers.BONE, 1.5F, -3.2F));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe", () -> new HoeBase(ItemTiers.BONE, -2));

    public static final RegistryObject<Item> COAL_SWORD = ITEMS.register("coal_sword", () -> new SwordBase(ItemTiers.COAL, 2, -2.6F));
    public static final RegistryObject<Item> COAL_AXE = ITEMS.register("coal_axe", () -> new AxeBase(ItemTiers.COAL, 6, -3.4F));
    public static final RegistryObject<Item> COAL_PICKAXE = ITEMS.register("coal_pickaxe", CoalPickaxe::new);
    public static final RegistryObject<Item> COAL_SHOVEL = ITEMS.register("coal_shovel", () -> new ShovelBase(ItemTiers.COAL, 1.5F, -3.2F));
    public static final RegistryObject<Item> COAL_HOE = ITEMS.register("coal_hoe", () -> new HoeBase(ItemTiers.COAL, -2));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordBase(ItemTiers.EMERALD, 2, -2.4F));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeBase(ItemTiers.EMERALD, 4, -2.8F));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", EmeraldPickaxe::new);
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelBase(ItemTiers.EMERALD, 1, -3));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeBase(ItemTiers.EMERALD, 0));

    // TODO configure ender values
    public static final RegistryObject<Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new SwordBase(ItemTiers.ENDER, 2, -2.4F));
    public static final RegistryObject<Item> ENDER_AXE = ITEMS.register("ender_axe", () -> new AxeBase(ItemTiers.ENDER, 4, -2.8F));
    public static final RegistryObject<Item> ENDER_PICKAXE = ITEMS.register("ender_pickaxe", () -> new PickaxeBase(ItemTiers.ENDER, 4, -2));
    public static final RegistryObject<Item> ENDER_SHOVEL = ITEMS.register("ender_shovel", () -> new ShovelBase(ItemTiers.ENDER, 1, -3));
    public static final RegistryObject<Item> ENDER_HOE = ITEMS.register("ender_hoe", () -> new HoeBase(ItemTiers.ENDER, 0));

    // TODO configure fiery values
    public static final RegistryObject<Item> FIERY_SWORD = ITEMS.register("fiery_sword", () -> new SwordBase(ItemTiers.FIERY, 2, -2.4F)); // TODO add custom sword for killing magma cubes
    public static final RegistryObject<Item> FIERY_AXE = ITEMS.register("fiery_axe", () -> new AxeBase(ItemTiers.FIERY, 4, -2.8F));
    public static final RegistryObject<Item> FIERY_PICKAXE = ITEMS.register("fiery_pickaxe", () -> new PickaxeBase(ItemTiers.FIERY, 4, -2)); // TODO add custom pickaxe with auto-smelt
    public static final RegistryObject<Item> FIERY_SHOVEL = ITEMS.register("fiery_shovel", () -> new ShovelBase(ItemTiers.FIERY, 1, -3));
    public static final RegistryObject<Item> FIERY_HOE = ITEMS.register("fiery_hoe", () -> new HoeBase(ItemTiers.FIERY, -2));

    public static final RegistryObject<Item> GLOWSTONE_SWORD = ITEMS.register("glowstone_sword", () -> new SwordBase(ItemTiers.GLOWSTONE, 2, -2.2F));
    public static final RegistryObject<Item> GLOWSTONE_AXE = ITEMS.register("glowstone_axe", () -> new AxeBase(ItemTiers.GLOWSTONE, 6, -3));
    public static final RegistryObject<Item> GLOWSTONE_PICKAXE = ITEMS.register("glowstone_pickaxe", GlowstonePickaxe::new);
    public static final RegistryObject<Item> GLOWSTONE_SHOVEL = ITEMS.register("glowstone_shovel", () -> new ShovelBase(ItemTiers.GLOWSTONE, 0.5F, -2.8F));
    public static final RegistryObject<Item> GLOWSTONE_HOE = ITEMS.register("glowstone_hoe", () -> new HoeBase(ItemTiers.GLOWSTONE, -2));

    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordBase(ItemTiers.LAPIS, 3, -2.4F));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeBase(ItemTiers.LAPIS, 0, 2.8F));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", LapisPickaxe::new);
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelBase(ItemTiers.LAPIS, 1.5F, -3));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeBase(ItemTiers.LAPIS, -1.2F));

    // TODO configure nether values
    public static final RegistryObject<Item> NETHER_SWORD = ITEMS.register("nether_sword", () -> new SwordBase(ItemTiers.NETHER, 2, -2.4F));
    public static final RegistryObject<Item> NETHER_AXE = ITEMS.register("nether_axe", () -> new AxeBase(ItemTiers.NETHER, 4, -2.8F));
    public static final RegistryObject<Item> NETHER_PICKAXE = ITEMS.register("nether_pickaxe", () -> new PickaxeBase(ItemTiers.NETHER, 4, -2));
    public static final RegistryObject<Item> NETHER_SHOVEL = ITEMS.register("nether_shovel", () -> new ShovelBase(ItemTiers.NETHER, 1, -3));
    public static final RegistryObject<Item> NETHER_HOE = ITEMS.register("nether_hoe", () -> new HoeBase(ItemTiers.NETHER, 0));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordBase(ItemTiers.OBSIDIAN, 2, -2.6F));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeBase(ItemTiers.OBSIDIAN, 6, -3.4F));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelBase(ItemTiers.OBSIDIAN, 0.5F, -3.2F));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeBase(ItemTiers.OBSIDIAN, -2));

    public static final RegistryObject<Item> PAPER_SWORD = ITEMS.register("paper_sword", () -> new SwordBase(ItemTiers.PAPER, 3, -2.4F));
    public static final RegistryObject<Item> PAPER_AXE = ITEMS.register("paper_axe", () -> new AxeBase(ItemTiers.PAPER, 6, -3.2F));
    public static final RegistryObject<Item> PAPER_PICKAXE = ITEMS.register("paper_pickaxe", () -> new PickaxeBase(ItemTiers.PAPER, 1, -2.8F));
    public static final RegistryObject<Item> PAPER_SHOVEL = ITEMS.register("paper_shovel", () -> new ShovelBase(ItemTiers.PAPER, 1.5F, -3));
    public static final RegistryObject<Item> PAPER_HOE = ITEMS.register("paper_hoe", () -> new HoeBase(ItemTiers.PAPER, -3));

    // TODO configure prismarine values
    public static final RegistryObject<Item> PRISMARINE_SWORD = ITEMS.register("prismarine_sword", () -> new SwordBase(ItemTiers.PRISMARINE, 2, -2.4F));
    public static final RegistryObject<Item> PRISMARINE_AXE = ITEMS.register("prismarine_axe", () -> new AxeBase(ItemTiers.PRISMARINE, 4, -2.8F));
    public static final RegistryObject<Item> PRISMARINE_PICKAXE = ITEMS.register("prismarine_pickaxe", () -> new PickaxeBase(ItemTiers.PRISMARINE, 4, -2));
    public static final RegistryObject<Item> PRISMARINE_SHOVEL = ITEMS.register("prismarine_shovel", () -> new ShovelBase(ItemTiers.PRISMARINE, 1, -3));
    public static final RegistryObject<Item> PRISMARINE_HOE = ITEMS.register("prismarine_hoe", () -> new HoeBase(ItemTiers.PRISMARINE, 0));

    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordBase(ItemTiers.QUARTZ, 2, -2.6F));
    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeBase(ItemTiers.QUARTZ, 6, -3.4F));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", QuartzPickaxe::new);
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelBase(ItemTiers.QUARTZ, 1.5F, -3.2F));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeBase(ItemTiers.QUARTZ, -2));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordBase(ItemTiers.REDSTONE, 3, -2.4F));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeBase(ItemTiers.REDSTONE, 6, -3.1F));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", RedstonePickaxe::new);
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelBase(ItemTiers.REDSTONE, 1.5F, -3));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeBase(ItemTiers.REDSTONE, -1.2F));

    // TODO configure slime values
    public static final RegistryObject<Item> SLIME_SWORD = ITEMS.register("slime_sword", () -> new SwordBase(ItemTiers.SLIME, 2, -2.4F)); // TODO add custom sword for killing slimes
    public static final RegistryObject<Item> SLIME_AXE = ITEMS.register("slime_axe", () -> new AxeBase(ItemTiers.SLIME, 4, -2.8F));
    public static final RegistryObject<Item> SLIME_PICKAXE = ITEMS.register("slime_pickaxe", () -> new PickaxeBase(ItemTiers.SLIME, 4, -2));
    public static final RegistryObject<Item> SLIME_SHOVEL = ITEMS.register("slime_shovel", () -> new ShovelBase(ItemTiers.SLIME, 1, -3));
    public static final RegistryObject<Item> SLIME_HOE = ITEMS.register("slime_hoe", () -> new HoeBase(ItemTiers.SLIME, 0));

    public static void registerTools() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
