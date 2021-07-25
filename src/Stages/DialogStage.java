package Stages;

import Enumerations.STAGE_TYPE;
import Interfaces.IDialogStage;

public abstract class DialogStage extends Stage implements IDialogStage {
    private int stageID;
    private STAGE_TYPE m_stage_type;
    private String[] m_stage_dialog;

    @Override
    public STAGE_TYPE getStageType() {
        return m_stage_type;
    }

    @Override
    public String[] getStageDialog() {
        return new String[0];
    }

    @Override
    public int getStageID() {
        return this.stageID;
    }
}
