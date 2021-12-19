package de.melanx.MoreVanillaTools.data;

import de.melanx.MoreVanillaTools.util.ModItems;
import de.melanx.morevanillalib.api.normal.ToolMaterials;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.recipe.RecipeProviderBase;
import io.github.noeppi_noeppi.libx.mod.ModX;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import javax.annotation.Nullable;
import java.util.function.Consumer;

@Datagen
public class Recipes extends RecipeProviderBase {

    public Recipes(ModX mod, DataGenerator generator) {
        super(mod, generator);
    }

    @Override
    protected void setup() {
        this.makeTools(ToolMaterials.BONE.getCraftingIngredient(), ModItems.boneSword, ModItems.boneAxe, ModItems.bonePickaxe, ModItems.boneShovel, ModItems.boneHoe);
        this.makeTools(ToolMaterials.COAL.getCraftingIngredient(), ModItems.coalSword, ModItems.coalAxe, ModItems.coalPickaxe, ModItems.coalShovel, ModItems.coalHoe);
        this.makeTools(ToolMaterials.EMERALD.getCraftingIngredient(), ModItems.emeraldSword, ModItems.emeraldAxe, ModItems.emeraldPickaxe, ModItems.emeraldShovel, ModItems.emeraldHoe);
        this.makeTools(ToolMaterials.ENDER.getCraftingIngredient(), ModItems.enderSword, ModItems.enderAxe, ModItems.enderPickaxe, ModItems.enderShovel, ModItems.enderHoe);
        this.makeTools(ToolMaterials.FIERY.getCraftingIngredient(), ModItems.fierySword, ModItems.fieryAxe, ModItems.fieryPickaxe, ModItems.fieryShovel, ModItems.fieryHoe);
        this.makeTools(ToolMaterials.GLOWSTONE.getCraftingIngredient(), ModItems.glowstoneSword, ModItems.glowstoneAxe, ModItems.glowstonePickaxe, ModItems.glowstoneShovel, ModItems.glowstoneHoe);
        this.makeTools(ToolMaterials.LAPIS.getCraftingIngredient(), ModItems.lapisSword, ModItems.lapisAxe, ModItems.lapisPickaxe, ModItems.lapisShovel, ModItems.lapisHoe);
        this.makeTools(ToolMaterials.NETHER.getCraftingIngredient(), ModItems.netherSword, ModItems.netherAxe, ModItems.netherPickaxe, ModItems.netherShovel, ModItems.netherHoe);
        this.makeTools(ToolMaterials.OBSIDIAN.getCraftingIngredient(), ModItems.obsidianSword, ModItems.obsidianAxe, ModItems.obsidianPickaxe, ModItems.obsidianShovel, ModItems.obsidianHoe);
        this.makeTools(ToolMaterials.PAPER.getCraftingIngredient(), ModItems.paperSword, ModItems.paperAxe, ModItems.paperPickaxe, ModItems.paperShovel, ModItems.paperHoe);
        this.makeTools(ToolMaterials.PRISMARINE.getCraftingIngredient(), ModItems.prismarineSword, ModItems.prismarineAxe, ModItems.prismarinePickaxe, ModItems.prismarineShovel, ModItems.prismarineHoe);
        this.makeTools(ToolMaterials.QUARTZ.getCraftingIngredient(), ModItems.quartzSword, ModItems.quartzAxe, ModItems.quartzPickaxe, ModItems.quartzShovel, ModItems.quartzHoe);
        this.makeTools(ToolMaterials.REDSTONE.getCraftingIngredient(), ModItems.redstoneSword, ModItems.redstoneAxe, ModItems.redstonePickaxe, ModItems.redstoneShovel, ModItems.redstoneHoe);
        this.makeTools(ToolMaterials.SLIME.getCraftingIngredient(), ModItems.slimeSword, ModItems.slimeAxe, ModItems.slimePickaxe, ModItems.slimeShovel, ModItems.slimeHoe);
    }

    private void makeTools(Ingredient material, @Nullable ItemLike sword, @Nullable ItemLike axe,
                           @Nullable ItemLike pickaxe, @Nullable ItemLike shovel, @Nullable ItemLike hoe) {
        Consumer<FinishedRecipe> consumer = this.consumer();
        if (sword != null) {
            ShapedRecipeBuilder.shaped(sword)
                    .define('m', material)
                    .define('s', Tags.Items.RODS_WOODEN)
                    .pattern("m")
                    .pattern("m")
                    .pattern("s")
                    .unlockedBy("has_item", has(Tags.Items.RODS_WOODEN))
                    .save(consumer);
        }

        if (axe != null) {
            ShapedRecipeBuilder.shaped(axe)
                    .define('m', material)
                    .define('s', Tags.Items.RODS_WOODEN)
                    .pattern("mm")
                    .pattern("sm")
                    .pattern("s ")
                    .unlockedBy("has_item", has(Tags.Items.RODS_WOODEN))
                    .save(consumer);
        }

        if (pickaxe != null) {
            ShapedRecipeBuilder.shaped(pickaxe)
                    .define('m', material)
                    .define('s', Tags.Items.RODS_WOODEN)
                    .pattern("mmm")
                    .pattern(" s ")
                    .pattern(" s ")
                    .unlockedBy("has_item", has(Tags.Items.RODS_WOODEN))
                    .save(consumer);
        }

        if (shovel != null) {
            ShapedRecipeBuilder.shaped(shovel)
                    .define('m', material)
                    .define('s', Tags.Items.RODS_WOODEN)
                    .pattern("m")
                    .pattern("s")
                    .pattern("s")
                    .unlockedBy("has_item", has(Tags.Items.RODS_WOODEN))
                    .save(consumer);
        }

        if (hoe != null) {
            ShapedRecipeBuilder.shaped(hoe)
                    .define('m', material)
                    .define('s', Tags.Items.RODS_WOODEN)
                    .pattern("mm")
                    .pattern("s ")
                    .pattern("s ")
                    .unlockedBy("has_item", has(Tags.Items.RODS_WOODEN))
                    .save(consumer);
        }
    }
}
