package net.keegancuff.azaleawood.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.keegancuff.azaleawood.AzaleaWoodMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Item AZALEA_LOG_ITEM = registerBlockItem("azalea_log", AZALEA_LOG);

    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Item AZALEA_PLANKS_ITEM = registerBlockItem("azalea_planks", AZALEA_PLANKS);



    private static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWoodMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AzaleaWoodMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(AZALEA_LOG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(AZALEA_PLANKS));
        AzaleaWoodMod.LOGGER.debug("Registering ModBlocks for " + AzaleaWoodMod.MOD_ID);
    }
}
