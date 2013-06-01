package net.PokeGear;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class CommonTickHandler implements ITickHandler
{

		private void onPlayerTick(EntityPlayer player) {
				if (player.getCurrentItemOrArmor(4) != null ) {
					ItemStack helmet = player.getCurrentItemOrArmor(4);
					 ItemStack chest = player.getCurrentItemOrArmor(3);
					ItemStack legs = player.getCurrentItemOrArmor(2);
					ItemStack boots = player.getCurrentItemOrArmor(1);
					
						
					}
				
				if(player.getCurrentItemOrArmor(1) != null){
					ItemStack boots = player.getCurrentItemOrArmor(1);
					if(boots.getItem() == Basemod.RunningBoots){
						player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 10, 1)));
					}
				}
			}

		 @Override
		 public void tickStart(EnumSet<TickType> type, Object... tickData)
		 {
		  if (type.equals(EnumSet.of(TickType.PLAYER, TickType.SERVER)))
		  {
		    onPlayerTick((EntityPlayer)tickData[0]);
		  }
		 }

		 @Override
		 public EnumSet<TickType> ticks() 
		 {
		  return EnumSet.of(TickType.PLAYER, TickType.SERVER);
		 }

		@Override
		public void tickEnd(EnumSet<TickType> type, Object... tickData) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getLabel() {
			// TODO Auto-generated method stub
			return null;
		}
}
