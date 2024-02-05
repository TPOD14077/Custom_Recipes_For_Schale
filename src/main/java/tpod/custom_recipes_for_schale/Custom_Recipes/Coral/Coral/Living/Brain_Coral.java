package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Brain_Coral implements Listener {
    public void BC(){
        ShapedRecipe BC = new ShapedRecipe(new ItemStack(Material.BRAIN_CORAL))
                .shape("AAA")
                .setIngredient('A', Material.BRAIN_CORAL_BLOCK);
        getServer().addRecipe(BC);
    }
}
