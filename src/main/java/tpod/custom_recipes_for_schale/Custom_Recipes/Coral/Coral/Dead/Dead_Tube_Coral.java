package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral.Dead;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Tube_Coral implements Listener {
    public void DTC(){
        ShapedRecipe DTC = new ShapedRecipe(new ItemStack(Material.DEAD_TUBE_CORAL))
                .shape("AAA")
                .setIngredient('A', Material.DEAD_TUBE_CORAL_BLOCK);
        getServer().addRecipe(DTC);
    }
}
