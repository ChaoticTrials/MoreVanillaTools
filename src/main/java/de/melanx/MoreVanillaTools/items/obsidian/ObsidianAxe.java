package de.melanx.MoreVanillaTools.items.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class ObsidianAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 0;
    private static final float ATTACK_SPEED = 2.8F;

    public ObsidianAxe() {
        super("obsidian_axe", ItemTiers.OBSIDIAN_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
