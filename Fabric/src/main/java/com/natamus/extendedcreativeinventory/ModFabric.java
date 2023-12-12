package com.natamus.extendedcreativeinventory;

import com.natamus.collective.check.RegisterMod;
import com.natamus.extendedcreativeinventory.events.ProcessItemsEvent;
import com.natamus.extendedcreativeinventory.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		ServerWorldEvents.LOAD.register((MinecraftServer server, ServerLevel serverLevel) -> {
			ProcessItemsEvent.onWorldLoad(serverLevel);
		});
	}

	private static void setGlobalConstants() {

	}
}
