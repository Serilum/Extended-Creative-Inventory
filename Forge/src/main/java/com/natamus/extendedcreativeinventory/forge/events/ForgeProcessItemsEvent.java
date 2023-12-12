package com.natamus.extendedcreativeinventory.forge.events;

import com.natamus.collective.functions.WorldFunctions;
import com.natamus.extendedcreativeinventory.events.ProcessItemsEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeProcessItemsEvent {
	@SubscribeEvent
	public void onWorldLoad(LevelEvent.Load e) {
        Level level = WorldFunctions.getWorldIfInstanceOfAndNotRemote(e.getLevel());
        if (level == null) {
            return;
        }

        ProcessItemsEvent.onWorldLoad((ServerLevel)level);
    }
}
