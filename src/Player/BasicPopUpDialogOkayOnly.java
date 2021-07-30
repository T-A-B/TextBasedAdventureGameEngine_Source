package Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicPopUpDialogOkayOnly extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextArea PopupDialogText;

    public BasicPopUpDialogOkayOnly(String p_Dialog_Box_Text) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        PopupDialogText.setText(p_Dialog_Box_Text);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        BasicPopUpDialogOkayOnly dialog = new BasicPopUpDialogOkayOnly(null);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
