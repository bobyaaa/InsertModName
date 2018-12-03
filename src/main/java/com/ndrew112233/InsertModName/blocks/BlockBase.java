package com.ndrew112233.InsertModName.blocks;

import com.ndrew112233.InsertModName.Main;
import com.ndrew112233.InsertModName.init.ModBlocks;
import com.ndrew112233.InsertModName.init.ModItems;
import com.ndrew112233.InsertModName.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name); 
		setRegistryName(name); 
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS); //Which tab in creative that this item is housed in
		
		ModBlocks.BLOCKS.add(this); 
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
