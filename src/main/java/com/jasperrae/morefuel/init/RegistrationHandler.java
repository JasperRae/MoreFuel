package com.jasperrae.morefuel.init;

import java.util.LinkedList;
import java.util.List;

import com.jasperrae.morefuel.MoreFuel;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MoreFuel.MOD_ID)
public class RegistrationHandler {
	
	public static final List<Item> ITEMS = new LinkedList<>();
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		MoreFuelItems.init();
		MoreFuelItems.register();
		ITEMS.stream().forEach(item -> event.getRegistry().register(item));
	}
	
}