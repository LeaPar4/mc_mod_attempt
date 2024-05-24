package modtest.modid;

import modtest.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ModTest implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "modtest";
	// an instance of our new item
	//public static final Item POMELO = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		//Registry.register(Registries.ITEM, new Identifier("modtest", "pomelo"), POMELO);
		ModItems.registerModItems();
	}
}