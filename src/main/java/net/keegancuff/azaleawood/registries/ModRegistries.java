package net.keegancuff.azaleawood.registries;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.keegancuff.azaleawood.block.ModBlocks;

public class ModRegistries {

    public static void registerStrippableBlocks(){
        StrippableBlockRegistry.register(ModBlocks.AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_LOG);
        StrippableBlockRegistry.register(ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_WOOD);
    }

    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.AZALEA_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_AZALEA_LOG, 5, 5);
        registry.add(ModBlocks.AZALEA_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_AZALEA_WOOD, 5, 5);
        registry.add(ModBlocks.AZALEA_PLANKS, 5, 20);
        registry.add(ModBlocks.AZALEA_SLAB, 5, 20);
        registry.add(ModBlocks.AZALEA_STAIRS, 5, 20);
        registry.add(ModBlocks.AZALEA_FENCE, 5, 20);
        registry.add(ModBlocks.AZALEA_FENCE_GATE, 5, 20);
    }

    public static void registerModFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModBlocks.AZALEA_LOG_ITEM, 300);
        registry.add(ModBlocks.STRIPPED_AZALEA_LOG_ITEM, 300);
        registry.add(ModBlocks.AZALEA_WOOD_ITEM, 300);
        registry.add(ModBlocks.STRIPPED_AZALEA_WOOD_ITEM, 300);
        registry.add(ModBlocks.AZALEA_PLANKS_ITEM, 300);
        registry.add(ModBlocks.AZALEA_SLAB_ITEM, 150);
        registry.add(ModBlocks.AZALEA_STAIRS_ITEM, 300);
        registry.add(ModBlocks.AZALEA_FENCE_ITEM, 300);
        registry.add(ModBlocks.AZALEA_FENCE_GATE_ITEM, 300);
        registry.add(ModBlocks.AZALEA_TRAPDOOR_ITEM, 300);
        registry.add(ModBlocks.AZALEA_DOOR_ITEM, 200);
        registry.add(ModBlocks.AZALEA_SIGN_ITEM, 200);
    }


    public static void register(){
        registerStrippableBlocks();
        registerFlammableBlocks();
        registerModFuels();
    }
}
