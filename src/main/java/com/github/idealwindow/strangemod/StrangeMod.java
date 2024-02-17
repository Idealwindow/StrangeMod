package com.github.idealwindow.strangemod;
import com.github.idealwindow.strangemod.item.GlassShard;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrangeMod implements ModInitializer{
    public static final String MOD_ID = "StrangeMod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final GlassShard GLASS_SHARD = Registry.register(
            Registries.ITEM,
            new Identifier("strangemod","glass_shard"),
            new GlassShard(new FabricItemSettings().maxCount(64)));
    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> content.add(GLASS_SHARD));
    }
}
