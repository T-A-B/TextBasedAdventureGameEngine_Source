package World;

import Stages.Stage;

import java.util.ArrayList;

public interface IWorld {
    void start();

    void populateWorld(ArrayList<? extends Stage> p_stage_list);


}
