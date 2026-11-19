package com.fantasycivs;

import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * All items of the mod (including the items of blocks). Currently empty.
 *
 * To add one:
 *   public static final DeferredItem<Item> MY_ITEM = ITEMS.registerSimpleItem("my_item");
 * then add its item model, texture and lang entry under src/main/resources.
 */
public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FantasyCivs.MODID);

    private ModItems() {}
}
