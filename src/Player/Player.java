package Player;

import Attributes.PlayerAttributes;

public class Player implements IPlayer{
    PlayerAttributes m_player_attributes;
    String m_player_name;
    int m_currentStage;

    public Player(){

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
}
