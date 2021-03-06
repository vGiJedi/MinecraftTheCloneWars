/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.starwarsmod;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class StarwarsmodModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public StarwarsmodModElements() {
		sounds.put(new ResourceLocation("starwarsmod", "gonkgonk"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "gonkgonk")));
		sounds.put(new ResourceLocation("starwarsmod", "gonkstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "gonkstep")));
		sounds.put(new ResourceLocation("starwarsmod", "gonkwalk"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "gonkwalk")));
		sounds.put(new ResourceLocation("starwarsmod", "mousedeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "mousedeath")));
		sounds.put(new ResourceLocation("starwarsmod", "obiwandefeattheme"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "obiwandefeattheme")));
		sounds.put(new ResourceLocation("starwarsmod", "anakindefeattheme"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "anakindefeattheme")));
		sounds.put(new ResourceLocation("starwarsmod", "anakinspawntheme"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "anakinspawntheme")));
		sounds.put(new ResourceLocation("starwarsmod", "obiwanspawntheme"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "obiwanspawntheme")));
		sounds.put(new ResourceLocation("starwarsmod", "anakinhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "anakinhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "anakaindefeat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "anakaindefeat")));
		sounds.put(new ResourceLocation("starwarsmod", "obiwandefeat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "obiwandefeat")));
		sounds.put(new ResourceLocation("starwarsmod", "clonedeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "clonedeath")));
		sounds.put(new ResourceLocation("starwarsmod", "obiwanhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "obiwanhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "clonetrooperfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "clonetrooperfire")));
		sounds.put(new ResourceLocation("starwarsmod", "astromechliving"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "astromechliving")));
		sounds.put(new ResourceLocation("starwarsmod", "astromechhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "astromechhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "astromechdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "astromechdeath")));
		sounds.put(new ResourceLocation("starwarsmod", "obiwanrightclick"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "obiwanrightclick")));
		sounds.put(new ResourceLocation("starwarsmod", "ahsokahurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "ahsokahurt")));
		sounds.put(new ResourceLocation("starwarsmod", "ahsokadefeat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "ahsokadefeat")));
		sounds.put(new ResourceLocation("starwarsmod", "darksaberswing1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "darksaberswing1")));
		sounds.put(new ResourceLocation("starwarsmod", "darksaberswing2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "darksaberswing2")));
		sounds.put(new ResourceLocation("starwarsmod", "darksaberswing3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "darksaberswing3")));
		sounds.put(new ResourceLocation("starwarsmod", "darksaberswing4"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "darksaberswing4")));
		sounds.put(new ResourceLocation("starwarsmod", "darksaberswing5"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "darksaberswing5")));
		sounds.put(new ResourceLocation("starwarsmod", "darksabrerhum"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "darksabrerhum")));
		sounds.put(new ResourceLocation("starwarsmod", "superbattledroidhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "superbattledroidhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "superbattledroiddeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "superbattledroiddeath")));
		sounds.put(new ResourceLocation("starwarsmod", "battledroidhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "battledroidhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "battledroiddeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "battledroiddeath")));
		sounds.put(new ResourceLocation("starwarsmod", "battledroidfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "battledroidfire")));
		sounds.put(new ResourceLocation("starwarsmod", "superbattledroidfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "superbattledroidfire")));
		sounds.put(new ResourceLocation("starwarsmod", "clonehurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "clonehurt")));
		sounds.put(new ResourceLocation("starwarsmod", "battledroidstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "battledroidstep")));
		sounds.put(new ResourceLocation("starwarsmod", "barcidle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "barcidle")));
		sounds.put(new ResourceLocation("starwarsmod", "rps-6fire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "rps-6fire")));
		sounds.put(new ResourceLocation("starwarsmod", "rps-6launche"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "rps-6launche")));
		sounds.put(new ResourceLocation("starwarsmod", "misslefire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "misslefire")));
		sounds.put(new ResourceLocation("starwarsmod", "dc-15"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc-15")));
		sounds.put(new ResourceLocation("starwarsmod", "dc-15c"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc-15c")));
		sounds.put(new ResourceLocation("starwarsmod", "dc-17"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc-17")));
		sounds.put(new ResourceLocation("starwarsmod", "e5_commando"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "e5_commando")));
		sounds.put(new ResourceLocation("starwarsmod", "probeidle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "probeidle")));
		sounds.put(new ResourceLocation("starwarsmod", "probefire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "probefire")));
		sounds.put(new ResourceLocation("starwarsmod", "scorchhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "scorchhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "scorchdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "scorchdeath")));
		sounds.put(new ResourceLocation("starwarsmod", "scorchkillai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "scorchkillai")));
		sounds.put(new ResourceLocation("starwarsmod", "scorchspawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "scorchspawn")));
		sounds.put(new ResourceLocation("starwarsmod", "dc-17m"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc-17m")));
		sounds.put(new ResourceLocation("starwarsmod", "sevhurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "sevhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "sevdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "sevdeath")));
		sounds.put(new ResourceLocation("starwarsmod", "sevspawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "sevspawn")));
		sounds.put(new ResourceLocation("starwarsmod", "sevkillai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "sevkillai")));
		sounds.put(new ResourceLocation("starwarsmod", "bosshurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "bosshurt")));
		sounds.put(new ResourceLocation("starwarsmod", "bossdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "bossdeath")));
		sounds.put(new ResourceLocation("starwarsmod", "bossspawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "bossspawn")));
		sounds.put(new ResourceLocation("starwarsmod", "bosskillai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "bosskillai")));
		sounds.put(new ResourceLocation("starwarsmod", "fixerhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "fixerhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "fixerdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "fixerdeath")));
		sounds.put(new ResourceLocation("starwarsmod", "fixerspawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "fixerspawn")));
		sounds.put(new ResourceLocation("starwarsmod", "fixerkillai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "fixerkillai")));
		sounds.put(new ResourceLocation("starwarsmod", "mousedroididle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "mousedroididle")));
		sounds.put(new ResourceLocation("starwarsmod", "dc15coverheat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc15coverheat")));
		sounds.put(new ResourceLocation("starwarsmod", "dc-17msniperfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc-17msniperfire")));
		sounds.put(new ResourceLocation("starwarsmod", "valken_38xfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "valken_38xfire")));
		sounds.put(new ResourceLocation("starwarsmod", "maulswing1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "maulswing1")));
		sounds.put(new ResourceLocation("starwarsmod", "maulhit2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "maulhit2")));
		sounds.put(new ResourceLocation("starwarsmod", "maulhit3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "maulhit3")));
		sounds.put(new ResourceLocation("starwarsmod", "maulhit4"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "maulhit4")));
		sounds.put(new ResourceLocation("starwarsmod", "maulhit5"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "maulhit5")));
		sounds.put(new ResourceLocation("starwarsmod", "maulhum"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "maulhum")));
		sounds.put(new ResourceLocation("starwarsmod", "obiwanhum"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "obiwanhum")));
		sounds.put(new ResourceLocation("starwarsmod", "lightsaberhit1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "lightsaberhit1")));
		sounds.put(new ResourceLocation("starwarsmod", "lightsaberhit2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "lightsaberhit2")));
		sounds.put(new ResourceLocation("starwarsmod", "lightsaberhit3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "lightsaberhit3")));
		sounds.put(new ResourceLocation("starwarsmod", "lightsaberhit4"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "lightsaberhit4")));
		sounds.put(new ResourceLocation("starwarsmod", "lightsaberhit5"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "lightsaberhit5")));
		sounds.put(new ResourceLocation("starwarsmod", "dc17mgrenadefire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc17mgrenadefire")));
		sounds.put(new ResourceLocation("starwarsmod", "e-5"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "e-5")));
		sounds.put(new ResourceLocation("starwarsmod", "dc17mreload"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "dc17mreload")));
		sounds.put(new ResourceLocation("starwarsmod", "spiderdroidfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "spiderdroidfire")));
		sounds.put(new ResourceLocation("starwarsmod", "buzzdroididle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "buzzdroididle")));
		sounds.put(new ResourceLocation("starwarsmod", "buzzdroidspawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "buzzdroidspawn")));
		sounds.put(new ResourceLocation("starwarsmod", "vibrobladehit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "vibrobladehit")));
		sounds.put(new ResourceLocation("starwarsmod", "clonekillsai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "clonekillsai")));
		sounds.put(new ResourceLocation("starwarsmod", "cloneofficerkillsai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "cloneofficerkillsai")));
		sounds.put(new ResourceLocation("starwarsmod", "arctrooperkillsai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "arctrooperkillsai")));
		sounds.put(new ResourceLocation("starwarsmod", "droidkillsai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "droidkillsai")));
		sounds.put(new ResourceLocation("starwarsmod", "commandodroidkillsai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "commandodroidkillsai")));
		sounds.put(new ResourceLocation("starwarsmod", "superbattledroidkillsai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "superbattledroidkillsai")));
		sounds.put(new ResourceLocation("starwarsmod", "destroyerdroidshoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "destroyerdroidshoot")));
		sounds.put(new ResourceLocation("starwarsmod", "commandodroidhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "commandodroidhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "commandodroidjump"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "commandodroidjump")));
		sounds.put(new ResourceLocation("starwarsmod", "atrtstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "atrtstep")));
		sounds.put(new ResourceLocation("starwarsmod", "atrtstartup"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "atrtstartup")));
		sounds.put(new ResourceLocation("starwarsmod", "atrtfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "atrtfire")));
		sounds.put(new ResourceLocation("starwarsmod", "atrtoverheat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "atrtoverheat")));
		sounds.put(new ResourceLocation("starwarsmod", "ewebfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "ewebfire")));
		sounds.put(new ResourceLocation("starwarsmod", "eweboverheat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "eweboverheat")));
		sounds.put(new ResourceLocation("starwarsmod", "atrtturnoff"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "atrtturnoff")));
		sounds.put(new ResourceLocation("starwarsmod", "rg-4dfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "rg-4dfire")));
		sounds.put(new ResourceLocation("starwarsmod", "virobladeswing"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "virobladeswing")));
		sounds.put(new ResourceLocation("starwarsmod", "e5cfire"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "e5cfire")));
		sounds.put(new ResourceLocation("starwarsmod", "e5sfire"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "e5sfire")));
		sounds.put(new ResourceLocation("starwarsmod", "geonosianblasterfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "geonosianblasterfire")));
		sounds.put(new ResourceLocation("starwarsmod", "geonosianwingflap"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "geonosianwingflap")));
		sounds.put(new ResourceLocation("starwarsmod", "geonosiandeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "geonosiandeath")));
		sounds.put(new ResourceLocation("starwarsmod", "geonosianhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "geonosianhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "geonosianliving"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "geonosianliving")));
		sounds.put(new ResourceLocation("starwarsmod", "j10fire"), new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "j10fire")));
		sounds.put(new ResourceLocation("starwarsmod", "acklayscreech"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "acklayscreech")));
		sounds.put(new ResourceLocation("starwarsmod", "flamethroweron"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "flamethroweron")));
		sounds.put(new ResourceLocation("starwarsmod", "lr57fire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "lr57fire")));
		sounds.put(new ResourceLocation("starwarsmod", "senatecommandohurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "senatecommandohurt")));
		sounds.put(new ResourceLocation("starwarsmod", "senatecommandodeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "senatecommandodeath")));
		sounds.put(new ResourceLocation("starwarsmod", "stapfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "stapfire")));
		sounds.put(new ResourceLocation("starwarsmod", "siesmicchargepreexplosion"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "siesmicchargepreexplosion")));
		sounds.put(new ResourceLocation("starwarsmod", "siesmicgchargeexplosion"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "siesmicgchargeexplosion")));
		sounds.put(new ResourceLocation("starwarsmod", "seismicchargeexplosioncombined"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "seismicchargeexplosioncombined")));
		sounds.put(new ResourceLocation("starwarsmod", "magnaguarddeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "magnaguarddeath")));
		sounds.put(new ResourceLocation("starwarsmod", "magnaguardhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "magnaguardhurt")));
		sounds.put(new ResourceLocation("starwarsmod", "magnaguardspawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "magnaguardspawn")));
		sounds.put(new ResourceLocation("starwarsmod", "magnaguarduponkill"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "magnaguarduponkill")));
		sounds.put(new ResourceLocation("starwarsmod", "electrostaffloop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "electrostaffloop")));
		sounds.put(new ResourceLocation("starwarsmod", "electrostaffswing"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("starwarsmod", "electrostaffswing")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("starwarsmod").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == StarwarsmodModElements.ModElement.class)
						elements.add((StarwarsmodModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(StarwarsmodModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new StarwarsmodModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
	private int messageID = 0;
	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		StarwarsmodMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final StarwarsmodModElements elements;
		protected final int sortid;
		public ModElement(StarwarsmodModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
