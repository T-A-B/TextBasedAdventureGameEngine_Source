import Attributes.GameAttributes;
import Attributes.IAttribute;
import Attributes.PlayerAttribute;
import Attributes.PlayerAttributes;

import org.junit.Test;

import java.util.ArrayList;

public class PlayerAttributesTest
{


    @Test
    public void testGameAttributesNotNull(){
        GameAttributes g = new GameAttributes();
        PlayerAttributes p = new PlayerAttributes();
        p.loadAttributes(g.getGameAttributes());

        System.out.println(p.getPlayerAttributes());
        assert p.getPlayerAttributes() != null;
    }

    @Test public void testGameAttributesInit() {
        GameAttributes g = new GameAttributes();
        PlayerAttributes p = new PlayerAttributes();
        p.loadAttributes(g.getGameAttributes());
        p.initialize();
        System.out.println(p.getPlayerAttributes());

         assert (p.getAttributeByName("Strength").getAttributeLevel() == 2);
    }

    @Test
    public void levelUpHandlerTest() {
        GameAttributes g = new GameAttributes();
        PlayerAttributes p = new PlayerAttributes();
        p.loadAttributes(g.getGameAttributes());
        p.initialize();
      //  System.out.println(p.getPlayerAttributes());

        p.getAttributeByName("Strength").levelUpByValue(15);
        System.out.println(p.getPlayerAttributes());
        assert (p.getAttributeByName("Strength").getAttributeLevel() == 17);
    }


}
