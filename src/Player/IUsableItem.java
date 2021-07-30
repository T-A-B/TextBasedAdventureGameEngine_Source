package Player;

public interface IUsableItem {

    int getCharges();
    void consumeCharge();
    boolean isEmpty();
    void useItem();
}
