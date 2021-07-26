package Attributes;

public class IntellectAttribute extends PlayerAttribute implements IAttribute {
    boolean m_isLevelable = true;
    String m_attribute_name = "Intellect";
    String m_attribute_description = "Magical inclination";
    double m_attribute_level;
    double m_starting_level = 2;
    double m_effective_level = m_attribute_level;
    double m_effective_level_multiplier = 1;
    double m_effective_level_boost;

    public IntellectAttribute() {






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
        m_attribute_level = d;
    }
    @Override
    public double getStartingLevel(){
        return m_starting_level;
    }

    @Override
    public double getEffectiveLevel() {
        return m_effective_level;
    }

    @Override
    public double getEffectiveLevelBoost() {
        return m_effective_level_boost;
    }
    @Override
    public void setEffectiveLevelBoost(double p_effective_level_boost) {

        m_effective_level_boost = p_effective_level_boost;
    }

    @Override
    public void setEffectiveLevel(double p_effective_level) {
        m_effective_level = p_effective_level;
    }

    @Override
    public void setEffectiveLevelMultiplier(double p_multiplier_value) {
        m_effective_level_multiplier = p_multiplier_value;
    }

    @Override
    public void calculateEffectiveLevel() {
        m_effective_level = (m_attribute_level + m_effective_level_boost) * m_effective_level_multiplier ;

    }

    @Override
    public double getAttributeLevel() {
        return m_attribute_level;
    }

    @Override
    public void levelUpByOne() {
        m_attribute_level += 1;
    }

    @Override
    public void levelUpByValue(double p_value){
        m_attribute_level += p_value;
    }




}


