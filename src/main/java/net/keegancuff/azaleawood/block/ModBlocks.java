package net.keegancuff.azaleawood.block;

import net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.keegancuff.azaleawood.AzaleaWoodMod;
import net.minecraft.block.*;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

public class ModBlocks {
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Item AZALEA_LOG_ITEM = registerBlockItem("azalea_log", AZALEA_LOG);

    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Item STRIPPED_AZALEA_LOG_ITEM = registerBlockItem("stripped_azalea_log", STRIPPED_AZALEA_LOG);

    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Item AZALEA_WOOD_ITEM = registerBlockItem("azalea_wood", AZALEA_WOOD);

    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Item STRIPPED_AZALEA_WOOD_ITEM = registerBlockItem("stripped_azalea_wood", STRIPPED_AZALEA_WOOD);

    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Item AZALEA_PLANKS_ITEM = registerBlockItem("azalea_planks", AZALEA_PLANKS);

    public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Item AZALEA_SLAB_ITEM = registerBlockItem("azalea_slab", AZALEA_SLAB);

    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
            new StairsBlock(AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    public static final Item AZALEA_STAIRS_ITEM = registerBlockItem("azalea_stairs", AZALEA_STAIRS);

    public static final Block AZALEA_FENCE = registerBlock("azalea_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    public static final Item AZALEA_FENCE_ITEM = registerBlockItem("azalea_fence", AZALEA_FENCE);

    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
    public static final Item AZALEA_FENCE_GATE_ITEM = registerBlockItem("azalea_fence_gate", AZALEA_FENCE_GATE);

    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN));
    public static final Item AZALEA_DOOR_ITEM = registerBlockItem("azalea_door", AZALEA_DOOR);

    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN));
    public static final Item AZALEA_TRAPDOOR_ITEM = registerBlockItem("azalea_trapdoor", AZALEA_TRAPDOOR);

    public static final Block AZALEA_BUTTON = registerBlock("azalea_button",
            new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), 30, true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON));
    public static final Item AZALEA_BUTTON_ITEM = registerBlockItem("azalea_button", AZALEA_BUTTON);

    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final Item AZALEA_PRESSURE_PLATE_ITEM = registerBlockItem("azalea_pressure_plate", AZALEA_PRESSURE_PLATE);

    public static final Block AZALEA_SIGN = registerBlock("azalea_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignType.OAK)); // Not sure what the sign type does.
    public static final Block AZALEA_WALL_SIGN = registerBlock("azalea_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), SignType.OAK));
    public static final Item AZALEA_SIGN_ITEM = Registry.register(Registries.ITEM,
            new Identifier(AzaleaWoodMod.MOD_ID, "azalea_sign"),
            new SignItem(new FabricItemSettings(), AZALEA_SIGN, AZALEA_WALL_SIGN));



    private static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWoodMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AzaleaWoodMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private static void addToCreativeMenu(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.addAfter(Items.MANGROVE_LOG, AZALEA_LOG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(Items.MANGROVE_WOOD, AZALEA_LOG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_LOG, AZALEA_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_WOOD, STRIPPED_AZALEA_LOG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(STRIPPED_AZALEA_LOG, STRIPPED_AZALEA_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(STRIPPED_AZALEA_WOOD, AZALEA_PLANKS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_PLANKS, AZALEA_STAIRS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_STAIRS, AZALEA_SLAB));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_SLAB, AZALEA_FENCE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_FENCE, AZALEA_FENCE_GATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_FENCE_GATE, AZALEA_DOOR));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_DOOR, AZALEA_TRAPDOOR));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_TRAPDOOR, AZALEA_PRESSURE_PLATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(AZALEA_PRESSURE_PLATE, AZALEA_BUTTON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.addAfter(Items.MANGROVE_SIGN, AZALEA_SIGN));
    }

    public static void registerModBlocks() {
        addToCreativeMenu();
        AzaleaWoodMod.LOGGER.debug("Registering ModBlocks for " + AzaleaWoodMod.MOD_ID);
    }
}
