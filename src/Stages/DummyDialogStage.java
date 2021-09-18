package Stages;

import Interfaces.IDialogStage;

public class DummyDialogStage extends DialogStage implements IDialogStage {

    String[] m_stage_dialog_array;
    final String[] m_strings_array= {"Hello", "Goodbye","Next dialog", "More dialog"};
    String[] m_stage_dialog_array2;
    final String[] m_strings_array2= {"Yo whattttup", "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWW\nWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW","Next dialog", "More dialog"};

    public DummyDialogStage() {
        m_stage_dialog_array = m_strings_array;
    }
    public DummyDialogStage(boolean b) {
        if(b) {
            m_stage_dialog_array = m_strings_array2;
        }

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
