package com.ekksvar.ediblepumpkinseeds.init;

import com.ekksvar.ediblepumpkinseeds.EdiblePumpkinSeeds;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = EdiblePumpkinSeeds.MOD_ID, bus = Bus.MOD)
@ObjectHolder(EdiblePumpkinSeeds.MOD_ID)
public class ItemInit 
{
	public static final Item toasted_pumpkin_seeds = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new BlockNamedItem(Blocks.PUMPKIN_STEM, (new Item.Properties()).group(Items.PUMPKIN_SEEDS.getGroup()).food(new Food.Builder().hunger(1).fastToEat().build())).setRegistryName(Items.PUMPKIN_SEEDS.getRegistryName()));
		//event.getRegistry().register(new BlockNamedItem(Blocks.PUMPKIN_STEM, (new Item.Properties()).group(Items.PUMPKIN_SEEDS.getGroup()).food(new Food.Builder().hunger(1).fastToEat().build())).setRegistryName(Items.PUMPKIN_SEEDS.getRegistryName()));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.3f).fastToEat().build())).setRegistryName("toasted_pumpkin_seeds"));
	}
}