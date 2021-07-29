package Player;

public abstract class BasicItem implements IItem{

    String m_item_name;
    String m_item_description;



    @Override
    public abstract String getItemName();

    @Override
    public abstract String getItemDescription();

    }

