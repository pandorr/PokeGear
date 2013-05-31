package net.PokeGear;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPokegear extends Item {

	private String texturePath;

	public ItemPokegear(int par1) {
		super(par1);
	


this.setCreativeTab(CreativeTabs.tabMisc);
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
 this.itemIcon = par1IconRegister.registerIcon("mod/pokegear");
}	
}
