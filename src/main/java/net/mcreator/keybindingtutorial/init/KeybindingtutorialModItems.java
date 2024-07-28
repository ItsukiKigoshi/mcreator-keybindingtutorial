
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keybindingtutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.keybindingtutorial.item.DemonicItem;
import net.mcreator.keybindingtutorial.KeybindingtutorialMod;

public class KeybindingtutorialModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KeybindingtutorialMod.MODID);
	public static final RegistryObject<Item> DEMONIC_HELMET = REGISTRY.register("demonic_helmet", () -> new DemonicItem.Helmet());
	public static final RegistryObject<Item> DEMONIC_CHESTPLATE = REGISTRY.register("demonic_chestplate", () -> new DemonicItem.Chestplate());
	public static final RegistryObject<Item> DEMONIC_LEGGINGS = REGISTRY.register("demonic_leggings", () -> new DemonicItem.Leggings());
	public static final RegistryObject<Item> DEMONIC_BOOTS = REGISTRY.register("demonic_boots", () -> new DemonicItem.Boots());
}
