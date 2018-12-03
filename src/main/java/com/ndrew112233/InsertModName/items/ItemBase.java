package com.ndrew112233.InsertModName.items;

import com.ndrew112233.InsertModName.Main;
import com.ndrew112233.InsertModName.init.ModItems;
import com.ndrew112233.InsertModName.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) 
	{
		setUnlocalizedName(name); 
		setRegistryName(name); 
		setCreativeTab(CreativeTabs.MATERIALS); //Which tab in creative that this item is housed in
		
		ModItems.ITEMS.add(this); 
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
