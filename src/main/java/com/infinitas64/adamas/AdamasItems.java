package com.infinitas64.adamas;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AdamasItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Adamas.MOD_ID);

    public static final RegistryObject<Item> COBBLESTONE_NUGGET = ITEMS.register("cobblestone_nugget", () -> new Item(new Item.Properties()));
}
