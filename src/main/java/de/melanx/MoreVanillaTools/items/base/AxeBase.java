package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.Registry;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class AxeBase extends AxeItem {

    public AxeBase(String name, IItemTier mat, float ATTACK_DAMAGE, float ATTACK_SPEED) {
        super(mat, ATTACK_DAMAGE, ATTACK_SPEED, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);
    }
}
