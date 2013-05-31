package net.PokeGear;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class GuiBadgecase extends GuiContainer {

	public GuiBadgecase(EntityPlayer player, World world, int x, int y, int z) {
		super(new ContainerItemBadgecase(player, world, x, y, z) );
		
	}
	
	
	protected void drawGuiContainerForgroundLayer(int par1, int par2) {
		this.fontRenderer.drawString("Badgecase", 0, 0, 4210752);
		this.fontRenderer.drawString("Inventory", 0, 0, 4210752);
	}

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture("/gui/mod/badgecasegui.png");
		
		this.xSize = 640;
		this.ySize = 480;
		
	    int var2 = (this.height = this.ySize / 2);
		int var1 = (this.width = this.xSize / 2);
		
		this.drawTexturedModalRect(var1, var2, 0, 0, this.xSize, this.ySize);
	

}
}
