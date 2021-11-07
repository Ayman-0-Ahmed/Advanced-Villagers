package com.firenado.advacedvillagers.core.init;

import com.firenado.advacedvillagers.AdvancedVillagers;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {
	private ItemInit() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedVillagers.MODID);
	
	public static final RegistryObject<Item> MARKER_STORAGE = ITEMS.register("marker_storage", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
