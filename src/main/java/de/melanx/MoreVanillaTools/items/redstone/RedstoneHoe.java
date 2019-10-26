package de.melanx.MoreVanillaTools.items.redstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class RedstoneHoe extends HoeBase {

    private static final int SPEED = -2;

    public RedstoneHoe() {
        super("redstone_hoe", ItemTiers.REDSTONE_TIER, SPEED);
    }
}
