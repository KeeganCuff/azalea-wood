package net.keegancuff.azaleawood.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.keegancuff.azaleawood.block.ModBlocks;

public class ModRegistries {

    public static void registerModFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModBlocks.AZALEA_LOG_ITEM, 300);
        registry.add(ModBlocks.AZALEA_PLANKS_ITEM, 300);
    }

    public static void register(){
        registerModFuels();
    }
}
