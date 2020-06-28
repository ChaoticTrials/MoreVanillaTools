package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.MoreVanillaTools.items.materials.*;
import de.melanx.morevanillalib.api.ToolMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreVanillaTools.MODID);

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword", () -> new SwordBase(ToolMaterials.BONE, 2, -2.6F));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe", () -> new AxeBase(ToolMaterials.BONE, 6, -3.4F));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () -> new PickaxeBase(ToolMaterials.BONE, 0, -3));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel", () -> new ShovelBase(ToolMaterials.BONE, 1.5F, -3.2F));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe", () -> new HoeBase(ToolMaterials.BONE, -2));

    public static final RegistryObject<Item> COAL_SWORD = ITEMS.register("coal_sword", () -> new SwordBase(ToolMaterials.COAL, 2, -2.6F));
    public static final RegistryObject<Item> COAL_AXE = ITEMS.register("coal_axe", () -> new AxeBase(ToolMaterials.COAL, 6, -3.4F));
    public static final RegistryObject<Item> COAL_PICKAXE = ITEMS.register("coal_pickaxe", CoalPickaxe::new);
    public static final RegistryObject<Item> COAL_SHOVEL = ITEMS.register("coal_shovel", () -> new ShovelBase(ToolMaterials.COAL, 1.5F, -3.2F));
    public static final RegistryObject<Item> COAL_HOE = ITEMS.register("coal_hoe", () -> new HoeBase(ToolMaterials.COAL, -2));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordBase(ToolMaterials.EMERALD, 2, -2.4F));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeBase(ToolMaterials.EMERALD, 4, -2.8F));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", EmeraldPickaxe::new);
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelBase(ToolMaterials.EMERALD, 1, -3));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeBase(ToolMaterials.EMERALD, 0));

    public static final RegistryObject<Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new SwordBase(ToolMaterials.ENDER, 0, -2.4F));
    public static final RegistryObject<Item> ENDER_AXE = ITEMS.register("ender_axe", () -> new AxeBase(ToolMaterials.ENDER, 3, -3.1F));
    public static final RegistryObject<Item> ENDER_PICKAXE = ITEMS.register("ender_pickaxe", () -> new PickaxeBase(ToolMaterials.ENDER, -1, -2.8F));
    public static final RegistryObject<Item> ENDER_SHOVEL = ITEMS.register("ender_shovel", () -> new ShovelBase(ToolMaterials.ENDER, -0.5F, -3));
    public static final RegistryObject<Item> ENDER_HOE = ITEMS.register("ender_hoe", () -> new HoeBase(ToolMaterials.ENDER, -2));

    public static final RegistryObject<Item> FIERY_SWORD = ITEMS.register("fiery_sword", () -> new SwordBase(ToolMaterials.FIERY, 2, -2.4F));
    public static final RegistryObject<Item> FIERY_AXE = ITEMS.register("fiery_axe", () -> new AxeBase(ToolMaterials.FIERY, 5, -3.1F));
    public static final RegistryObject<Item> FIERY_PICKAXE = ITEMS.register("fiery_pickaxe", () -> new PickaxeBase(ToolMaterials.FIERY, 1, -2.8F));
    public static final RegistryObject<Item> FIERY_SHOVEL = ITEMS.register("fiery_shovel", () -> new ShovelBase(ToolMaterials.FIERY, 1.5F, -3));
    public static final RegistryObject<Item> FIERY_HOE = ITEMS.register("fiery_hoe", () -> new HoeBase(ToolMaterials.FIERY, -2));

    public static final RegistryObject<Item> GLOWSTONE_SWORD = ITEMS.register("glowstone_sword", () -> new SwordBase(ToolMaterials.GLOWSTONE, 2, -2.2F));
    public static final RegistryObject<Item> GLOWSTONE_AXE = ITEMS.register("glowstone_axe", () -> new AxeBase(ToolMaterials.GLOWSTONE, 6, -3));
    public static final RegistryObject<Item> GLOWSTONE_PICKAXE = ITEMS.register("glowstone_pickaxe", () -> new PickaxeBase(ToolMaterials.GLOWSTONE, 0, -2.6F));
    public static final RegistryObject<Item> GLOWSTONE_SHOVEL = ITEMS.register("glowstone_shovel", () -> new ShovelBase(ToolMaterials.GLOWSTONE, 0.5F, -2.8F));
    public static final RegistryObject<Item> GLOWSTONE_HOE = ITEMS.register("glowstone_hoe", () -> new HoeBase(ToolMaterials.GLOWSTONE, -2));

    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordBase(ToolMaterials.LAPIS, 3, -2.4F));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeBase(ToolMaterials.LAPIS, 6, 2.8F));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", LapisPickaxe::new);
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelBase(ToolMaterials.LAPIS, 1.5F, -3));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeBase(ToolMaterials.LAPIS, -1.2F));

    public static final RegistryObject<Item> NETHER_SWORD = ITEMS.register("nether_sword", () -> new SwordBase(ToolMaterials.NETHER, 2, -2.4F));
    public static final RegistryObject<Item> NETHER_AXE = ITEMS.register("nether_axe", () -> new AxeBase(ToolMaterials.NETHER, 5, -3.2F));
    public static final RegistryObject<Item> NETHER_PICKAXE = ITEMS.register("nether_pickaxe", () -> new PickaxeBase(ToolMaterials.NETHER, 3, -2.8F));
    public static final RegistryObject<Item> NETHER_SHOVEL = ITEMS.register("nether_shovel", () -> new ShovelBase(ToolMaterials.NETHER, 3.5F, -3));
    public static final RegistryObject<Item> NETHER_HOE = ITEMS.register("nether_hoe", () -> new HoeBase(ToolMaterials.NETHER, -2));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordBase(ToolMaterials.OBSIDIAN, 2, -2.6F));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeBase(ToolMaterials.OBSIDIAN, 6, -3.4F));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelBase(ToolMaterials.OBSIDIAN, 0.5F, -3.2F));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeBase(ToolMaterials.OBSIDIAN, -2));

    public static final RegistryObject<Item> PAPER_SWORD = ITEMS.register("paper_sword", () -> new SwordBase(ToolMaterials.PAPER, 3, -2.4F));
    public static final RegistryObject<Item> PAPER_AXE = ITEMS.register("paper_axe", () -> new AxeBase(ToolMaterials.PAPER, 6, -3.2F));
    public static final RegistryObject<Item> PAPER_PICKAXE = ITEMS.register("paper_pickaxe", () -> new PickaxeBase(ToolMaterials.PAPER, 1, -2.8F));
    public static final RegistryObject<Item> PAPER_SHOVEL = ITEMS.register("paper_shovel", () -> new ShovelBase(ToolMaterials.PAPER, 1.5F, -3));
    public static final RegistryObject<Item> PAPER_HOE = ITEMS.register("paper_hoe", () -> new HoeBase(ToolMaterials.PAPER, -3));

    public static final RegistryObject<Item> PRISMARINE_SWORD = ITEMS.register("prismarine_sword", () -> new SwordBase(ToolMaterials.PRISMARINE, 2, -2.4F));
    public static final RegistryObject<Item> PRISMARINE_AXE = ITEMS.register("prismarine_axe", () -> new AxeBase(ToolMaterials.PRISMARINE, 5, -3));
    public static final RegistryObject<Item> PRISMARINE_PICKAXE = ITEMS.register("prismarine_pickaxe", () -> new PickaxeBase(ToolMaterials.PRISMARINE, 1, -2.7F));
    public static final RegistryObject<Item> PRISMARINE_SHOVEL = ITEMS.register("prismarine_shovel", () -> new ShovelBase(ToolMaterials.PRISMARINE, 1.5F, -3));
    public static final RegistryObject<Item> PRISMARINE_HOE = ITEMS.register("prismarine_hoe", () -> new HoeBase(ToolMaterials.PRISMARINE, -2));

    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordBase(ToolMaterials.QUARTZ, 2, -2.6F));
    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeBase(ToolMaterials.QUARTZ, 6, -3.4F));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", QuartzPickaxe::new);
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelBase(ToolMaterials.QUARTZ, 1.5F, -3.2F));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeBase(ToolMaterials.QUARTZ, -2));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordBase(ToolMaterials.REDSTONE, 3, -2.4F));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeBase(ToolMaterials.REDSTONE, 6, -3.1F));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", RedstonePickaxe::new);
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelBase(ToolMaterials.REDSTONE, 1.5F, -3));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeBase(ToolMaterials.REDSTONE, -1.2F));

    public static final RegistryObject<Item> SLIME_SWORD = ITEMS.register("slime_sword", () -> new SwordBase(ToolMaterials.SLIME, 2, -2.4F));
    public static final RegistryObject<Item> SLIME_AXE = ITEMS.register("slime_axe", () -> new AxeBase(ToolMaterials.SLIME, 5, -2.9F));
    public static final RegistryObject<Item> SLIME_PICKAXE = ITEMS.register("slime_pickaxe", () -> new PickaxeBase(ToolMaterials.SLIME, 1, -2.6F));
    public static final RegistryObject<Item> SLIME_SHOVEL = ITEMS.register("slime_shovel", () -> new ShovelBase(ToolMaterials.SLIME, 1.3F, -3));
    public static final RegistryObject<Item> SLIME_HOE = ITEMS.register("slime_hoe", () -> new HoeBase(ToolMaterials.SLIME, -2));

    public static void registerTools() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
