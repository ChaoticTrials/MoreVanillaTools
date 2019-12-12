package de.melanx.MoreVanillaTools.items.base;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

public class HoeBase extends ItemHoe {

    protected static final Map<Block, IBlockState> HOE_LOOKUP = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Blocks.FARMLAND.getDefaultState(), Blocks.GRASS_PATH, Blocks.FARMLAND.getDefaultState(), Blocks.DIRT, Blocks.FARMLAND.getDefaultState(), Blocks.COARSE_DIRT, Blocks.DIRT.getDefaultState()));
    private final IItemTier mat;

    public HoeBase(String name, IItemTier mat, float speed) {
        super(mat, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public EnumActionResult onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getPos();
        int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(context);
        if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
        if (context.getFace() != EnumFacing.DOWN && world.isAirBlock(pos.up())) {
            IBlockState blockstate = HOE_LOOKUP.get(world.getBlockState(pos).getBlock());
            if (blockstate != null) {
                EntityPlayer playerentity = context.getPlayer();
                world.playSound(playerentity, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ToolUtil.itemUsed(context, world, pos, blockstate, playerentity, mat);
            }
        }

        return EnumActionResult.PASS;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return ToolUtil.damageItem(stack, world, state, pos, entityLiving, mat);
    }

}
