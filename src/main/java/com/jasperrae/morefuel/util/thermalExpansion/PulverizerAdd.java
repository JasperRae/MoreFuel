package com.jasperrae.morefuel.util.thermalExpansion;

import com.jasperrae.morefuel.init.MoreFuelItems;

import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class PulverizerAdd extends PulverizerManager {
	public static void initialize() {
		
		int energy = 3000;
		
		addRecipe(energy, new ItemStack(Items.NETHERBRICK), new ItemStack(MoreFuelItems.netherBrickDust));
		
	}
}
