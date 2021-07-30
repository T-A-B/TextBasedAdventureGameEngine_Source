package Player;

public class BasicUsableItem extends BasicItem implements IItem, IUsableItem {
    String m_item_name;
    String m_item_description;
    int m_item_charges;

    /**
     * @param p_item_name item name strting
     * @param p_item_description item description string
     * @param p_starting_charges number of charges on item
     */
    public BasicUsableItem(String p_item_name, String p_item_description, int p_starting_charges) {
        m_item_name = p_item_name;
        m_item_description = p_item_description;
        m_item_charges = p_starting_charges;


    }


    @Override
    public String getItemName() {
        return m_item_name;
    }

    @Override
    public String getItemDescription() {
        return m_item_description;
    }

    @Override
    public int getCharges() {
        return m_item_charges;
    }

    @Override
    public boolean isUsable() {
        return true;
    }

    @Override
    public void setCharges() {

    }

    @Override
    public void setCharges(int p_charges) {
        m_item_charges = p_charges;
    }

    @Override
    public void consumeCharge() {
        m_item_charges--;
    }

    @Override
    public boolean isEmpty() {
        if(m_item_charges > 0)
                return true;
            else
                return false;
    }

    @Override
    public void useItem() {

        consumeCharge();

    }

    @Override
    public void setChargesToZero(){
        m_item_charges = 0;
    }


}
