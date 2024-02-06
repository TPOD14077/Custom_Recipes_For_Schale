package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Living.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Tube_Coral_Block implements Listener {
    public void TCB(){
        ShapedRecipe TCB = new ShapedRecipe(new ItemStack(Material.TUBE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.TUBE_CORAL);
        getServer().addRecipe(TCB);
    }
}
