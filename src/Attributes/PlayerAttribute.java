package Attributes;

public abstract class PlayerAttribute implements IAttribute{


    @Override
    public abstract String getAttributeName();



    @Override
    public abstract String getAttributeDescription();

    @Override
    public abstract Boolean isLevelable();

    @Override
    public abstract void setAttributeLevel(double p_value);



    @Override
    public abstract double getAttributeLevel();


    public abstract void levelUpByOne();


    public abstract void levelUpByValue(double p_value);

    @Override
    public String toString() {
     return "Attribute Name: " + getAttributeName() +"\n"
             + "Attribute Description: " + getAttributeDescription() + "\n"
             + "Starting LeveL: " +  getStartingLevel() + "\n"
             + "Effective Level: " +  getEffectiveLevel() + "\n"
             + "Level: " + getAttributeLevel() + "\n"
             + "isLevelable?: " + isLevelable() + "\n"
             +"***************************************\n\n";
    }
}
