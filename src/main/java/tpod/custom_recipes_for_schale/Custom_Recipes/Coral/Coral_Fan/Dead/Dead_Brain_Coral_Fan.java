package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Fan.Dead;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Brain_Coral_Fan implements Listener {
    public void DBCF(){
        ShapedRecipe DBCF = new ShapedRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL_FAN,12))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_BRAIN_CORAL_BLOCK);
        getServer().addRecipe(DBCF);
    }
}
