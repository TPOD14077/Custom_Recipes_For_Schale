package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Horn_Coral implements Listener {
    public void HC(){
        ShapedRecipe HC = new ShapedRecipe(new ItemStack(Material.HORN_CORAL,9))
                .shape("AAA")
                .setIngredient('A', Material.HORN_CORAL_BLOCK);
        getServer().addRecipe(HC);
    }
}
