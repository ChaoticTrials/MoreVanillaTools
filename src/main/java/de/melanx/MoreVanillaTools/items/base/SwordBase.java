package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.ModDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class SwordBase extends SwordItem {

    private final ItemTiers mat;

    public SwordBase(ItemTiers mat, int damage, float speed) {
        super(mat, damage, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));

        this.mat = mat;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int chance = ConfigHandler.extraDropChance.get();
        if (new Random().nextInt(1000) < chance) {
            World world = target.getEntityWorld().getWorld();
            BlockPos pos = target.getPosition();
            ItemStack itemStack = mat.getRepairMaterial().getMatchingStacks()[0];
            world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack));
        }

        int cutChance = ConfigHandler.damageByPaperToolsChance.get();
        if (this.getToolType() == ItemTiers.PAPER && ConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < cutChance)
            attacker.attackEntityFrom(ModDamageSource.PAPER_CUT, new Random().nextInt(ConfigHandler.maxPaperDamage.get() + 1) + ConfigHandler.minPaperDamage.get());

        return super.hitEntity(stack, target, attacker);
    }

    public ItemTiers getToolType() {
        return this.mat;
    }

}
