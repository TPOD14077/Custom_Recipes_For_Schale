package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Dead;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Brain_Coral implements Listener {
    public void DBC(){
        ShapedRecipe DBC = new ShapedRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL))
                .shape("AAA")
                .setIngredient('A', Material.DEAD_BRAIN_CORAL_BLOCK);
        getServer().addRecipe(DBC);
    }
}
