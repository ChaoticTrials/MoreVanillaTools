package de.melanx.MoreVanillaTools.items.materials.paper;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class PaperAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 6;
    private static final float ATTACK_SPEED = -3.2F;

    public PaperAxe() {
        super("paper_axe", ItemTiers.PAPER_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
