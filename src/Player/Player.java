package Player;

import Attributes.GameAttributes;
import Attributes.PlayerAttributes;
import Spells.SpellBook;

public class Player implements IPlayer{
    PlayerAttributes m_player_attributes = new PlayerAttributes();
    String m_player_name;
    int m_currentStage;
    int m_level_up_points = 1;
    BasicPlayerInventory m_player_inventory;
    SpellBook m_player_spellbook;
    public Player(){
        GameAttributes g = new GameAttributes();
        m_player_inventory = new BasicPlayerInventory();
    m_player_attributes.loadAttributes(g.getGameAttributes());


    }

    @Override
    public String getPlayerName() {
        return m_player_name;
    }

    @Override
    public void setPlayerName() {
    m_player_name = nameInputDialog();
    }

    @Override
    public void setPlayerName(String p_string) {
    m_player_name = p_string;

    }
    public String nameInputDialog() {
        NameEntryDialog dialog = new NameEntryDialog(this);
        dialog.pack();
        dialog.setVisible(true);

        return dialog.getNameString();
    }


    @Override
    public PlayerAttributes getPlayerAttributes() {
        return m_player_attributes;
    }

    @Override
    public int getCurrentStage() {
        return m_currentStage;
    }

    @Override
    public int getLevelUpPoints() {
        return m_level_up_points;
    }

    @Override
    public void addLevelUpPoints(int p_amount) {
    m_level_up_points += p_amount;
    }

    @Override
    public void spendLevelUpPoint() {
    m_level_up_points--;
    }

    @Override
    public void spendLevelUpPoints() {

    }

    @Override
    public BasicPlayerInventory getPlayerInventory() {
        return m_player_inventory;
    }



    @Override
    public void setPlayerInventory(BasicPlayerInventory p_player_inventory) {
        m_player_inventory = p_player_inventory;
    }

    @Override
    public SpellBook getSpellBook() {
        return m_player_spellbook;
    }
}
