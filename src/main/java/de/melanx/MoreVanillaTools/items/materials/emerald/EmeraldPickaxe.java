package de.melanx.MoreVanillaTools.items.materials.emerald;

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

public class EmeraldPickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final float SPEED = -2.5F;

    public EmeraldPickaxe() {
        super("emerald_pickaxe", ItemTiers.EMERALD_TIER, DAMAGE, SPEED);
    }

    @SubscribeEvent
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) < 1) {
            Block block = state.getBlock();
            if (block == Blocks.EMERALD_ORE) {
                ItemStack drop = new ItemStack(Items.EMERALD);
                int chance = ConfigHandler.emeraldDoubleDropChance.get();
                chance = ToolUtil.getDefaultChance(chance, 1);
                if (worldIn.rand.nextInt(1000) < chance && ConfigHandler.emeraldDoubleDrop.get())
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), drop));
            }
        }
        stack.damageItem(1, entityLiving);
        return true;
    }
}
