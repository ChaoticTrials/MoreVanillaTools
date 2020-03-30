package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.MoreVanillaTools.items.materials.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class Registry {

    // Make use of object holders instead of direct references to ensure inter-mod comparability
    @ObjectHolder(MoreVanillaTools.MODID)
    // Using an inner class; injection of items would otherwise conflict with the static ITEMS field (thinking it's a registry object)
    public static class Items {
        public static final Item bone_sword = null;
        public static final Item bone_axe = null;
        public static final Item bone_pickaxe = null;
        public static final Item bone_shovel = null;
        public static final Item bone_hoe = null;

        public static final Item coal_sword = null;
        public static final Item coal_axe = null;
        public static final Item coal_pickaxe = null;
        public static final Item coal_shovel = null;
        public static final Item coal_hoe = null;

        public static final Item emerald_sword = null;
        public static final Item emerald_axe = null;
        public static final Item emerald_pickaxe = null;
        public static final Item emerald_shovel = null;
        public static final Item emerald_hoe = null;

        public static final Item ender_sword = null;
        public static final Item ender_axe = null;
        public static final Item ender_pickaxe = null;
        public static final Item ender_shovel = null;
        public static final Item ender_hoe = null;

        public static final Item fiery_sword = null;
        public static final Item fiery_axe = null;
        public static final Item fiery_pickaxe = null;
        public static final Item fiery_shovel = null;
        public static final Item fiery_hoe = null;

        public static final Item glowstone_sword = null;
        public static final Item glowstone_axe = null;
        public static final Item glowstone_pickaxe = null;
        public static final Item glowstone_shovel = null;
        public static final Item glowstone_hoe = null;

        public static final Item lapis_sword = null;
        public static final Item lapis_axe = null;
        public static final Item lapis_pickaxe = null;
        public static final Item lapis_shovel = null;
        public static final Item lapis_hoe = null;

        public static final Item nether_sword = null;
        public static final Item nether_axe = null;
        public static final Item nether_pickaxe = null;
        public static final Item nether_shovel = null;
        public static final Item nether_hoe = null;

        public static final Item obsidian_sword = null;
        public static final Item obsidian_axe = null;
        public static final Item obsidian_pickaxe = null;
        public static final Item obsidian_shovel = null;
        public static final Item obsidian_hoe = null;

        public static final Item paper_sword = null;
        public static final Item paper_axe = null;
        public static final Item paper_pickaxe = null;
        public static final Item paper_shovel = null;
        public static final Item paper_hoe = null;

        public static final Item prismarine_sword = null;
        public static final Item prismarine_axe = null;
        public static final Item prismarine_pickaxe = null;
        public static final Item prismarine_shovel = null;
        public static final Item prismarine_hoe = null;

        public static final Item quartz_sword = null;
        public static final Item quartz_axe = null;
        public static final Item quartz_pickaxe = null;
        public static final Item quartz_shovel = null;
        public static final Item quartz_hoe = null;

        public static final Item redstone_sword = null;
        public static final Item redstone_axe = null;
        public static final Item redstone_pickaxe = null;
        public static final Item redstone_shovel = null;
        public static final Item redstone_hoe = null;

        public static final Item slime_sword = null;
        public static final Item slime_axe = null;
        public static final Item slime_pickaxe = null;
        public static final Item slime_shovel = null;
        public static final Item slime_hoe = null;
    }

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreVanillaTools.MODID);

    public static void registerTools() {
        ITEMS.register("bone_sword", () -> new SwordBase(ItemTiers.BONE, 2, -2.6F));
        ITEMS.register("bone_axe", () -> new AxeBase(ItemTiers.BONE, 6, -3.4F));
        ITEMS.register("bone_pickaxe", () -> new PickaxeBase(ItemTiers.BONE, 0, -3));
        ITEMS.register("bone_shovel", () -> new ShovelBase(ItemTiers.BONE, 1.5F, -3.2F));
        ITEMS.register("bone_hoe", () -> new HoeBase(ItemTiers.BONE, -2));

        ITEMS.register("coal_sword", () -> new SwordBase(ItemTiers.COAL, 2, -2.6F));
        ITEMS.register("coal_axe", () -> new AxeBase(ItemTiers.COAL, 6, -3.4F));
        ITEMS.register("coal_pickaxe", CoalPickaxe::new);
        ITEMS.register("coal_shovel", () -> new ShovelBase(ItemTiers.COAL, 1.5F, -3.2F));
        ITEMS.register("coal_hoe", () -> new HoeBase(ItemTiers.COAL, -2));

        ITEMS.register("emerald_sword", () -> new SwordBase(ItemTiers.EMERALD, 2, -2.4F));
        ITEMS.register("emerald_axe", () -> new AxeBase(ItemTiers.EMERALD, 4, -2.8F));
        ITEMS.register("emerald_pickaxe", EmeraldPickaxe::new);
        ITEMS.register("emerald_shovel", () -> new ShovelBase(ItemTiers.EMERALD, 1, -3));
        ITEMS.register("emerald_hoe", () -> new HoeBase(ItemTiers.EMERALD, 0));

        ITEMS.register("ender_sword", () -> new SwordBase(ItemTiers.ENDER, 0, -2.4F));
        ITEMS.register("ender_axe", () -> new AxeBase(ItemTiers.ENDER, 3, -3.1F));
        ITEMS.register("ender_pickaxe", () -> new PickaxeBase(ItemTiers.ENDER, -1, -2.8F));
        ITEMS.register("ender_shovel", () -> new ShovelBase(ItemTiers.ENDER, -0.5F, -3));
        ITEMS.register("ender_hoe", () -> new HoeBase(ItemTiers.ENDER, -2));

        ITEMS.register("fiery_sword", () -> new SwordBase(ItemTiers.FIERY, 2, -2.4F));
        ITEMS.register("fiery_axe", () -> new AxeBase(ItemTiers.FIERY, 5, -3.1F));
        ITEMS.register("fiery_pickaxe", () -> new PickaxeBase(ItemTiers.FIERY, 1, -2.8F));
        ITEMS.register("fiery_shovel", () -> new ShovelBase(ItemTiers.FIERY, 1.5F, -3));
        ITEMS.register("fiery_hoe", () -> new HoeBase(ItemTiers.FIERY, -2));

        ITEMS.register("glowstone_sword", () -> new SwordBase(ItemTiers.GLOWSTONE, 2, -2.2F));
        ITEMS.register("glowstone_axe", () -> new AxeBase(ItemTiers.GLOWSTONE, 6, -3));
        ITEMS.register("glowstone_pickaxe", GlowstonePickaxe::new);
        ITEMS.register("glowstone_shovel", () -> new ShovelBase(ItemTiers.GLOWSTONE, 0.5F, -2.8F));
        ITEMS.register("glowstone_hoe", () -> new HoeBase(ItemTiers.GLOWSTONE, -2));

        ITEMS.register("lapis_sword", () -> new SwordBase(ItemTiers.LAPIS, 3, -2.4F));
        ITEMS.register("lapis_axe", () -> new AxeBase(ItemTiers.LAPIS, 6, 2.8F));
        ITEMS.register("lapis_pickaxe", LapisPickaxe::new);
        ITEMS.register("lapis_shovel", () -> new ShovelBase(ItemTiers.LAPIS, 1.5F, -3));
        ITEMS.register("lapis_hoe", () -> new HoeBase(ItemTiers.LAPIS, -1.2F));

        ITEMS.register("nether_sword", () -> new SwordBase(ItemTiers.NETHER, 2, -2.4F));
        ITEMS.register("nether_axe", () -> new AxeBase(ItemTiers.NETHER, 5, -3.2F));
        ITEMS.register("nether_pickaxe", () -> new PickaxeBase(ItemTiers.NETHER, 3, -2.8F));
        ITEMS.register("nether_shovel", () -> new ShovelBase(ItemTiers.NETHER, 3.5F, -3));
        ITEMS.register("nether_hoe", () -> new HoeBase(ItemTiers.NETHER, -2));

        ITEMS.register("obsidian_sword", () -> new SwordBase(ItemTiers.OBSIDIAN, 2, -2.6F));
        ITEMS.register("obsidian_axe", () -> new AxeBase(ItemTiers.OBSIDIAN, 6, -3.4F));
        ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
        ITEMS.register("obsidian_shovel", () -> new ShovelBase(ItemTiers.OBSIDIAN, 0.5F, -3.2F));
        ITEMS.register("obsidian_hoe", () -> new HoeBase(ItemTiers.OBSIDIAN, -2));

        ITEMS.register("paper_sword", () -> new SwordBase(ItemTiers.PAPER, 3, -2.4F));
        ITEMS.register("paper_axe", () -> new AxeBase(ItemTiers.PAPER, 6, -3.2F));
        ITEMS.register("paper_pickaxe", () -> new PickaxeBase(ItemTiers.PAPER, 1, -2.8F));
        ITEMS.register("paper_shovel", () -> new ShovelBase(ItemTiers.PAPER, 1.5F, -3));
        ITEMS.register("paper_hoe", () -> new HoeBase(ItemTiers.PAPER, -3));

        ITEMS.register("prismarine_sword", () -> new SwordBase(ItemTiers.PRISMARINE, 2, -2.4F));
        ITEMS.register("prismarine_axe", () -> new AxeBase(ItemTiers.PRISMARINE, 5, -3));
        ITEMS.register("prismarine_pickaxe", () -> new PickaxeBase(ItemTiers.PRISMARINE, 1, -2.7F));
        ITEMS.register("prismarine_shovel", () -> new ShovelBase(ItemTiers.PRISMARINE, 1.5F, -3));
        ITEMS.register("prismarine_hoe", () -> new HoeBase(ItemTiers.PRISMARINE, -2));

        ITEMS.register("quartz_sword", () -> new SwordBase(ItemTiers.QUARTZ, 2, -2.6F));
        ITEMS.register("quartz_axe", () -> new AxeBase(ItemTiers.QUARTZ, 6, -3.4F));
        ITEMS.register("quartz_pickaxe", QuartzPickaxe::new);
        ITEMS.register("quartz_shovel", () -> new ShovelBase(ItemTiers.QUARTZ, 1.5F, -3.2F));
        ITEMS.register("quartz_hoe", () -> new HoeBase(ItemTiers.QUARTZ, -2));

        ITEMS.register("redstone_sword", () -> new SwordBase(ItemTiers.REDSTONE, 3, -2.4F));
        ITEMS.register("redstone_axe", () -> new AxeBase(ItemTiers.REDSTONE, 6, -3.1F));
        ITEMS.register("redstone_pickaxe", RedstonePickaxe::new);
        ITEMS.register("redstone_shovel", () -> new ShovelBase(ItemTiers.REDSTONE, 1.5F, -3));
        ITEMS.register("redstone_hoe", () -> new HoeBase(ItemTiers.REDSTONE, -1.2F));

        ITEMS.register("slime_sword", () -> new SwordBase(ItemTiers.SLIME, 2, -2.4F));
        ITEMS.register("slime_axe", () -> new AxeBase(ItemTiers.SLIME, 5, -2.9F));
        ITEMS.register("slime_pickaxe", () -> new PickaxeBase(ItemTiers.SLIME, 1, -2.6F));
        ITEMS.register("slime_shovel", () -> new ShovelBase(ItemTiers.SLIME, 1.3F, -3));
        ITEMS.register("slime_hoe", () -> new HoeBase(ItemTiers.SLIME, -2));

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
