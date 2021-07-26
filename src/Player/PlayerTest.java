package Player;

import Attributes.GameAttributes;
import Attributes.PlayerAttributes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void TestPlayerNameCreateDialog(){
        Player p = new Player();

        p.setPlayerName();

        assert  p.getPlayerName().equals("Tyler");
    }

}