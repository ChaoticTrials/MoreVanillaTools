package de.melanx.MoreVanillaTools.items.materials.paper;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class PaperShovel extends ShovelBase {

    private static final float DAMAGE = 1.5F;
    private static final float SPEED = -3.0F;

    public PaperShovel() {
        super("paper_shovel", ItemTiers.PAPER_TIER, DAMAGE, SPEED);
    }
}
