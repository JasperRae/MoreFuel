package com.jasperrae.morefuel.proxy;

import com.jasperrae.morefuel.MoreFuel;
import com.jasperrae.morefuel.init.MoreFuelItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy implements CommonProxy {
	
	@Mod.EventBusSubscriber(modid = MoreFuel.MOD_ID, value = Side.CLIENT)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			
			MoreFuelItems.registerRenders();
			
		}
	}

	@Override
	public void preInit() {
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}
	
}
