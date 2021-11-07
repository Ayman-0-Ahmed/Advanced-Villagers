package com.firenado.advacedvillagers;

import com.firenado.advacedvillagers.core.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdvancedVillagers.MODID)
public class AdvancedVillagers {
	public static final String MODID = "advancedvillagers";
	
	public AdvancedVillagers() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
				
	}
}