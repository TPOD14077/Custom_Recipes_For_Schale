package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Fan.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Fire_Coral_Fan implements Listener {
    public void FCF(){
        ShapedRecipe FCF = new ShapedRecipe(new ItemStack(Material.FIRE_CORAL_FAN,12))
                .shape("AA","AA")
                .setIngredient('A', Material.FIRE_CORAL_BLOCK);
        getServer().addRecipe(FCF);
    }
}
