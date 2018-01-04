package com.jasperrae.morefuel.init;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class VanillaFuels {

	@SubscribeEvent
	public static void onEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemStack = event.getItemStack();
		Item item = itemStack.getItem();
		
		//maybe make switch statement (how?)
		
		if (item == Items.MAGMA_CREAM) {
			event.setBurnTime(2400);
		} 
		
		if (item == Items.BLAZE_POWDER) {
			event.setBurnTime(1200);
		}
		
		if (item == Items.FIRE_CHARGE) {
			event.setBurnTime(1600);
		}
	}

	
}
