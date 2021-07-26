import Stages.DialogStage;

import javax.swing.*;

public class DialogStagePanel extends JPanel {

    private JPanel panel1;
    private JButton m_btn_previousButton;
    private JButton m_btn_nextButton;
    private JLabel m_lbl_dialog_stage_text;
    DialogStage m_stage;
    int dialogNumber = 0;

    DialogStagePanel(){
    m_lbl_dialog_stage_text.setText(m_stage.getStageDialog()[dialogNumber]);


    }

    private void advanceDialog(){
        dialogNumber++;
        m_lbl_dialog_stage_text.setText(m_stage.getStageDialog()[dialogNumber]);

    }
    private void retreatDialog(){
        dialogNumber--;
        m_lbl_dialog_stage_text.setText(m_stage.getStageDialog()[dialogNumber]);
    }



}
