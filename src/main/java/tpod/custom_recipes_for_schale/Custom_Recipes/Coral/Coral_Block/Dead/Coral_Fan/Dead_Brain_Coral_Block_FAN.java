package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Dead.Coral_Fan;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Brain_Coral_Block_FAN implements Listener {
    public void DBCB2(){
        ShapedRecipe DBCB2 = new ShapedRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_BRAIN_CORAL_FAN);
        getServer().addRecipe(DBCB2);
    }
}
