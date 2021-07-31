package Battle;

import Attributes.EnemyAttributes.EnemyAttribute;

import java.util.ArrayList;

public class BasicEnemy extends Enemy implements IEnemy {
    String m_enemy_name;
    ArrayList<EnemyAttribute> m_enemy_attributes;
    @Override
    public String getEnemyName() {
        return m_enemy_name;
    }

    @Override
    public void setEnemyAttributeByName(String p_attribute_name) {

    }

    @Override
    public EnemyAttribute getEnemyAttributedByName(String p_attribute_name) {
        return null;
    }


}
