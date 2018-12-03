package com.ndrew112233.InsertModName.items.tools;

import com.ndrew112233.InsertModName.Main;
import com.ndrew112233.InsertModName.init.ModItems;
import com.ndrew112233.InsertModName.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel 
{

	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name); 
		setRegistryName(name); 
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this); 
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
