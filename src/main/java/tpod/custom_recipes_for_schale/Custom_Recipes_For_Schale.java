package tpod.custom_recipes_for_schale;

import org.bukkit.plugin.java.JavaPlugin;
import tpod.custom_recipes_for_schale.Custom_Recipes.Chainmail_Armor.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Dead.Coral.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Dead.Coral_Fan.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Living.Coral.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Living.Coral_Fan.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Ores.*;
import tpod.custom_recipes_for_schale.Custom_Recipes.Others.*;

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
        getServer().getPluginManager().registerEvents(new Chainmail_Helmet(),this);
        getServer().getPluginManager().registerEvents(new Chainmail_Chestplate(),this);
        getServer().getPluginManager().registerEvents(new Chainmail_Leggings(),this);
        getServer().getPluginManager().registerEvents(new Chainmail_Boots(),this);
        getServer().getPluginManager().registerEvents(new Flint(),this);
        getServer().getPluginManager().registerEvents(new Bell(),this);
        getServer().getPluginManager().registerEvents(new Tube_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Tube_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Brain_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Brain_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Bubble_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Bubble_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Fire_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Fire_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Horn_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Horn_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Dead_Tube_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Dead_Tube_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Dead_Brain_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Dead_Brain_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Dead_Bubble_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Dead_Bubble_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Dead_Fire_Coral_Block(),this);
        getServer().getPluginManager().registerEvents(new Dead_Fire_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Dead_Horn_Coral_Block_FAN(),this);
        getServer().getPluginManager().registerEvents(new Dead_Horn_Coral_Block(),this);
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
        new Chainmail_Helmet().CH();
        new Chainmail_Chestplate().CC();
        new Chainmail_Leggings().CL();
        new Chainmail_Boots().CB();
        new Flint().Fli();
        new Bell().bell();
        new Tube_Coral_Block().TCB();
        new Tube_Coral_Block_FAN().TCB2();
        new Brain_Coral_Block().BCB();
        new Brain_Coral_Block_FAN().BCB2();
        new Bubble_Coral_Block().BuCB();
        new Bubble_Coral_Block_FAN().BuCB2();
        new Fire_Coral_Block().FCB();
        new Fire_Coral_Block_FAN().FCB2();
        new Horn_Coral_Block().HCB();
        new Horn_Coral_Block_FAN().HCB2();
        new Dead_Tube_Coral_Block().DTCB();
        new Dead_Tube_Coral_Block_FAN().DTCB2();
        new Dead_Brain_Coral_Block().DBCB();
        new Dead_Brain_Coral_Block_FAN().DBCB2();
        new Dead_Bubble_Coral_Block().DBuCB();
        new Dead_Bubble_Coral_Block_FAN().DBuCB2();
        new Dead_Fire_Coral_Block().DFCB();
        new Dead_Fire_Coral_Block_FAN().DFCB2();
        new Dead_Horn_Coral_Block().DHCB();
        new Dead_Horn_Coral_Block_FAN().DHCB2();
        System.out.println("[Schale自定义配方]已成功被加载");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Schale自定义配方]已成功被卸载");
    }
}
