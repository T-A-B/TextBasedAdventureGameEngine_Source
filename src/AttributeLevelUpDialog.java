import Attributes.PlayerAttributes;
import Player.Player;

import javax.swing.*;
import java.awt.event.*;

public class AttributeLevelUpDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel m_lbl_attribute1;
    private JLabel m_lbl_attribute2;
    private JLabel m_lbl_attribute3;
    private JLabel m_lbl_attribute4;
    private JLabel m_lbl_attribute5;
    private JButton m_btn_attribute1_lvl_up;
    private JButton m_btn_attribute2_lvl_up;
    private JButton m_btn_attribute3_lvl_up;
    private JButton m_btn_attribute4_lvl_up;
    private JButton m_btn_attribute5_lvl_up;
    private JLabel m_lbl_player_name;
    private JLabel m_lbl_points_available;
    private JLabel m_lbl_player_attribute1_lvl;
    private JLabel m_lbl_player_attribute2_lvl;
    private JLabel m_lbl_player_attribute4_lvl;
    private JLabel m_lbl_player_attribute3_lvl;
    private JLabel m_lbl_player_attribute5_lvl;

    private PlayerAttributes m_player_attributes = new PlayerAttributes();
    private Player m_player = new Player();


    private void setAttributeLabels(){
        m_lbl_attribute1.setText(m_player_attributes.getPlayerAttributes().get(0).getAttributeName());
        m_lbl_attribute2.setText(m_player_attributes.getPlayerAttributes().get(1).getAttributeName());
        m_lbl_attribute3.setText(m_player_attributes.getPlayerAttributes().get(2).getAttributeName());
        m_lbl_attribute4.setText(m_player_attributes.getPlayerAttributes().get(3).getAttributeName());
        m_lbl_attribute5.setText(m_player_attributes.getPlayerAttributes().get(4).getAttributeName());
        m_lbl_player_attribute1_lvl.setText(Double.toString(m_player_attributes.getPlayerAttributes().get(0).getAttributeLevel()));
        m_lbl_player_attribute2_lvl.setText(Double.toString(m_player_attributes.getPlayerAttributes().get(1).getAttributeLevel()));
        m_lbl_player_attribute3_lvl.setText(Double.toString(m_player_attributes.getPlayerAttributes().get(2).getAttributeLevel()));
        m_lbl_player_attribute4_lvl.setText(Double.toString(m_player_attributes.getPlayerAttributes().get(3).getAttributeLevel()));
        m_lbl_player_attribute5_lvl.setText(Double.toString(m_player_attributes.getPlayerAttributes().get(4).getAttributeLevel()));
    }
    private void setPlayerNameLabel() {
        m_lbl_player_name.setText(m_player.getPlayerName());
    }
    private void setPlayerLevelUpPointsLabel() {
        m_lbl_points_available.setText(Integer.toString(m_player.getLevelUpPoints()));
    }
    public AttributeLevelUpDialog(Player p_player) {
        m_player = p_player;
        m_player_attributes = p_player.getPlayerAttributes();

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setPlayerNameLabel();
        setPlayerLevelUpPointsLabel();
        setAttributeLabels();
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
        m_btn_attribute1_lvl_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m_player_attributes.getPlayerAttributes().get(0).levelUpByOne();
                m_player.spendLevelUpPoint();
                setPlayerLevelUpPointsLabel();
                setAttributeLabels();
            }
        });
        m_btn_attribute2_lvl_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m_player_attributes.getPlayerAttributes().get(1).levelUpByOne();
                m_player.spendLevelUpPoint();
                setPlayerLevelUpPointsLabel();
                setAttributeLabels();
            }
        });
        m_btn_attribute3_lvl_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m_player_attributes.getPlayerAttributes().get(2).levelUpByOne();
                m_player.spendLevelUpPoint();
                setPlayerLevelUpPointsLabel();
                setAttributeLabels();
            }
        });
        m_btn_attribute4_lvl_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m_player_attributes.getPlayerAttributes().get(3).levelUpByOne();
                m_player.spendLevelUpPoint();
                setPlayerLevelUpPointsLabel();
                setAttributeLabels();
            }
        });
        m_btn_attribute5_lvl_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m_player_attributes.getPlayerAttributes().get(4).levelUpByOne();
                m_player.spendLevelUpPoint();
                setPlayerLevelUpPointsLabel();
                setAttributeLabels();
            }
        });

    }

    private void onOK() {
        // add your code here

        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        AttributeLevelUpDialog dialog = new AttributeLevelUpDialog(null);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
