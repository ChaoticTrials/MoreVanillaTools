package de.melanx.MoreVanillaTools.items.materials.lapis;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class LapisHoe extends HoeBase {

    private static final float SPEED = -1.2F;

    public LapisHoe() {
        super("lapis_hoe", ItemTiers.LAPIS, SPEED);
    }
}
