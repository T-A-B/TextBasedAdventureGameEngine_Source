package Player;

import PopupCreator.PopupCreator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasicPlayerInventoryTest {

    @Test
    public void testInventoryPanel() {
        Player p = new Player();
        p.setPlayerInventory(new BasicPlayerInventory());
        p.getPlayerInventory().addItem(new BasicUsableItem("Marion Stone", "The Stone of Marion", 1));
        p.getPlayerInventory().addItem(new BasicUsableItem("Marion Stone2", "The Stone#2 of Marion", 1));
        p.getPlayerInventory().addItem(new BasicUsableItem("Dollyfruit", "A deliciously tasty fruit", 1));
        p.getPlayerInventory().addItem(new BasicUsableItem("New NVidia graphics card", "Bestows big graphics on the user, but big $$$ on the reseller.", 1));
        BasicInventoryDialog d = new BasicInventoryDialog(p.getPlayerInventory());


        d.pack();
        d.setVisible(true);
        PopupCreator.createBasicOkayPopup(p.getPlayerInventory().toString());


    }


}