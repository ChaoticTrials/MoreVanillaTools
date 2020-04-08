package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.util.ConfigHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class ItemTiers {

    public static final IItemTier REDSTONE_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.redstoneDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 6.2F;
        }

        @Override
        public float getAttackDamage() {
            return 1.5F;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.redstoneHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 20;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.DUSTS_REDSTONE);
        }
    };

    public static final IItemTier LAPIS_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.lapisDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 6.2F;
        }

        @Override
        public float getAttackDamage() {
            return 1.5F;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.lapisHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 20;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.GEMS_LAPIS);
        }
    };

    public static final IItemTier OBSIDIAN_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.obsidianDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 8.2F;
        }

        @Override
        public float getAttackDamage() {
            return 2.5F;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.obsidianHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.OBSIDIAN);
        }
    };

    public static final IItemTier COAL_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.coalDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 4.9F;
        }

        @Override
        public float getAttackDamage() {
            return 2;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.coalHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 17;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.COAL);
        }
    };

    public static final IItemTier GLOWSTONE_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.glowstoneDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 6;
        }

        @Override
        public float getAttackDamage() {
            return 2.5F;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.glowstoneHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 35;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.DUSTS_GLOWSTONE);
        }
    };

    public static final IItemTier QUARTZ_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.quartzDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 4.9F;
        }

        @Override
        public float getAttackDamage() {
            return 2;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.quartzHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 18;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.GEMS_QUARTZ);
        }
    };

    public static final IItemTier EMERALD_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.emeraldDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 8.2F;
        }

        @Override
        public float getAttackDamage() {
            return 4;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.emeraldHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 14;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.GEMS_EMERALD);
        }
    };

    public static final IItemTier BONE_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.boneDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 4.9F;
        }

        @Override
        public float getAttackDamage() {
            return 2;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.boneHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 17;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromTag(Tags.Items.BONES);
        }
    };

    public static final IItemTier PAPER_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return ConfigHandler.paperDurability.get();
        }

        @Override
        public float getEfficiency() {
            return 1.8F;
        }

        @Override
        public float getAttackDamage() {
            return 0;
        }

        @Override
        public int getHarvestLevel() {
            return ConfigHandler.paperHarvestlevel.get();
        }

        @Override
        public int getEnchantability() {
            return 17;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.PAPER);
        }
    };

}
