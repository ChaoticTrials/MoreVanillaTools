package de.melanx.MoreVanillaTools.items.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class GlowstoneSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.4F;

    public GlowstoneSword() {
        super("glowstone_sword", ItemTiers.GLOWSTONE_TIER, DAMAGE, SPEED);
    }
}
