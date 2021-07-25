package Attributes;

public abstract class PlayerAttribute implements IAttribute{


    @Override
    public String getAttributeName() {
        return null;
    }



    @Override
    public String getAttributeDescription() {
        return null;
    }

    @Override
    public Boolean isLevelable() {
        return null;
    }

    @Override
    public void setAttributeLevel(double d) {

    }

    @Override
    public double getAttributeLevel() {
        return 0;
    }
    public double getStartingLevel(){
        return 0;
    }

    @Override
    public String toString() {
     return "Attribute Name: " + getAttributeName() +"\n"
             + "Attribute Description: " + getAttributeDescription() + "\n"
             + "Starting LeveL: " +  getStartingLevel() + "\n"
             + "Level: " + getAttributeLevel() + "\n"
             + "isLevelable?: " + isLevelable() + "\n"
             +"***************************************";
    }
}
