package Stages;

import Enumerations.STAGE_TYPE;
import Interfaces.IDialogStage;

public abstract class DialogStage extends Stage implements IDialogStage {

    private STAGE_TYPE m_stage_type = STAGE_TYPE.DIALOG;


    @Override
    public STAGE_TYPE getStageType() {
        return m_stage_type;
    }

    @Override
    public abstract String[] getStageDialog();

    @Override
    public abstract int getStageID();

    }

