package net.PokeGear;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.ISidedInventory;
import net.minecraftforge.common.ForgeDirection;

public class TileEntityBadgecase extends TileEntity implements ISidedInventory {

	private ItemStack[] chestStuff = new ItemStack[32];
	
	private String localizedName;

	public int getSizeInventory() {
		return 32;
	}

	public ItemStack getStackInSlot(int i) {
		return this.chestStuff[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		
	}

	public String getInvName() {
		return this.isInvNameLocalized() ? this.localizedName : "container.badgecase";
	}

	public boolean isInvNameLocalized() {
		return this.localizedName != null && this.localizedName.length() > 0;
	}


	public int getInventoryStackLimit() {
		return 1;
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return true;
	}

	@Override
	public void openChest() {
		// TODO Auto-generated method stub
		
	}

	public void func_94043_a(String par1Str) {
		this.localizedName = par1Str;
		

		
	}
	
	@Override
	public void closeChest() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public boolean isStackValidForSlot(int i, ItemStack itemstack) {
		//TODO 	return BadgeID's;
	//}

	@Override
	@Deprecated
	public
	int getStartInventorySide(ForgeDirection side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Deprecated
	public
	int getSizeInventorySide(ForgeDirection side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isStackValidForSlot(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		return false;
	}

}
