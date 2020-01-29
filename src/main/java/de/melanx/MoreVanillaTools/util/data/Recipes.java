package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.MoreVanillaTools.util.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        for (RegistryObject<Item> object : Registry.ITEMS.getEntries()) {
            Item item = object.get();
            if (item instanceof SwordBase)
                registerSwordRecipe((SwordBase) item).build(consumer);
            else if (item instanceof AxeBase)
                registerAxeplateRecipe((AxeBase) item).build(consumer);
            else if (item instanceof PickaxeBase)
                registerPickaxeRecipe((PickaxeBase) item).build(consumer);
            else if (item instanceof ShovelBase)
                registerShovelRecipe((ShovelBase) item).build(consumer);
            else if (item instanceof HoeBase)
                registerHoeRecipe((HoeBase) item).build(consumer);
        }
    }

    private ShapedRecipeBuilder registerSwordRecipe(SwordBase item) {
        return ShapedRecipeBuilder.shapedRecipe(item)
                .key('M', item.getToolType().getIngredient())
                .key('S', Items.STICK)
                .patternLine("M")
                .patternLine("M")
                .patternLine("S")
                .addCriterion("has_material", hasItem(item.getToolType().getIngredient()));
    }

    private ShapedRecipeBuilder registerAxeplateRecipe(AxeBase item) {
        return ShapedRecipeBuilder.shapedRecipe(item)
                .key('M', item.getToolType().getIngredient())
                .key('S', Items.STICK)
                .patternLine("MM")
                .patternLine("MS")
                .patternLine(" S")
                .addCriterion("has_material", hasItem(item.getToolType().getIngredient()));
    }

    private ShapedRecipeBuilder registerPickaxeRecipe(PickaxeBase item) {
        return ShapedRecipeBuilder.shapedRecipe(item)
                .key('M', item.getToolType().getIngredient())
                .key('S', Items.STICK)
                .patternLine("MMM")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_material", hasItem(item.getToolType().getIngredient()));
    }

    private ShapedRecipeBuilder registerShovelRecipe(ShovelBase item) {
        return ShapedRecipeBuilder.shapedRecipe(item)
                .key('M', item.getToolType().getIngredient())
                .key('S', Items.STICK)
                .patternLine("M")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_material", hasItem(item.getToolType().getIngredient()));
    }

    private ShapedRecipeBuilder registerHoeRecipe(HoeBase item) {
        return ShapedRecipeBuilder.shapedRecipe(item)
                .key('M', item.getToolType().getIngredient())
                .key('S', Items.STICK)
                .patternLine("MM")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_material", hasItem(item.getToolType().getIngredient()));
    }
}
