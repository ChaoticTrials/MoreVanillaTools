package de.melanx.MoreVanillaTools.data;

import de.melanx.MoreVanillaTools.util.ModItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import org.moddingx.libx.datagen.DatagenContext;
import org.moddingx.libx.datagen.provider.recipe.RecipeProviderBase;
import org.moddingx.libx.datagen.provider.recipe.crafting.CompressionExtension;
import org.moddingx.libx.datagen.provider.recipe.crafting.CraftingExtension;

import javax.annotation.Nullable;

public class Recipes extends RecipeProviderBase implements CompressionExtension, CraftingExtension {

    public Recipes(DatagenContext context) {
        super(context);
    }

    @Override
    protected void setup() {
        this.compress(Items.OBSIDIAN, ModItems.obsidianShard);

        this.makeTools(Ingredient.of(Tags.Items.BONES), ModItems.boneSword, ModItems.boneAxe, ModItems.bonePickaxe, ModItems.boneShovel, ModItems.boneHoe);
        this.makeTools(Ingredient.of(Items.COAL), ModItems.coalSword, ModItems.coalAxe, ModItems.coalPickaxe, ModItems.coalShovel, ModItems.coalHoe);
        this.makeTools(Ingredient.of(Tags.Items.INGOTS_COPPER), ModItems.copperSword, ModItems.copperAxe, ModItems.copperPickaxe, ModItems.copperShovel, ModItems.copperHoe);
        this.makeTools(Ingredient.of(Tags.Items.GEMS_EMERALD), ModItems.emeraldSword, ModItems.emeraldAxe, ModItems.emeraldPickaxe, ModItems.emeraldShovel, ModItems.emeraldHoe);
        this.makeTools(Ingredient.of(Tags.Items.END_STONES), ModItems.enderSword, ModItems.enderAxe, ModItems.enderPickaxe, ModItems.enderShovel, ModItems.enderHoe);
        this.makeTools(Ingredient.of(Items.MAGMA_CREAM), ModItems.fierySword, ModItems.fieryAxe, ModItems.fieryPickaxe, ModItems.fieryShovel, ModItems.fieryHoe);
        this.makeTools(Ingredient.of(Items.GLOWSTONE), ModItems.glowstoneSword, ModItems.glowstoneAxe, ModItems.glowstonePickaxe, ModItems.glowstoneShovel, ModItems.glowstoneHoe);
        this.makeTools(Ingredient.of(Tags.Items.STORAGE_BLOCKS_LAPIS), ModItems.lapisSword, ModItems.lapisAxe, ModItems.lapisPickaxe, ModItems.lapisShovel, ModItems.lapisHoe);
        this.makeTools(Ingredient.of(Items.NETHER_BRICKS), ModItems.netherSword, ModItems.netherAxe, ModItems.netherPickaxe, ModItems.netherShovel, ModItems.netherHoe);
        this.makeTools(Ingredient.of(ModItems.obsidianShard), ModItems.obsidianSword, ModItems.obsidianAxe, ModItems.obsidianPickaxe, ModItems.obsidianShovel, ModItems.obsidianHoe);
        this.makeTools(Ingredient.of(Items.PAPER), ModItems.paperSword, ModItems.paperAxe, ModItems.paperPickaxe, ModItems.paperShovel, ModItems.paperHoe);
        this.makeTools(Ingredient.of(Tags.Items.GEMS_PRISMARINE), ModItems.prismarineSword, ModItems.prismarineAxe, ModItems.prismarinePickaxe, ModItems.prismarineShovel, ModItems.prismarineHoe);
        this.makeTools(Ingredient.of(Items.QUARTZ_BLOCK), ModItems.quartzSword, ModItems.quartzAxe, ModItems.quartzPickaxe, ModItems.quartzShovel, ModItems.quartzHoe);
        this.makeTools(Ingredient.of(Tags.Items.STORAGE_BLOCKS_REDSTONE), ModItems.redstoneSword, ModItems.redstoneAxe, ModItems.redstonePickaxe, ModItems.redstoneShovel, ModItems.redstoneHoe);
        this.makeTools(Ingredient.of(Tags.Items.SLIME_BALLS), ModItems.slimeSword, ModItems.slimeAxe, ModItems.slimePickaxe, ModItems.slimeShovel, ModItems.slimeHoe);
    }

    private void makeTools(Ingredient material, @Nullable ItemLike sword, @Nullable ItemLike axe,
                           @Nullable ItemLike pickaxe, @Nullable ItemLike shovel, @Nullable ItemLike hoe) {
        if (sword != null)
            this.shaped(RecipeCategory.TOOLS, sword, "m", "m", "s", 'm', material, 's', Tags.Items.RODS_WOODEN);
        if (axe != null)
            this.shaped(RecipeCategory.TOOLS, axe, "mm", "sm", "s ", 'm', material, 's', Tags.Items.RODS_WOODEN);
        if (pickaxe != null)
            this.shaped(RecipeCategory.TOOLS, pickaxe, "mmm", " s ", " s ", 'm', material, 's', Tags.Items.RODS_WOODEN);
        if (shovel != null)
            this.shaped(RecipeCategory.TOOLS, shovel, "m", "s", "s", 'm', material, 's', Tags.Items.RODS_WOODEN);
        if (hoe != null)
            this.shaped(RecipeCategory.TOOLS, hoe, "mm", "s ", "s ", 'm', material, 's', Tags.Items.RODS_WOODEN);
    }
}
