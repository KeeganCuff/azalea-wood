package net.keegancuff.azaleawood;

import net.fabricmc.api.ModInitializer;
import net.keegancuff.azaleawood.block.ModBlocks;
import net.keegancuff.azaleawood.registries.ModRegistries;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AzaleaWoodMod implements ModInitializer {
	public static final String MOD_ID = "azaleawood";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModRegistries.register();
	}
}
