package tpod.custom_recipes_for_schale.Custom_Recipes.Coral_Block.Living.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Horn_Coral_Block implements Listener {
    public void HCB(){
        ShapedRecipe HCB = new ShapedRecipe(new ItemStack(Material.HORN_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.HORN_CORAL);
        getServer().addRecipe(HCB);
    }
}
