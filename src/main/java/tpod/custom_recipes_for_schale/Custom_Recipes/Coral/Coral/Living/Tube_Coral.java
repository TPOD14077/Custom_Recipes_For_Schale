package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Tube_Coral implements Listener {
    public void TC(){
        ShapedRecipe TC = new ShapedRecipe(new ItemStack(Material.TUBE_CORAL))
                .shape("AAA")
                .setIngredient('A', Material.TUBE_CORAL_BLOCK);
        getServer().addRecipe(TC);
    }
}
