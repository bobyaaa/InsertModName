package com.ndrew112233.InsertModName.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase 
{

	public RubyBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL); // Walking sound
		setHardness(5.0F);			   // Breaking difficulty 
		setResistance(15.0F);		   // Resistance to TNT
		setHarvestLevel("pickaxe", 2); // Allowed to break with
		setLightLevel(1.0F);		   // Light Emitted
		//setLightOpacity(1);		   // Light allowed to pass through block, i.e. window
		//setBlockUnbreakable();		   
	}

}
