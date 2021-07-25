package Attributes;

import javax.management.Attribute;

public class StrengthAttribute extends PlayerAttribute implements IAttribute {
   boolean m_isLevelable = true;
   String m_attribute_name = "Strength";
    String m_attribute_description = "Increases Melee Damage";

    public StrengthAttribute() {



        m_isLevelable = true;
        m_attribute_name = "Strength";
        m_attribute_description = "Increases Melee Damage";


    }



    @Override
    public String getAttributeName() {
       return this.m_attribute_name;
    }

    @Override
    public String getAttributeDescription() {
        return this.m_attribute_description;
    }

    @Override
    public Boolean isLevelable() {
        return this.m_isLevelable;
    }

    @Override
    public void setAttributeLevel(double d) {

    }

    @Override
    public double getAttributeLevel() {
        return 0;
    }
}
