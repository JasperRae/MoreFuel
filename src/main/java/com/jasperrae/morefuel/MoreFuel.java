package com.jasperrae.morefuel;

import com.jasperrae.morefuel.init.MoreFuelItems;
import com.jasperrae.morefuel.init.MoreFuelTab;
import com.jasperrae.morefuel.proxy.CommonProxy;
import com.jasperrae.morefuel.util.thermalExpansion.PulverizerAdd;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MoreFuel.MOD_ID, name = MoreFuel.NAME, version = MoreFuel.VERSION, acceptedMinecraftVersions = MoreFuel.ACCEPTED_VERSIONS)
public class MoreFuel {
	public static final String MOD_ID = "jmorefuel";
	public static final String NAME = "JasperRae's More Fuel Mod";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "1.12.2";
	public static final String CLIENT_PROXY_CLASS = "com.jasperrae.morefuel.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.jasperrae.morefuel.proxy.ServerProxy";
	public static final CreativeTabs tabMoreFuel = new MoreFuelTab("tabMoreFuel");
	
	@Instance (MOD_ID)
	public static MoreFuel instance;
	
	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MoreFuelItems.init();
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		if (Loader.isModLoaded("thermalexpansion")) {
			PulverizerAdd.initialize();
		}
	}

}
