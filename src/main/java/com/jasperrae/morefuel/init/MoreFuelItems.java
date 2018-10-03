package com.jasperrae.morefuel.init;

import java.util.LinkedList;
import java.util.List;

import com.jasperrae.morefuel.MoreFuel;
import com.jasperrae.morefuel.items.ItemCore;
import com.jasperrae.morefuel.items.ItemFuel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MoreFuelItems {
	
	public static Item netherBrickCoal, netherBrickDust, glowingCoal, blazingCoal, charredChorusFruit, radiantFruit;
	
	public static void init() {
		netherBrickCoal = new ItemFuel("nether_brick_coal", 2400);
		netherBrickDust = new ItemCore("nether_brick_dust");
		glowingCoal = new ItemFuel("glowing_coal", 1600);
		blazingCoal = new ItemFuel("blazing_coal", 5400);
		charredChorusFruit = new ItemCore("charred_chorus_fruit");
		radiantFruit = new ItemFuel("radiant_fruit", 3200);
	} 
	
	public static void register() {
		registerItem(netherBrickCoal);
		registerItem(netherBrickDust);
		registerItem(glowingCoal);
		registerItem(blazingCoal);
		registerItem(charredChorusFruit);
		registerItem(radiantFruit);
	}
	
	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}
	
	public static void registerRenders() {
		registerRender(netherBrickCoal);
		registerRender(netherBrickDust);
		registerRender(glowingCoal);
		registerRender(blazingCoal);
		registerRender(charredChorusFruit);
		registerRender(radiantFruit);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MoreFuel.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
