package tpod.custom_recipes_for_schale;

import org.bukkit.plugin.java.JavaPlugin;
import tpod.custom_recipes_for_schale.Custom_Recipes.Budding_Amethyst;
import tpod.custom_recipes_for_schale.Custom_Recipes.Elytra;
import tpod.custom_recipes_for_schale.Custom_Recipes.Enchanted_gold_apple;
import tpod.custom_recipes_for_schale.Custom_Recipes.Saddle;

public final class Custom_Recipes_For_Schale extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Enchanted_gold_apple(),this);
        getServer().getPluginManager().registerEvents(new Elytra(),this);
        getServer().getPluginManager().registerEvents(new Budding_Amethyst(),this);
        getServer().getPluginManager().registerEvents(new Saddle(),this);
        new Enchanted_gold_apple().Ega();
        new Elytra().ely();
        new Budding_Amethyst().BA();
        new Saddle().sd();

        System.out.println("[Schale自定义配方]已成功被加载");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Schale自定义配方]已成功被卸载");
    }
}
