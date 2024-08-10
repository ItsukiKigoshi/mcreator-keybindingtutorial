
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keybindingtutorial.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.keybindingtutorial.network.DemonicAbilityMessage;
import net.mcreator.keybindingtutorial.KeybindingtutorialMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class KeybindingtutorialModKeyMappings {
	public static final KeyMapping DEMONIC_ABILITY = new KeyMapping("key.keybindingtutorial.demonic_ability", GLFW.GLFW_KEY_M, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				KeybindingtutorialMod.PACKET_HANDLER.sendToServer(new DemonicAbilityMessage(0, 0));
				DemonicAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DEMONIC_ABILITY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DEMONIC_ABILITY.consumeClick();
			}
		}
	}
}
