package com.fantasycivs;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(FantasyCivs.MODID)
public class FantasyCivs {
    public static final String MODID = "fantasy_civs";

    public FantasyCivs(IEventBus modBus) {
        ModBlocks.BLOCKS.register(modBus);
        ModItems.ITEMS.register(modBus);
    }
}
