package de.melanx.MoreVanillaTools.items.emerald;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class EmeraldHoe extends HoeBase {

    private static final int SPEED = -2;

    public EmeraldHoe() {
        super("emerald_hoe", ItemTiers.EMERALD_TIER, SPEED);
    }
}
