package de.melanx.MoreVanillaTools.items.lapis;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public class LapisPickaxe extends PickaxeBase {

    private static final int DAMAGE = 1;
    private static final float SPEED = -2.8F;

    public LapisPickaxe() {
        super("lapis_pickaxe", ItemTiers.LAPIS_TIER, DAMAGE, SPEED);
    }

    @SubscribeEvent
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (!stack.getEnchantmentTagList().toString().contains("minecraft:silk_touch")) {
            Block block = state.getBlock();
            if (block == Blocks.LAPIS_ORE) {
                ItemStack drop = new ItemStack(Items.LAPIS_LAZULI);
                int i = new Random().nextInt(3);
                for (int x = 0; x <= i; x++)
                    worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), drop));
            }
        }
        stack.damageItem(1, entityLiving, e -> {
            e.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }

}
