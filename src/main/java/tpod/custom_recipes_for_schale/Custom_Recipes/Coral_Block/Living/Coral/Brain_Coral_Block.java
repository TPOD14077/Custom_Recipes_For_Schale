package tpod.custom_recipes_for_schale.Custom_Recipes.Coral_Block.Living.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Brain_Coral_Block implements Listener {
    public void BCB(){
        ShapedRecipe BCB = new ShapedRecipe(new ItemStack(Material.BRAIN_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.BRAIN_CORAL);
        getServer().addRecipe(BCB);
    }
}
