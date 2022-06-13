package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.compat.LibCompat;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {

    @SubscribeEvent
    public void livingDamage(LivingDamageEvent event) {
        Entity entity = event.getSource().getEntity();
        if (entity instanceof Player player && LibCompat.isMoreVanillaLibLoaded()) {
            LibCompat.onLivingDamageEvent(player, event);
        }
    }
}
