
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keybindingtutorial.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.keybindingtutorial.KeybindingtutorialMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeybindingtutorialModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KeybindingtutorialMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(KeybindingtutorialModItems.DEMONIC_HELMET.get());
			tabData.accept(KeybindingtutorialModItems.DEMONIC_CHESTPLATE.get());
			tabData.accept(KeybindingtutorialModItems.DEMONIC_LEGGINGS.get());
			tabData.accept(KeybindingtutorialModItems.DEMONIC_BOOTS.get());
		}
	}
}
