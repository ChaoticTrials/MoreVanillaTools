package de.melanx.MoreVanillaTools.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class ItemTiers {

    public static final IItemTier REDSTONE_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 193;
        }

        @Override
        public float getEfficiency() {
            return 6.2F;
        }

        @Override
        public float getAttackDamage() {
            return 2;
        }

        @Override
        public int getHarvestLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 20;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.REDSTONE);
        }
    };

    public static final IItemTier LAPIS_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 193;
        }

        @Override
        public float getEfficiency() {
            return 6.2F;
        }

        @Override
        public float getAttackDamage() {
            return 2;
        }

        @Override
        public int getHarvestLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 20;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.LAPIS_LAZULI);
        }
    };

    public static final IItemTier OBSIDIAN_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return (int) (1337 * 3.14F);
        }

        @Override
        public float getEfficiency() {
            return 8.2F;
        }

        @Override
        public float getAttackDamage() {
            return 1.8F;
        }

        @Override
        public int getHarvestLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.OBSIDIAN);
        }
    };

}
