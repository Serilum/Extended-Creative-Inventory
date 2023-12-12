package com.natamus.extendedcreativeinventory.process;

import com.natamus.collective.functions.ItemFunctions;
import com.natamus.extendedcreativeinventory.config.ConfigHandler;
import com.natamus.extendedcreativeinventory.itemgroups.ExtendedItemGroup;
import com.natamus.extendedcreativeinventory.util.Variables;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ProcessItems {
    public static void process(Registry<Item> itemRegistry) {
        Variables.EXTENDED = new ExtendedItemGroup(ConfigHandler.extendedItemGroupIndex, "extended");

        for (ResourceLocation rl : itemRegistry.keySet()) {
            Item item = itemRegistry.get(rl);
            if (item.equals(Items.AIR)) {
                continue;
            }

            if (item.getItemCategory() == null) {
                ItemFunctions.setItemCategory(item, Variables.EXTENDED);
            }
        }
    }
}
