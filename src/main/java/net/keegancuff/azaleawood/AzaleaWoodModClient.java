package net.keegancuff.azaleawood;

import net.fabricmc.api.ClientModInitializer;
import net.keegancuff.azaleawood.registries.ModClientRegistries;

public class AzaleaWoodModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModClientRegistries.register();
    }
}
