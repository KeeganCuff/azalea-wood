package net.keegancuff.azaleawood.tags;

import net.keegancuff.azaleawood.AzaleaWoodMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> AZALEA_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier(AzaleaWoodMod.MOD_ID, "azalea_logs"));
    public static final TagKey<Item> AZALEA_LOGS_ITEM = TagKey.of(RegistryKeys.ITEM, new Identifier(AzaleaWoodMod.MOD_ID, "azalea_logs"));
}
