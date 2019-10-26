package de.melanx.MoreVanillaTools.items.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class ObsidianShovel extends ShovelBase {

    private static final int DAMAGE = 1;
    private static final float SPEED = -3.0F;

    public ObsidianShovel() {
        super("obsidian_shovel", ItemTiers.OBSIDIAN_TIER, DAMAGE, SPEED);
    }
}
