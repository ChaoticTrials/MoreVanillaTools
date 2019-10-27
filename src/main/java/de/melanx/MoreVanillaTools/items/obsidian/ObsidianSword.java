package de.melanx.MoreVanillaTools.items.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class ObsidianSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.6F;

    public ObsidianSword() {
        super("obsidian_sword", ItemTiers.OBSIDIAN_TIER, DAMAGE, SPEED);
    }
}
