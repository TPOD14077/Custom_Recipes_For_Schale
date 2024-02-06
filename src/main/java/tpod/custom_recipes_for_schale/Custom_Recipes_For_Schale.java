package tpod.custom_recipes_for_schale;

import org.bukkit.plugin.java.JavaPlugin;
import tpod.custom_recipes_for_schale.Custom_Recipes.Ores.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Others.*;

import static org.bukkit.Bukkit.resetRecipes;

public final class Custom_Recipes_For_Schale extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Enchanted_Gold_Apple(),this);
        getServer().getPluginManager().registerEvents(new Elytra(),this);
        getServer().getPluginManager().registerEvents(new Budding_Amethyst(),this);
        getServer().getPluginManager().registerEvents(new Saddle(),this);
        getServer().getPluginManager().registerEvents(new Diamond_Ore(),this);
        getServer().getPluginManager().registerEvents(new Deepslate_Diamond_Ore(),this);
        getServer().getPluginManager().registerEvents(new Netherite_Upgrade_Smithing_Template(),this);
        getServer().getPluginManager().registerEvents(new Magma_Cream(),this);
        getServer().getPluginManager().registerEvents(new Cobweb(),this);
        getServer().getPluginManager().registerEvents(new Name_Tag(),this);
        getServer().getPluginManager().registerEvents(new Experience_Bottle(),this);
        getServer().getPluginManager().registerEvents(new Trident(),this);
        new Enchanted_Gold_Apple().Ega();
        new Elytra().ely();
        new Budding_Amethyst().BA();
        new Saddle().sd();
        new Diamond_Ore().DO();
        new Deepslate_Diamond_Ore().DDO();
        new Netherite_Upgrade_Smithing_Template().NUST();
        new Magma_Cream().MC();
        new Cobweb().CW();
        new Name_Tag().NT();
        new Experience_Bottle().EB();
        new Trident().Tr();
        System.out.println("[Schale自定义配方]已成功被加载");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        resetRecipes();
        System.out.println("[Schale自定义配方]已成功被卸载");
    }
}
