import Player.Player;
import World.World;
import org.junit.Test;
import Player.AttributeLevelUpDialog;
public class AttributeLevelUpDialogTest {
    @Test
    public void DialogPopulateAttributesTest(){
        World w = new World();
        w.start(new Player());
        w.getActivePlayer().getPlayerAttributes().initialize();
        w.getActivePlayer().setPlayerName();

        AttributeLevelUpDialog dialog = new AttributeLevelUpDialog(w.getActivePlayer());
        dialog.pack();
        dialog.setVisible(true);

        System.out.println(w.getActivePlayer().getPlayerAttributes().getPlayerAttributes());


    }

}