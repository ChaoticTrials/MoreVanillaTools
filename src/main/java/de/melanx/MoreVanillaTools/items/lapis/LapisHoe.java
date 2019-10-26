package de.melanx.MoreVanillaTools.items.lapis;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class LapisHoe extends HoeBase {

    private static final int SPEED = -2;

    public LapisHoe() {
        super("lapis_hoe", ItemTiers.LAPIS_TIER, SPEED);
    }
}
