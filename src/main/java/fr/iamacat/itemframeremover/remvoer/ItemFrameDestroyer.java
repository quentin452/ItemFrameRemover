package fr.iamacat.itemframeremover.remvoer;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class ItemFrameDestroyer {
    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        Entity entity = event.entity;
        if (entity instanceof EntityItemFrame) {
            entity.setDead(); // Destroy the item frame
        }
    }
}

