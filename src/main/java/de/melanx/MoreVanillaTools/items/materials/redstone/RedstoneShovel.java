package de.melanx.MoreVanillaTools.items.materials.redstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class RedstoneShovel extends ShovelBase {

    private static final float DAMAGE = 1.5F;
    private static final float SPEED = -3.0F;

    public RedstoneShovel() {
        super("redstone_shovel", ItemTiers.REDSTONE, DAMAGE, SPEED);
    }
}
