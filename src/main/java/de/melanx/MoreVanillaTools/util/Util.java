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
            ToolUtil.extraDrop(context.getWorld(), context.getPos(), mat);
            int chance = LibConfigHandler.damageByPaperToolsChance.get();
            if (mat == ToolMaterials.PAPER && LibConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < chance)
                context.getPlayer().attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get()) + LibConfigHandler.minPaperDamage.get());
        }
    }

    public static void blockDestroyUtil(World world, BlockState state, BlockPos pos, LivingEntity entityLiving, ToolMaterials mat) {
        if (!world.isRemote && state.getBlockHardness(world, pos) != 0.0F) {
            ToolUtil.extraDrop(world, pos, mat);
            int chance = LibConfigHandler.damageByPaperToolsChance.get();
            if (mat == ToolMaterials.PAPER && LibConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < chance)
                entityLiving.attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get()) + LibConfigHandler.minPaperDamage.get());
        }
    }

    public static void hitEntityUtil(LivingEntity target, LivingEntity attacker, ToolMaterials mat) {
        int chance = LibConfigHandler.extraDropChance.get();
        if (new Random().nextInt(1000) < chance) {
            World world = target.getEntityWorld();
            BlockPos pos = target.getPosition();
            ItemStack itemStack = mat.getRepairMaterial().getMatchingStacks()[0];
            world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack));
        }

        int cutChance = LibConfigHandler.damageByPaperToolsChance.get();
        if (mat == ToolMaterials.PAPER && LibConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < cutChance)
            attacker.attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get() + 1) + LibConfigHandler.minPaperDamage.get());

        ToolUtil.extraDrop(target.getEntityWorld(), target.getPosition(), mat);
    }
}
