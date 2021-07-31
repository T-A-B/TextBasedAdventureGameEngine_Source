package Player.Levels;

import Player.BasicPlayerInventory;
import Player.IInventoryDialog;
import Player.IItem;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.util.ArrayList;

public class BasicInventoryDialog extends JDialog implements IInventoryDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JList ItemList;
    private JTextArea ItemDescriptionBox;
    private JTextArea textArea1;
    private JButton m_useButton;
    private JButton m_discardButton;
    private BasicPlayerInventory m_player_inventory;


    public BasicInventoryDialog(BasicPlayerInventory p_player_inventory) {
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

        m_player_inventory = p_player_inventory;
        populateList();
        ItemList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
               if(ItemList.getSelectedValue() != null) {
                   ItemDescriptionBox.setText(m_player_inventory.getItemByName((String) ItemList.getSelectedValue()).getItemDescription());
               }
            }
        });

        m_useButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                p_player_inventory.getItemByName((String) ItemList.getSelectedValue()).useItem();
                ItemList.clearSelection();
                p_player_inventory.updateInventory();
                ItemDescriptionBox.setText("");
                populateList();

            }
        });
        m_discardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tempString = p_player_inventory.getItemByName((String) ItemList.getSelectedValue()).getItemName();
               m_player_inventory.deleteItemByName(tempString);
                ItemList.clearSelection();
                p_player_inventory.updateInventory();
                ItemDescriptionBox.setText("");
                populateList();
            }
        });
    }






    private void populateList(){
        ArrayList<String> tempStringList = new ArrayList<>();
        for( IItem i : m_player_inventory.getInvetoryItems() ){
        tempStringList.add(i.getItemName());

        }
        ItemList.setListData(tempStringList.toArray());
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
        BasicInventoryDialog dialog = new BasicInventoryDialog(null);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public BasicPlayerInventory getPlayerInventory() {
        return m_player_inventory;
    }
}
