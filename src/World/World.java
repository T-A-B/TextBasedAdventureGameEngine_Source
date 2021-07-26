package World;

import Attributes.GameAttributes;
import Player.Player;
import Stages.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class World implements IWorld{

    HashMap<Integer, Stage> m_stageHashMap = new HashMap<>();
    Player m_activePlayer;

    public World(){


        start(m_activePlayer);
    }


    @Override
    public void start(Player p_player) {
        m_activePlayer = new Player();


    }


    @Override
    public void populateWorld(ArrayList<? extends Stage> p_stage_list) {
        for(Stage s : p_stage_list) {

            m_stageHashMap.put(s.getStageID(), s);
        }
    }

    @Override
    public Player getActivePlayer() {
        return m_activePlayer;
    }

}
