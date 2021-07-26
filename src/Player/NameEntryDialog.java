package Player;

import javax.swing.*;
import java.awt.event.*;

public class NameEntryDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;

    Player m_Player = new Player();
    public NameEntryDialog(Player p_player) {
        m_Player = p_player;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here

        dispose();

    }

    private void onCancel() {
        // add your code here if necessary

        dispose();
    }

    public String getNameString(){
        return textField1.getText();
    }

    public static void main(String[] args) {
        NameEntryDialog dialog = new NameEntryDialog(null);
        dialog.pack();
        dialog.setVisible(true);

        System.exit(0);
    }
}
