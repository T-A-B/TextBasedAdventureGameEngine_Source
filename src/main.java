import Player.Player;
import Stages.DialogStagePanel;
import Stages.DummyDialogStage;
import Stages.Stage;
import World.World;
import World.PrimaryGamePanel;
import World.MainGameFrame;
import java.awt.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        World ourWorld = new World();
        Player ourPlayer = new Player();



        ArrayList<Stage> stageList = new ArrayList<Stage>();
        ourWorld.populateWorld(stageList);

        ourWorld.start(ourPlayer);

        String[] test_strings = new String[5];
        test_strings[0] = "This is a test dialog";
        test_strings[1] =  "next dialog";
         test_strings[2] = "more dialog";
        test_strings[3] = "dialog 4";
        test_strings[4] =  "dialog 5";
        PrimaryGamePanel test = new PrimaryGamePanel();
        World W = new World();
        Player P = new Player();

        W.start(P);

        MainGameFrame main = new MainGameFrame(W);
        main.setSize(new Dimension(800, 800));
        main.setVisible(true);
        main.setMainStagePanel(new DialogStagePanel(new DummyDialogStage()));




    }




}
