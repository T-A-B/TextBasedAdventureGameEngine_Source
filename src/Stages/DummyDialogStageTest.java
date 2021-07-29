package Stages;

import Player.Player;
import World.MainGameFrame;
import World.PrimaryGamePanel;
import World.World;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class DummyDialogStageTest {


    @Test
    public void testDialogStagePanel(){
        String[] test_strings = new String[5];
        test_strings[0] = "This is a test dialog";
        test_strings[1] =  "next dialog";
        test_strings[2] = "more dialog";
        test_strings[3] = "dialog 4";
        test_strings[4] =  "dialog 5";

        DummyDialogStage d =  new DummyDialogStage();


        DialogStagePanel dpan = new DialogStagePanel(d);
        PrimaryGamePanel mainGamePanel = new PrimaryGamePanel();
        System.out.println(dpan.m_stage.getStageDialog()[0]);
        World W = new World();
        Player P = new Player();
        W.start(P);
        MainGameFrame main = new MainGameFrame(W);
        main.setSize(new Dimension(500, 500));
        main.setVisible(true);
        main.setMainStagePanel(new DialogStagePanel(new DummyDialogStage()));


    }
}