package net.PokeGear;

import java.sql.Time;

import net.minecraft.block.Block;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = Basemod.modid, name = "PokeGear", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Basemod  {
	
public static final String modid = "PokeGear";
    
public static Item Badgecase;
public static Item Watersprayer;
public static Item Pokegear;
public static Item RunningBoots;
public static EnumArmorMaterial armorPoke = EnumHelper.addArmorMaterial("POKE", 66, new int[]{3, 8, 6, 3}, 22);




@Init
public void load(FMLInitializationEvent event) {

	TickRegistry.registerTickHandler(new CommonTickHandler(), Side.SERVER);
	
//TODO Badgecase = new ItemBadgecase(3000).setUnlocalizedName("Badgecase7");
//TODO LanguageRegistry.addName(Badgecase, "Red Badgecase");
// TODO GameRegistry.registerTileEntity(TileEntityBadgecase.class, TileEntityBadgecase);


Watersprayer = new ItemWaterSprayer(7001).setUnlocalizedName("Watersprayer");
LanguageRegistry.addName(Watersprayer, "Wailmer Pail");
GameRegistry.addRecipe(new ItemStack(Watersprayer), new Object[]{
	"X X",
	"XRX",
	"XXX",
	'X', Item.ingotIron, 'R', Item.bucketWater});


Pokegear = new ItemPokegear(7002).setUnlocalizedName("Pokegear");
LanguageRegistry.addName(Pokegear, "PokeGear"); 


RunningBoots = new ItemrunningBoots(8995, armorPoke, ModLoader.addArmor("Poke"), 3).setUnlocalizedName("RunningShoes").setCreativeTab(CreativeTabs.tabTools);
LanguageRegistry.addName(RunningBoots, "Running Shoes");


GameRegistry.addRecipe(new ItemStack(RunningBoots), new Object[]{
    "XYX",
    "Z Z",
    "Z Z",
    'X', net.minecraft.item.Item.ingotIron,
    'Y', net.minecraft.block.Block.cloth,
    'Z', net.minecraft.item.Item.leather 
   });
	
//Thats a good sign. Now it I know it is loading.
}


}
// TODO public GuiContainer getContainerGUI(EntityClientPlayerMP, int id, int x, int y, int z ){
	//switch(id){
	//case 30:
		//return new GuiBadgecase(player.inventory, x, y, z);
		//default : {
			//return null;

		//}
	//}
//}




