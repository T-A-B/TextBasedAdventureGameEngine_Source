package Interfaces;

import Enumerations.STAGE_TYPE;

public interface IDialogStage extends IStage {


    int getStageID();

    STAGE_TYPE getStageType();

    public String[] getStageDialog();


}
