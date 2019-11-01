package de.melanx.MoreVanillaTools.items.materials.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class GlowstoneShovel extends ShovelBase {

    private static final float DAMAGE = 0.5F;
    private static final float SPEED = -2.8F;

    public GlowstoneShovel() {
        super("glowstone_shovel", ItemTiers.GLOWSTONE_TIER, DAMAGE, SPEED);
    }
}
