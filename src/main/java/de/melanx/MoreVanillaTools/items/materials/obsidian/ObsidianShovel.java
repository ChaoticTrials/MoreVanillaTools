package de.melanx.MoreVanillaTools.items.materials.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class ObsidianShovel extends ShovelBase {

    private static final float DAMAGE = 0.5F;
    private static final float SPEED = -3.2F;

    public ObsidianShovel() {
        super("obsidian_shovel", ItemTiers.OBSIDIAN_TIER, DAMAGE, SPEED);
    }
}
