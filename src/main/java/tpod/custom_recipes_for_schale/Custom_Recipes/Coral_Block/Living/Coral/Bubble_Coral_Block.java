package tpod.custom_recipes_for_schale.Custom_Recipes.Coral_Block.Living.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Bubble_Coral_Block implements Listener {
    public void BuCB(){
        ShapedRecipe BuCB = new ShapedRecipe(new ItemStack(Material.BUBBLE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.BUBBLE_CORAL);
        getServer().addRecipe(BuCB);
    }
}
