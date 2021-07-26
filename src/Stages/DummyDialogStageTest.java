package Stages;

import org.junit.Test;

import javax.swing.*;

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

        DummyDialogStage d =  new DummyDialogStage(test_strings);

    }
}