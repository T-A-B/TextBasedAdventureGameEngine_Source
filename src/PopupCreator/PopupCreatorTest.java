package PopupCreator;

import org.junit.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class PopupCreatorTest {


    @Test
    public void testPopupCreator(){

        PopupCreator.createBasicOkayPopup("Test passed");
    }
}