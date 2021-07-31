package Battle;

import Attributes.EnemyAttributes.EnemyAttribute;
import jdk.internal.org.objectweb.asm.Attribute;

public interface IEnemy {
    String getEnemyName();
    void setEnemyAttributeByName(String p_attribute_name);
    EnemyAttribute getEnemyAttributedByName(String p_attribute_name);

}
