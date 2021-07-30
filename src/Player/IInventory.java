package Player;

import java.util.ArrayList;

public interface IInventory {
     ArrayList<? extends IItem> getInvetoryItems();
    void addItem(IItem p_item);
    void deleteItem();

    void deleteItem(BasicItem p_item);

    void deleteItemByName(String p_name);
    void updateInventory();
}
