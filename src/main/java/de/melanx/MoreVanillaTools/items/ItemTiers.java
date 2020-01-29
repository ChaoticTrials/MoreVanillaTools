package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.data.ModTags;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.Tag;
import net.minecraft.util.LazyValue;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum ItemTiers implements IItemTier {

    REDSTONE(ConfigHandler.redstoneDurability.get(), 6.2F, 1.5F, ConfigHandler.redstoneHarvestlevel.get(), 20, () -> {
        return Ingredient.fromTag(Tags.Items.DUSTS_REDSTONE);
    }, Tags.Items.STORAGE_BLOCKS_REDSTONE),
    LAPIS(ConfigHandler.lapisDurability.get(), 6.2F, 1.5F, ConfigHandler.lapisHarvestlevel.get(), 20, () -> {
        return Ingredient.fromTag(Tags.Items.GEMS_LAPIS);
    }, Tags.Items.STORAGE_BLOCKS_LAPIS),
    OBSIDIAN(ConfigHandler.obsidianDurability.get(), 8.2F, 2.5F, ConfigHandler.obsidianHarvestlevel.get(), 15, () -> {
        return Ingredient.fromTag(Tags.Items.OBSIDIAN);
    }, Tags.Items.OBSIDIAN),
    COAL(ConfigHandler.coalDurability.get(), 4.9F, 2, ConfigHandler.coalHarvestlevel.get(), 17, () -> {
        return Ingredient.fromItems(Items.COAL);
    }, Tags.Items.STORAGE_BLOCKS_COAL),
    GLOWSTONE(ConfigHandler.glowstoneDurability.get(), 5, 2.5F, ConfigHandler.glowstoneHarvestlevel.get(), 35, () -> {
        return Ingredient.fromTag(Tags.Items.DUSTS_GLOWSTONE);
    }, ModTags.Items.STORAGE_BLOCKS_GLOWSTONE),
    QUARTZ(ConfigHandler.quartzDurability.get(), 4.9F, 2, ConfigHandler.quartzHarvestlevel.get(), 18, () -> {
        return Ingredient.fromTag(Tags.Items.GEMS_QUARTZ);
    }, Tags.Items.STORAGE_BLOCKS_QUARTZ),
    EMERALD(ConfigHandler.emeraldDurability.get(), 8.2F, 4, ConfigHandler.emeraldHarvestlevel.get(), 25, () -> {
        return Ingredient.fromTag(Tags.Items.GEMS_EMERALD);
    }, Tags.Items.GEMS_EMERALD),
    BONE(ConfigHandler.boneDurability.get(), 4.9F, 2, ConfigHandler.boneHarvestlevel.get(), 17, () -> {
        return Ingredient.fromTag(Tags.Items.BONES);
    }, Tags.Items.BONES),
    PAPER(ConfigHandler.paperDurability.get(), 1.8F, 0, ConfigHandler.paperHarvestlevel.get(), 17, () -> {
        return Ingredient.fromItems(Items.PAPER);
    }, ModTags.Items.PAPER);

    private final int durability;
    private final float efficiency;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;
    private final Tag<Item> ingredient;

    ItemTiers(int durability, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial, Tag<Item> ingredient) {
        this.durability = durability;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
        this.ingredient = ingredient;
    }

    @Override
    public int getMaxUses() {
        return this.durability;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    public Tag<Item> getIngredient() {
        return this.ingredient;
    }
}
