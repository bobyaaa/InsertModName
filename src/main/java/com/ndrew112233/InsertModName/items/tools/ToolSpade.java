package com.ndrew112233.InsertModName.items.tools;

import com.ndrew112233.InsertModName.Main;
import com.ndrew112233.InsertModName.init.ModItems;
import com.ndrew112233.InsertModName.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel {

	public ToolSpade(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name); 
		setRegistryName(name); 
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this); 
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
