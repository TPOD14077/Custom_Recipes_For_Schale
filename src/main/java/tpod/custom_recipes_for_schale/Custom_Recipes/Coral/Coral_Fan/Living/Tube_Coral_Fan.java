package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Fan.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Tube_Coral_Fan implements Listener {
    public void TCF(){
        ShapedRecipe TCF = new ShapedRecipe(new ItemStack(Material.TUBE_CORAL_FAN,12))
                .shape("AA","AA")
                .setIngredient('A', Material.TUBE_CORAL_BLOCK);
        getServer().addRecipe(TCF);
    }
}
