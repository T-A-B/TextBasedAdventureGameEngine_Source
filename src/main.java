import Player.Player;
import Stages.Stage;
import World.World;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        World ourWorld = new World();
        Player ourPlayer = new Player();



        ArrayList<Stage> stageList = new ArrayList<Stage>();
        ourWorld.populateWorld(stageList);

        ourWorld.start(ourPlayer);





    }




}
