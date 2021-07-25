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
}
