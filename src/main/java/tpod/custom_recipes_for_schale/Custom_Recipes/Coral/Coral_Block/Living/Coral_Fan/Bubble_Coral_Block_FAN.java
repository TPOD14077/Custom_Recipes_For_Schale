package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Living.Coral_Fan;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Bubble_Coral_Block_FAN implements Listener {
    public void BuCB2(){
        ShapedRecipe BuCB2 = new ShapedRecipe(new ItemStack(Material.BUBBLE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.BUBBLE_CORAL);
        getServer().addRecipe(BuCB2);
    }
}
