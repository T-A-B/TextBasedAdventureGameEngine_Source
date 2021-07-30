package Player;
import Attributes.*;
public interface IPlayer {


    String getPlayerName();
    void setPlayerName();
    void setPlayerName(String p_string);
    PlayerAttributes getPlayerAttributes();
    int getCurrentStage();
    int getLevelUpPoints();
    void addLevelUpPoints(int p_amount);
    void spendLevelUpPoint();
    void spendLevelUpPoints();
    BasicPlayerInventory getPlayerInventory();
    void setPlayerInventory(BasicPlayerInventory p_player_inventory);


}
