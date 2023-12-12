package com.natamus.extendedcreativeinventory.events;

import com.natamus.extendedcreativeinventory.process.ProcessItems;
import net.minecraft.core.Registry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Item;

public class ProcessItemsEvent {
    private static boolean processedItems = false;

    public static void onWorldLoad(ServerLevel serverLevel) {
        if (!processedItems) {
            Registry<Item> itemRegistry = serverLevel.registryAccess().registryOrThrow(Registry.ITEM_REGISTRY);

            ProcessItems.process(itemRegistry);

            processedItems = true;
        }
    }
}
