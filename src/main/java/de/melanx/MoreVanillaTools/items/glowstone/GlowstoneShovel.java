package de.melanx.MoreVanillaTools.items.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class GlowstoneShovel extends ShovelBase {

    private static final int DAMAGE = 1;
    private static final float SPEED = -3.0F;

    public GlowstoneShovel() {
        super("glowstone_shovel", ItemTiers.GLOWSTONE_TIER, DAMAGE, SPEED);
    }
}
