package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AxeBase extends ItemAxe {

    private final IItemTier mat;

    public AxeBase(String name, IItemTier mat, float ATTACK_DAMAGE, float ATTACK_SPEED) {
        super(mat, ATTACK_DAMAGE, ATTACK_SPEED, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return ToolUtil.damageItem(stack, world, state, pos, entityLiving, mat);
    }
}
