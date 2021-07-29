package World;

import Stages.DialogStage;
import Stages.DialogStagePanel;
import Stages.DummyDialogStage;

import javax.swing.*;
import java.awt.*;


public class PrimaryGamePanel extends JPanel {
    private JPanel panel1;
    private JButton button1;
    private JLabel m_side_label;
    private JPanel InnerPanel;

    public PrimaryGamePanel(){
        super();
        this.setMinimumSize(new Dimension(500,500));
        String[] test_strings = new String[5];
        test_strings[0] = "This is a test dialog";
        test_strings[1] =  "next dialog";
        test_strings[2] = "more dialog";
        test_strings[3] = "dialog 4";
        test_strings[4] =  "dialog 5";


        panel1.setVisible(true);
        this.setVisible(true);
    }


}
