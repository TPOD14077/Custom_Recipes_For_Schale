package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Bubble_Coral implements Listener {
    public void BuC(){
        ShapedRecipe BuC = new ShapedRecipe(new ItemStack(Material.BUBBLE_CORAL))
                .shape("AAA")
                .setIngredient('A', Material.BUBBLE_CORAL_BLOCK);
        getServer().addRecipe(BuC);
    }
}
