package com.firenado.advancedvillagers;

import com.firenado.advancedvillagers.core.init.BlockInit;
import com.firenado.advancedvillagers.core.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdvancedVillagers.MODID)
public class AdvancedVillagers {
	public static final String MODID = "advancedvillagers";

	public AdvancedVillagers() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
	}
}
