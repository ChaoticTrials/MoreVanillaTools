package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.ModDamageSource;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class ShovelBase extends ItemSpade {

    private final IItemTier mat;

    public ShovelBase(String name, IItemTier mat, float damage, float speed) {
        super(mat, damage, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return ToolUtil.damageItem(stack, world, state, pos, entityLiving, mat);
    }

    @Override
    public EnumActionResult onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getPos();
        if (context.getFace() != EnumFacing.DOWN && world.getBlockState(pos.up()).isAir(world, pos.up())) {
            IBlockState blockstate = field_195955_e.get(world.getBlockState(pos).getBlock());
            if (blockstate != null) {
                EntityPlayer playerentity = context.getPlayer();
                world.playSound(playerentity, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (ToolUtil.paperDamage(mat))
                    playerentity.attackEntityFrom(ModDamageSource.PAPER_CUT, new Random().nextInt(ConfigHandler.maxPaperDamage.get()) + ConfigHandler.minPaperDamage.get());
                return ToolUtil.itemUsed(context, world, pos, blockstate, playerentity, mat);
            }
        }

        return EnumActionResult.PASS;
    }

}
