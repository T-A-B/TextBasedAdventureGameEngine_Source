package Attributes;



public  interface IAttribute {


    String getAttributeName();
    String getAttributeDescription();
    Boolean isLevelable();
    void setAttributeLevel(double d);

    double getAttributeLevel();

    String toString();

    double getStartingLevel();

    double getEffectiveLevel();

    double getEffectiveLevelBoost();

    void setEffectiveLevelBoost(double p_effective_level_boost);

    void setEffectiveLevel(double p_effective_level);


   void setEffectiveLevelMultiplier(double p_multiplier_value);

   void calculateEffectiveLevel();


}
