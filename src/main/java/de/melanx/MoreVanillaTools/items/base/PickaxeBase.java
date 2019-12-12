package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PickaxeBase extends ItemPickaxe {

    private final IItemTier mat;

    public PickaxeBase(String name, IItemTier mat, int damage, float speed) {
        super(mat, damage, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return ToolUtil.damageItem(stack, world, state, pos, entityLiving, mat);
    }

}
