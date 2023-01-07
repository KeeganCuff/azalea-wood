package net.keegancuff.azaleawood.registries;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.keegancuff.azaleawood.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ModClientRegistries {

    public static void registerTransparentBlocks(){
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.AZALEA_DOOR, ModBlocks.AZALEA_TRAPDOOR);
    }

    public static void register(){
        registerTransparentBlocks();
    }
}
