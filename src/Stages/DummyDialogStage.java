package Stages;

import Interfaces.IDialogStage;

public class DummyDialogStage extends DialogStage implements IDialogStage {

    String[] m_stage_dialog_array;

    DummyDialogStage(String[] p_dialog_string_array) {
        m_stage_dialog_array = p_dialog_string_array;
    }


    @Override
    public String[] getStageDialog() {
        return m_stage_dialog_array;
    }

    @Override
    public int getStageID() {
        return 0;
    }
}
