package net.PokeGear;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemrunningBoots extends ItemArmor{

	private Icon iconIndex;
	
	public ItemrunningBoots(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);


	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister, ItemStack itemstack)
	{
		
		if (itemstack.isItemEqual(new ItemStack(this))){
     this.iconIndex = par1IconRegister.registerIcon("textures/item/mod/runningshoes");}
		
	}	
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister par1IconRegister)
	{
		this.iconIndex = par1IconRegister.registerIcon("textures/item/mod/runningshoes");
	
	
}
	
	
}