package net.PokeGear;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ItemBadgecase extends Item {

	private static final TileEntity TileEntityBadgecase = null;
	private String texturePath;

	public ItemBadgecase(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

				
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
this.itemIcon = par1IconRegister.registerIcon("mod/Badgecase7");
}	


//public boolean onItemUse(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c ) {
	//TileEntityBadgecase chest = (TileEntityBadgecase) world.getBlockTileEntity(x, y, z);
			
	
	//if(player instanceof EntityPlayerMP){
		//IInventory inv = player.inventory;
		
		//for(int j = 0; j < inv.getSizeInventory(); i++) {
			//inv.setInventorySlotContents(j, null);
		//}
		
	//for(int j = 0; j < chest.getSizeInventory(); j++) {
		//inv.setInventorySlotContents(j, chest.getStackInSlot(j));
		
	//}
		
		//ModLoader.serverOpenWindow((EntityPlayerMP) player, new ContainerItemBadgecase(player, world, x, y, z), 30, x, y, z);
	//}else{
		//ModLoader.openGUI(player, new GuiBadgecase(player.inventory, x, y, z));
	//}
	//return true;
//}

	//public TileEntity createNewTileEntity(World par1World) {
		//return TileEntityBadgecase;
	//}

}


