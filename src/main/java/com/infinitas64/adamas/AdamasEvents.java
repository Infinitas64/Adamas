package com.infinitas64.adamas;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.world.item.Items.*;

@Mod.EventBusSubscriber(modid = "adamas")
public class AdamasEvents {
    @SubscribeEvent
    public static void modifyFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();
        if (item.equals(DIAMOND)) {
            event.setBurnTime(51200);
        }
        if (item.equals(DIAMOND_BLOCK)){
            event.setBurnTime(512000);
        }
        if (item.equals(DIAMOND_HELMET)){
            event.setBurnTime(256000);
        }
        if (item.equals(DIAMOND_CHESTPLATE)){
                event.setBurnTime(409600);
        }
        if (item.equals(DIAMOND_LEGGINGS)){
            event.setBurnTime(358400);
        }
        if (item.equals(DIAMOND_BOOTS)){
            event.setBurnTime(204800);
        }
        if (item.equals(DIAMOND_SWORD)){
            event.setBurnTime(51300);
        }
        if (item.equals(DIAMOND_PICKAXE)){
            event.setBurnTime(51300);
        }
        if (item.equals(DIAMOND_AXE)){
            event.setBurnTime(51300);
        }
        if (item.equals(DIAMOND_HOE)){
            event.setBurnTime(51300);
        }
        if (item.equals(DIAMOND_SHOVEL)){
            event.setBurnTime(51300);
        }
        if (item.equals(DIAMOND_HORSE_ARMOR)){
            event.setBurnTime(200000);
        }
    }
}