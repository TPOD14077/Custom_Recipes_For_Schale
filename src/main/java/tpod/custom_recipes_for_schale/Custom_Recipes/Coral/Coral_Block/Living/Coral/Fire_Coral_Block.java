package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Living.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Fire_Coral_Block implements Listener {
    public void FCB(){
        ShapedRecipe FCB = new ShapedRecipe(new ItemStack(Material.FIRE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.FIRE_CORAL);
        getServer().addRecipe(FCB);
    }
}
