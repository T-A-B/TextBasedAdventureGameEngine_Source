package PopupCreator;

import Player.BasicPopUpDialogOkayOnly;

public class PopupCreator {


    public static void createBasicOkayPopup(String p_popup_text) {
        BasicPopUpDialogOkayOnly dialog = new BasicPopUpDialogOkayOnly(p_popup_text);
        dialog.pack();
        dialog.setVisible(true);

    }
}
