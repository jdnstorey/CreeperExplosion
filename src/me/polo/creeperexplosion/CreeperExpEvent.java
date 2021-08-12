package me.polo.creeperexplosion;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;

public class CreeperExpEvent implements Listener {

    @EventHandler
    public void onExp(EntityExplodeEvent e){
        if(e.getEntity().getType() == EntityType.CREEPER){
            e.setCancelled(true);
        }
    }

    public void IFBreak(HangingBreakByEntityEvent f){
        if(f.getEntity().getType() == EntityType.ITEM_FRAME){
            //not removing the cause, this is what caused the entity to be removed
            if(f.getCause() == HangingBreakEvent.RemoveCause.EXPLOSION){
                f.setCancelled(true);
            }
        }
    }
}
