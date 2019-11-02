package de.melanx.MoreVanillaTools.items.materials.paper;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class PaperHoe extends HoeBase {

    private static final float SPEED = -3F;

    public PaperHoe() {
        super("paper_hoe", ItemTiers.PAPER_TIER, SPEED);
    }
}
