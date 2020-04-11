package de.melanx.MoreVanillaTools.items.materials;

import de.melanx.MoreVanillaTools.items.base.PickaxeBase;
import de.melanx.morevanillalib.LibConfigHandler;
import de.melanx.morevanillalib.api.ToolMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CoalPickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final int SPEED = -3;

    public CoalPickaxe() {
        super(ToolMaterials.COAL, DAMAGE, SPEED);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) < 1) {
            Block block = state.getBlock();
            if (block == Blocks.COAL_ORE) {
                ItemStack drop = new ItemStack(Items.COAL);
                int chance = LibConfigHandler.coalDoubleDropChance.get();
                if (worldIn.rand.nextInt(1000) < chance && LibConfigHandler.coalDoubleDrop.get())
                    worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), drop));
            }
        }
        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }
}
