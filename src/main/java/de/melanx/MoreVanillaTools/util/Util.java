package de.melanx.MoreVanillaTools.util;

import de.melanx.morevanillalib.LibConfigHandler;
import de.melanx.morevanillalib.api.ToolMaterials;
import de.melanx.morevanillalib.core.LibDamageSource;
import de.melanx.morevanillalib.util.ToolUtil;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Util {

    public static void itemUseUtil(ItemUseContext context, ActionResultType result, ToolMaterials mat) {
        if (result == ActionResultType.SUCCESS) {
            World world = context.getWorld();
            ToolUtil.extraDrop(world, context.getPos(), mat);
            double chance = LibConfigHandler.damageByPaperToolsChance.get();
            if (mat == ToolMaterials.PAPER && LibConfigHandler.damageByPaperTools.get() && world.rand.nextDouble() < chance) {
                //noinspection ConstantConditions
                context.getPlayer().attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get()) + LibConfigHandler.minPaperDamage.get());
            }
        }
    }

    public static void blockDestroyUtil(World world, BlockState state, BlockPos pos, LivingEntity entityLiving, ToolMaterials mat) {
        if (!world.isRemote && state.getBlockHardness(world, pos) != 0.0F) {
            ToolUtil.extraDrop(world, pos, mat);
            double chance = LibConfigHandler.damageByPaperToolsChance.get();
            if (mat == ToolMaterials.PAPER && LibConfigHandler.damageByPaperTools.get() && world.rand.nextDouble() < chance) {
                entityLiving.attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get()) + LibConfigHandler.minPaperDamage.get());
            }
        }
    }

    public static void hitEntityUtil(LivingEntity target, LivingEntity attacker, ToolMaterials mat) {
        double chance = LibConfigHandler.extraDropChance.get();
        World world = target.getEntityWorld();
        if (world.rand.nextDouble() < chance) {
            BlockPos pos = target.getPosition();
            ItemStack itemStack = mat.getRepairMaterial().getMatchingStacks()[0];
            world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack));
        }

        double cutChance = LibConfigHandler.damageByPaperToolsChance.get();
        if (mat == ToolMaterials.PAPER && LibConfigHandler.damageByPaperTools.get() && world.rand.nextDouble() < cutChance) {
            attacker.attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get() + 1) + LibConfigHandler.minPaperDamage.get());
        }

        ToolUtil.extraDrop(target.getEntityWorld(), target.getPosition(), mat);
    }
}
