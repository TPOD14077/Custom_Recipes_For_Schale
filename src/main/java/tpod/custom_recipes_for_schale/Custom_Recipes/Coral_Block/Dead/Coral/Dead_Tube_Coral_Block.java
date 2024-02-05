package tpod.custom_recipes_for_schale.Custom_Recipes.Coral_Block.Dead.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Tube_Coral_Block implements Listener {
    public void DTCB(){
        ShapedRecipe DTCB = new ShapedRecipe(new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_TUBE_CORAL);
        getServer().addRecipe(DTCB);
    }
}
