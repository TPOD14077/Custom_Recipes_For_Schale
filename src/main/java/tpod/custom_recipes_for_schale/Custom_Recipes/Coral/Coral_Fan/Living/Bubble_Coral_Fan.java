package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Fan.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Bubble_Coral_Fan implements Listener {
    public void BuCF(){
        ShapedRecipe BuCF = new ShapedRecipe(new ItemStack(Material.BUBBLE_CORAL_FAN,12))
                .shape("AA","AA")
                .setIngredient('A', Material.BUBBLE_CORAL_BLOCK);
        getServer().addRecipe(BuCF);
    }
}
