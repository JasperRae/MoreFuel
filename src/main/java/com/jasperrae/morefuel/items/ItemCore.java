package com.jasperrae.morefuel.items;

import com.jasperrae.morefuel.MoreFuel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCore extends Item {
	private String name;

	public ItemCore(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreFuel.tabMoreFuel);
	}
	
}
