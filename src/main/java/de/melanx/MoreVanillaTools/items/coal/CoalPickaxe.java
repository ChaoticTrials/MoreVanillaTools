package de.melanx.MoreVanillaTools.items.coal;

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

public class CoalPickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final int SPEED = -3;

    public CoalPickaxe() {
        super("coal_pickaxe", ItemTiers.COAL_TIER, DAMAGE, SPEED);
    }

    @SubscribeEvent
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (!stack.getEnchantmentTagList().toString().contains("minecraft:silk_touch")) {
            Block block = state.getBlock();
            if (block == Blocks.COAL_ORE) {
                ItemStack drop = new ItemStack(Items.COAL);
                int i = new Random().nextInt(2);
                if (i == 0)
                    worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), drop));
            }
        }
        stack.damageItem(1, entityLiving, e -> {
            e.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }
}
