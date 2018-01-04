package com.jasperrae.morefuel.items;

import net.minecraft.item.ItemStack;

public class ItemFuel extends ItemCore {

	private int burnTime = 0;

	public ItemFuel(String name, int burnTime) {
		super(name);
		this.burnTime = burnTime;
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return burnTime;
	}

}
