package com.fantasycivs;

import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * All blocks of the mod. Currently empty.
 *
 * To add one:
 *   public static final DeferredBlock<Block> MY_BLOCK = BLOCKS.register("my_block",
 *           () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
 * then give it an item in ModItems (ITEMS.registerSimpleBlockItem(ModBlocks.MY_BLOCK)) and add its
 * blockstate, model, texture, loot table and lang entry under src/main/resources.
 */
public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FantasyCivs.MODID);

    private ModBlocks() {}
}
