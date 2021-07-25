package Player;

import Attributes.PlayerAttributes;

public class Player implements IPlayer{
    PlayerAttributes m_player_attributes;
    String m_player_name;
    int m_currentStage;

    @Override
    public String getPlayerName() {
        return m_player_name;
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
