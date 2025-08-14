package com.knightmare.extendedspawner;

import net.fabricmc.api.ModInitializer;

public class ExtendedSpawnerMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("[ExtendedSpawnerMod] Loaded! Spawners now have extended 64-block range including vertical.");
    }
}
