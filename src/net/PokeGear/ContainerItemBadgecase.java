package net.PokeGear;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;

public class ContainerItemBadgecase extends Container {
	int i = (this.numOfRows - 4) * 18;
	int j;
	int k;
	
	public ContainerItemBadgecase(InventoryPlayer par1InventoryPlayer, EntityPlayer player, World world, int x, int y, int z) {
		TileEntityBadgecase chest = (TileEntityBadgecase) world.getBlockTileEntity(x, y, z);
		IInventory inv = player.inventory;
		
		for(int j = 0; j < inv.getSizeInventory(); i++) {
			inv.setInventorySlotContents(j, null);
		}
		
	for(int j = 0; j < chest.getSizeInventory(); j++) {
		inv.setInventorySlotContents(j, chest.getStackInSlot(j));
		
	}
		
		this.bottomPartGui = inv;
		this.numOfRows = inv.getSizeInventory() / 11;
		
		inv.openChest ();
		

		//Chest Inventory
		for(j = 0; j < this.numOfRows; j++) {
			for (k = 0; k < 9; k++) {
				this.addSlotToContainer(new Slot(inv, k + j * 11, 8 + k * 18, 18 + j * 18));
			
	
		//Player Inventory
		for(j = 0; j < this.numOfRows; j++) {
			for (k = 0; k < 9; k++) {
				this.addSlotToContainer(new Slot(par1InventoryPlayer, k + j * 9 + 9, 8 + k *18, 108 + j * 18 + i));
			}
		}}}
}
		
	public ContainerItemBadgecase() {
		// TODO Auto-generated constructor stub
	}

	public ContainerItemBadgecase(EntityPlayer player, World world, int x,
			int y, int z) {
		// TODO Auto-generated constructor stub
	}

	private IInventory bottomPartGui;
	private int numOfRows;
	

	public boolean canInteractWith(EntityPlayer entityplayer) {
		return this.bottomPartGui.isUseableByPlayer(entityplayer);
	}

}

