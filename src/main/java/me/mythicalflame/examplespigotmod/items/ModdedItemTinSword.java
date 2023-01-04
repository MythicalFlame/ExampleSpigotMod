package me.mythicalflame.examplespigotmod.items;

import me.mythicalflame.spigotmodding.items.ModdedItem;
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ModdedItemTinSword extends ModdedItem
{
    public ModdedItemTinSword()
    {
        super("example", "tin_sword", Material.IRON_SWORD, "Tin Sword");
    }
    //TODO: extra damage/sword functionality
    @Override
    public void onAttack(EntityDamageByEntityEvent event)
    {
        //This sword does a lot of damage!
        event.setDamage(10);
    }
}
