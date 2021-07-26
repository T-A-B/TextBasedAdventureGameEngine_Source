package Player;

import Attributes.GameAttributes;
import Attributes.PlayerAttributes;

public class Player implements IPlayer{
    PlayerAttributes m_player_attributes = new PlayerAttributes();
    String m_player_name;
    int m_currentStage;
    int m_level_up_points = 1;
    public Player(){
        GameAttributes g = new GameAttributes();
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
}
