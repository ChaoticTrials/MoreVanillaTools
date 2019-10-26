package de.melanx.MoreVanillaTools.items.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class GlowstoneAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 0;
    private static final float ATTACK_SPEED = 2.8F;

    public GlowstoneAxe() {
        super("glowstone_axe", ItemTiers.GLOWSTONE_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
