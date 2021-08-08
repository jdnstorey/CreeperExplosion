package me.polo.creeperexplosion;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreeperExpEvent implements Listener {

    @EventHandler
    public void onExp(EntityExplodeEvent e){
        if(e.getEntity().getType() == EntityType.CREEPER){
            e.setCancelled(true);
        }
    }
}
