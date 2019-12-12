package de.melanx.MoreVanillaTools.items.materials.coal;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;
import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CoalPickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final int SPEED = -3;

    public CoalPickaxe() {
        super("coal_pickaxe", ItemTiers.COAL_TIER, DAMAGE, SPEED);
    }

    @SubscribeEvent
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) < 1) {
            Block block = state.getBlock();
            if (block == Blocks.COAL_ORE) {
                ItemStack drop = new ItemStack(Items.COAL);
                int chance = ConfigHandler.coalDoubleDropChance.get();
                chance = ToolUtil.getDefaultChance(chance, 500);
                if (worldIn.rand.nextInt(1000) < chance && ConfigHandler.coalDoubleDrop.get())
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), drop));
            }
        }
        stack.damageItem(1, entityLiving);
        return true;
    }
}
