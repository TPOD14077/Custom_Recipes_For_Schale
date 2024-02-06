package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Dead;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Bubble_Coral implements Listener {
    public void DBuC(){
        ShapedRecipe DBuC = new ShapedRecipe(new ItemStack(Material.DEAD_BUBBLE_CORAL,9))
                .shape("AAA")
                .setIngredient('A', Material.DEAD_BUBBLE_CORAL_BLOCK);
        getServer().addRecipe(DBuC);
    }
}
