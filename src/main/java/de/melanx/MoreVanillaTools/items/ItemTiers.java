package de.melanx.MoreVanillaTools.items;

import de.melanx.morevanillalib.LibConfigHandler;
import de.melanx.morevanillalib.data.ModTags;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.Tag;
import net.minecraft.util.LazyValue;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum ItemTiers implements IItemTier {

    BONE(LibConfigHandler.boneDurability.get(), 4.9F, 2, LibConfigHandler.boneHarvestlevel.get(), 17, () -> {
        return Ingredient.fromTag(Tags.Items.BONES);
    }, Tags.Items.BONES),
    COAL(LibConfigHandler.coalDurability.get(), 4.9F, 2, LibConfigHandler.coalHarvestlevel.get(), 17, () -> {
        return Ingredient.fromItems(Items.COAL);
    }, Tags.Items.STORAGE_BLOCKS_COAL),
    EMERALD(LibConfigHandler.emeraldDurability.get(), 8.2F, 4, LibConfigHandler.emeraldHarvestlevel.get(), 25, () -> {
        return Ingredient.fromTag(Tags.Items.GEMS_EMERALD);
    }, Tags.Items.GEMS_EMERALD),
    ENDER(LibConfigHandler.enderDurability.get(), 5.7F, 5, LibConfigHandler.enderHarvestlevel.get(), 10, () -> {
        return Ingredient.fromTag(Tags.Items.ENDER_PEARLS);
    }, Tags.Items.END_STONES),
    FIERY(LibConfigHandler.fieryDurability.get(), 7, 2, LibConfigHandler.fieryHarvestlevel.get(), 15, () -> {
        return Ingredient.fromTag(ModTags.Items.MAGMA_BLOCK);
    }, ModTags.Items.MAGMA_BLOCK),
    GLOWSTONE(LibConfigHandler.glowstoneDurability.get(), 5, 2.5F, LibConfigHandler.glowstoneHarvestlevel.get(), 35, () -> {
        return Ingredient.fromTag(Tags.Items.DUSTS_GLOWSTONE);
    }, ModTags.Items.STORAGE_BLOCKS_GLOWSTONE),
    LAPIS(LibConfigHandler.lapisDurability.get(), 6.2F, 1.5F, LibConfigHandler.lapisHarvestlevel.get(), 20, () -> {
        return Ingredient.fromTag(Tags.Items.GEMS_LAPIS);
    }, Tags.Items.STORAGE_BLOCKS_LAPIS),
    NETHER(LibConfigHandler.netherDurability.get(), 4.9F, 2, LibConfigHandler.netherHarvestlevel.get(), 66, () -> {
        return Ingredient.fromTag(ModTags.Items.NETHER_BRICKS);
    }, ModTags.Items.NETHER_BRICKS),
    OBSIDIAN(LibConfigHandler.obsidianDurability.get(), 8.2F, 2.5F, LibConfigHandler.obsidianHarvestlevel.get(), 15, () -> {
        return Ingredient.fromTag(Tags.Items.OBSIDIAN);
    }, Tags.Items.OBSIDIAN),
    PAPER(LibConfigHandler.paperDurability.get(), 1.8F, 0, LibConfigHandler.paperHarvestlevel.get(), 17, () -> {
        return Ingredient.fromItems(Items.PAPER);
    }, ModTags.Items.PAPER),
    PRISMARINE(LibConfigHandler.prismarineDurability.get(), 7, 3, LibConfigHandler.prismarineHarvestlevel.get(), 20, () -> {
        return Ingredient.fromTag(Tags.Items.DUSTS_PRISMARINE);
    }, ModTags.Items.PRISMARINE),
    QUARTZ(LibConfigHandler.quartzDurability.get(), 4.9F, 2, LibConfigHandler.quartzHarvestlevel.get(), 18, () -> {
        return Ingredient.fromTag(Tags.Items.GEMS_QUARTZ);
    }, Tags.Items.STORAGE_BLOCKS_QUARTZ),
    REDSTONE(LibConfigHandler.redstoneDurability.get(), 6.2F, 1.5F, LibConfigHandler.redstoneHarvestlevel.get(), 20, () -> {
        return Ingredient.fromTag(Tags.Items.DUSTS_REDSTONE);
    }, Tags.Items.STORAGE_BLOCKS_REDSTONE),
    SLIME(LibConfigHandler.slimeDurability.get(), 6.2F, 2, LibConfigHandler.slimeHarvestlevel.get(), 20, () -> {
        return Ingredient.fromTag(Tags.Items.SLIMEBALLS);
    }, ModTags.Items.SLIME_BLOCK);

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
