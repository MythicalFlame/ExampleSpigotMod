package me.mythicalflame.examplespigotmod;

import me.mythicalflame.examplespigotmod.items.*;
import me.mythicalflame.spigotmodding.SpigotModding;
import me.mythicalflame.spigotmodding.items.ModdedItem;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExampleSpigotMod extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        ModdedItem[] items = {new ModdedItemWalkingStick(), new ModdedItemTinSword(), new ModdedConsumableSpeedBoost(), new ModdedItemDivineCrystal()};
        SpigotModding.registerItems(items);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
