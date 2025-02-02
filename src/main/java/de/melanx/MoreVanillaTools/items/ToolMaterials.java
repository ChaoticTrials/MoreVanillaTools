package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.config.ConfigurableMaterial;
import de.melanx.MoreVanillaTools.config.ModConfig;
import de.melanx.MoreVanillaTools.data.MoreTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import org.moddingx.libx.util.lazy.LazyValue;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public enum ToolMaterials implements Tier {
    BONE(ModConfig.ToolValues.bone, () -> Ingredient.of(Tags.Items.BONES)),
    COAL(ModConfig.ToolValues.coal, () -> Ingredient.of(Items.COAL)),
    COPPER(ModConfig.ToolValues.copper, () -> Ingredient.of(Tags.Items.INGOTS_COPPER)),
    EMERALD(ModConfig.ToolValues.emerald, () -> Ingredient.of(Tags.Items.GEMS_EMERALD)),
    ENDER(ModConfig.ToolValues.ender, () -> Ingredient.of(Tags.Items.ENDER_PEARLS)),
    FIERY(ModConfig.ToolValues.fiery, () -> Ingredient.of(Items.MAGMA_BLOCK)),
    GLOWSTONE(ModConfig.ToolValues.glowstone, () -> Ingredient.of(Tags.Items.DUSTS_GLOWSTONE)),
    LAPIS(ModConfig.ToolValues.lapis, () -> Ingredient.of(Tags.Items.GEMS_LAPIS)),
    NETHER(ModConfig.ToolValues.nether, () -> Ingredient.of(Items.NETHER_BRICKS)),
    OBSIDIAN(ModConfig.ToolValues.obsidian, () -> Ingredient.of(Tags.Items.OBSIDIANS_NORMAL)),
    PAPER(ModConfig.ToolValues.paper, () -> Ingredient.of(Items.PAPER)),
    PRISMARINE(ModConfig.ToolValues.prismarine, () -> Ingredient.of(Tags.Items.GEMS_PRISMARINE)),
    QUARTZ(ModConfig.ToolValues.quartz, () -> Ingredient.of(Tags.Items.GEMS_QUARTZ)),
    REDSTONE(ModConfig.ToolValues.redstone, () -> Ingredient.of(Tags.Items.DUSTS_REDSTONE)),
    SLIME(ModConfig.ToolValues.slime, () -> Ingredient.of(Tags.Items.SLIME_BALLS));

    private final ConfigurableMaterial material;
    private final LazyValue<Ingredient> repairIngredient;

    ToolMaterials(ConfigurableMaterial material, Supplier<Ingredient> repairIngredient) {
        this.material = material;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.material.durability();
    }

    @Override
    public float getSpeed() {
        return this.material.speed();
    }

    @Override
    public float getAttackDamageBonus() {
        return this.material.attackDamageBonus();
    }

    @Nonnull
    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return switch (this.material.harvestLevel()) {
            case 0 -> BlockTags.INCORRECT_FOR_WOODEN_TOOL;
            case 1 -> BlockTags.INCORRECT_FOR_STONE_TOOL;
            case 2 -> BlockTags.INCORRECT_FOR_IRON_TOOL;
            case 3 -> BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
            case 4 -> BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
            default -> MoreTags.Blocks.INCORRECT_FOR_HIGHER_TOOL;
        };
    }

    @Override
    public int getEnchantmentValue() {
        return this.material.enchantmentValue();
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Nonnull
    @Override
    public Tool createToolProperties(@Nonnull TagKey<Block> block) {
        List<Tool.Rule> rules = new ArrayList<>();

        if (this == OBSIDIAN) {
            rules.add(Tool.Rule.minesAndDrops(Tags.Blocks.OBSIDIANS, 15));
        }

        rules.add(Tool.Rule.deniesDrops(this.getIncorrectBlocksForDrops()));
        rules.add(Tool.Rule.minesAndDrops(block, this.getSpeed()));

        return new Tool(rules, 1.0F, 1);
    }

    public int getHarvestLevel() {
        return this.material.harvestLevel();
    }
}
