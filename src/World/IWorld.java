package World;

import Player.Player;
import Stages.Stage;

import java.util.ArrayList;

public interface IWorld {
    void start(Player p);

    void populateWorld(ArrayList<? extends Stage> p_stage_list);


}
