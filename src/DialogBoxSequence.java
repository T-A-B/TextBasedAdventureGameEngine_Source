import Interfaces.IDialogBoxSequence;

import javax.swing.*;
import java.util.List;

public class DialogBoxSequence implements IDialogBoxSequence {
    List<? extends JDialog> m_dialog_box_list;

    DialogBoxSequence(List <? extends JDialog> p_dialog_box_list) {
    m_dialog_box_list = p_dialog_box_list;

    }





    public void start() {


    }


}
