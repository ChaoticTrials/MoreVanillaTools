package de.melanx.MoreVanillaTools.items.materials.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class GlowstoneSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.2F;

    public GlowstoneSword() {
        super("glowstone_sword", ItemTiers.GLOWSTONE, DAMAGE, SPEED);
    }
}
