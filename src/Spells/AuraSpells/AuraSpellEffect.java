package Spells.AuraSpells;

import Attributes.IAttribute;
import Attributes.IPlayerAttributes;
import Attributes.PlayerAttribute;
import Spells.ISpellEffect;
import Spells.SpellEffect;
import jdk.internal.org.objectweb.asm.Attribute;

import java.util.ArrayList;
import java.util.Map;


public abstract class AuraSpellEffect extends SpellEffect implements ISpellEffect {
public void applyValueIncreaseEffectiveLevelBoost(IAttribute p_attribute, double p_increase_amount){
p_attribute.setEffectiveLevel(p_attribute.getEffectiveLevel() + p_increase_amount);
}
public void applyAllAllValueIncreaseAttributeEffects(Map<IAttribute, Integer> p_attribute_boost_map) {
 //   for (IAttribute currentAttribute : p_attribute_list) {

     //   currentAttribute.setEffectiveLevel(currentAttribute.getEffectiveLevel() + currentBoostAmount);
  ///  }

}

}
