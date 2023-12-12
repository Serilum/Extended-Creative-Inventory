package com.natamus.extendedcreativeinventory.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.extendedcreativeinventory.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 100) public static int extendedItemGroupIndex = 4;

	public static void initConfig() {
		configMetaData.put("extendedItemGroupIndex", Arrays.asList(
			"The index of the 'Extended' creative tab. Can be changed if another mod already uses the default fifth spot (index 4)."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}