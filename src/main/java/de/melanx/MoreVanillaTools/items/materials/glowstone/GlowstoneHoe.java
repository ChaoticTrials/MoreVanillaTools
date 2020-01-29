package de.melanx.MoreVanillaTools.items.materials.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class GlowstoneHoe extends HoeBase {

    private static final int SPEED = -2;

    public GlowstoneHoe() {
        super("glowstone_hoe", ItemTiers.GLOWSTONE, SPEED);
    }
}
