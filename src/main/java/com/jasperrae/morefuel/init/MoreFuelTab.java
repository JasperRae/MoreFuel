package com.jasperrae.morefuel.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreFuelTab extends CreativeTabs {

	public MoreFuelTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(MoreFuelItems.netherBrickCoal);
	}

}
