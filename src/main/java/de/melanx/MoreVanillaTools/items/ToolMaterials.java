package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.config.ConfigurableMaterial;
import de.melanx.MoreVanillaTools.config.ModConfig;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import org.moddingx.libx.util.lazy.LazyValue;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum ToolMaterials implements Tier {
    BONE(ModConfig.ToolValues.bone, 176, () -> Ingredient.of(Tags.Items.BONES)),
    COAL(ModConfig.ToolValues.coal, 145, () -> Ingredient.of(Items.COAL)),
    EMERALD(ModConfig.ToolValues.emerald, 1171, () -> Ingredient.of(Tags.Items.GEMS_EMERALD)),
    ENDER(ModConfig.ToolValues.ender, 666, () -> Ingredient.of(Tags.Items.ENDER_PEARLS)),
    FIERY(ModConfig.ToolValues.fiery, 127, () -> Ingredient.of(Items.MAGMA_BLOCK)),
    GLOWSTONE(ModConfig.ToolValues.glowstone, 123, () -> Ingredient.of(Tags.Items.DUSTS_GLOWSTONE)),
    LAPIS(ModConfig.ToolValues.lapis, 173, () -> Ingredient.of(Tags.Items.GEMS_LAPIS)),
    NETHER(ModConfig.ToolValues.nether, 188, () -> Ingredient.of(Items.NETHER_BRICKS)),
    OBSIDIAN(ModConfig.ToolValues.obsidian, 1337, () -> Ingredient.of(Tags.Items.OBSIDIAN)),
    PAPER(ModConfig.ToolValues.paper, 13, () -> Ingredient.of(Items.PAPER)),
    PRISMARINE(ModConfig.ToolValues.prismarine, 225, () -> Ingredient.of(Tags.Items.DUSTS_PRISMARINE)),
    QUARTZ(ModConfig.ToolValues.quartz, 117, () -> Ingredient.of(Tags.Items.GEMS_QUARTZ)),
    REDSTONE(ModConfig.ToolValues.redstone, 173, () -> Ingredient.of(Tags.Items.DUSTS_REDSTONE)),
    SLIME(ModConfig.ToolValues.slime, 123, () -> Ingredient.of(Tags.Items.SLIMEBALLS));

    private final ConfigurableMaterial material;
    private final int durability;
    private final LazyValue<Ingredient> repairIngredient;

    ToolMaterials(ConfigurableMaterial material, int durability, Supplier<Ingredient> repairIngredient) {
        this.material = material;
        this.durability = durability;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.durability;
    }

    @Override
    public float getSpeed() {
        return this.material.speed();
    }

    @Override
    public float getAttackDamageBonus() {
        return this.material.attackDamageBonus();
    }

    @Override
    public int getLevel() {
        return this.material.harvestLevel();
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
}
