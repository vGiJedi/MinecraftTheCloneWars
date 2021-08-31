
package net.mcreator.starwarsmod.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.starwarsmod.procedures.SepratistFactionConditionProcedure;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.google.common.collect.ImmutableMap;

@StarwarsmodModElements.ModElement.Tag
public class SepratistFactionOverlayOverlay extends StarwarsmodModElements.ModElement {
	public SepratistFactionOverlayOverlay(StarwarsmodModElements instance) {
		super(instance, 460);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (SepratistFactionConditionProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				Minecraft.getInstance().fontRenderer.drawString("Sepratist", posX + 162, posY + -112, -16777063);
			}
		}
	}
}
