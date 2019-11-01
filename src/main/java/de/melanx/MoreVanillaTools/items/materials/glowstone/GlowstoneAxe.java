package de.melanx.MoreVanillaTools.items.materials.glowstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class GlowstoneAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 6;
    private static final int ATTACK_SPEED = -3;

    public GlowstoneAxe() {
        super("glowstone_axe", ItemTiers.GLOWSTONE_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
