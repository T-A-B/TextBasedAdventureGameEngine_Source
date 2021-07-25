package Attributes;

public  interface IAttribute {


    String getAttributeName();
    String getAttributeDescription();
    Boolean isLevelable();
    void setAttributeLevel(double d);

    double getAttributeLevel();
    String toString();


}
