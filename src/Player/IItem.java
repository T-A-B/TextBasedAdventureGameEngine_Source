package Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IItem {
    String getItemName();
    String getItemDescription();

    void setCharges(int p_charges);

    void useItem();
    int getCharges();
    boolean isUsable();
    void setCharges();


    void setChargesToZero();
}
