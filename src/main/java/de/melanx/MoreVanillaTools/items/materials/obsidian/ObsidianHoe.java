package de.melanx.MoreVanillaTools.items.materials.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class ObsidianHoe extends HoeBase {

    private static final int SPEED = -2;

    public ObsidianHoe() {
        super("obsidian_hoe", ItemTiers.OBSIDIAN_TIER, SPEED);
    }
}
