package com.firenado.advancedvillagers.core.init;

import com.firenado.advancedvillagers.AdvancedVillagers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit {
	private BlockInit() {
		
	}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedVillagers.MODID);
	
	public static final RegistryObject<Block> OAK_CHAIR = BLOCKS.register("oak_chair", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0f, 3.0f)));
}
