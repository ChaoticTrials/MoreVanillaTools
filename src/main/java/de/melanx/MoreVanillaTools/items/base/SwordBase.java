package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.ModDamageSource;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class SwordBase extends SwordItem {

    private final IItemTier mat;

    public SwordBase(String name, IItemTier mat, int damage, float speed) {
        super(mat, damage, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int chance = ConfigHandler.COMMON.extraDropChance.get();
        if (chance < 0 || chance > 1000) chance = 5;
        if (new Random().nextInt(1000) < chance) {
            World world = target.getEntityWorld().getWorld();
            BlockPos pos = target.getPosition();
            ItemStack itemStack = mat.getRepairMaterial().getMatchingStacks()[0];
            world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack));
        }

        ToolUtil.paperDamage(mat, attacker);

        stack.damageItem(1, attacker, (e) -> {
            e.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }

}
