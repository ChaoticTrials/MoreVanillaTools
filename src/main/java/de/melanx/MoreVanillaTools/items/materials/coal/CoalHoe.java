package de.melanx.MoreVanillaTools.items.materials.coal;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class CoalHoe extends HoeBase {

    private static final int SPEED = -2;

    public CoalHoe() {
        super("coal_hoe", ItemTiers.COAL_TIER, SPEED);
    }
}
