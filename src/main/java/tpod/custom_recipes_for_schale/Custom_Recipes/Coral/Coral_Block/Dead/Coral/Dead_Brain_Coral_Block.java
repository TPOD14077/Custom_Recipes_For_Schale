package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Dead.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Brain_Coral_Block implements Listener {
    public void DBCB(){
        ShapedRecipe DBCB = new ShapedRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_BRAIN_CORAL);
        getServer().addRecipe(DBCB);
    }
}
