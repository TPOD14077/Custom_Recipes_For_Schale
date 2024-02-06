package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Fan.Living;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Horn_Coral_Fan implements Listener {
    public void HCF(){
        ShapedRecipe HCF = new ShapedRecipe(new ItemStack(Material.HORN_CORAL_FAN,12))
                .shape("AA","AA")
                .setIngredient('A', Material.HORN_CORAL_BLOCK);
        getServer().addRecipe(HCF);
    }
}
