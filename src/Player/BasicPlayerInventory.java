package Player;

import java.util.ArrayList;

public class BasicPlayerInventory implements IInventory{
    ArrayList<BasicItem>  m_inventory;

    public BasicPlayerInventory() {
        m_inventory = new ArrayList<BasicItem>();
        m_inventory.add(new BasicUsableItem("Starting Stone","Stone given to new players, what does it do!?", 150));
    }
    @Override
    public ArrayList<? extends IItem> getInvetoryItems() {
        return  m_inventory;
    }

    @Override
    public void addItem(IItem p_item) {
        m_inventory.add((BasicItem) p_item);
    }

    @Override
    public void deleteItem() {

    }

    @Override
    public void deleteItem(BasicItem p_item)
    {
            m_inventory.remove(p_item);
    }

    @Override
    public void deleteItemByName(String p_name) {
        BasicItem toBeDeleted = null;
        for (BasicItem i : m_inventory) {
            if (i.getItemName().equals(p_name)){
                toBeDeleted = i;
            }
        }
        deleteItem(toBeDeleted);
    }

    @Override
    public void updateInventory() {


        m_inventory.removeIf(i -> i.getCharges() <= 0);
    }

    public BasicItem getItemByName(String p_name){
        for(BasicItem i : m_inventory) {
            if (i.getItemName().equals(p_name)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        String accumulator = "";
        for(BasicItem i : m_inventory) {
            accumulator += i.getItemName() + "\n";
        }
        return accumulator;
    }
}
