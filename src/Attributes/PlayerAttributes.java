package Attributes;


import javax.management.Attribute;
import java.util.ArrayList;

public class PlayerAttributes implements IPlayerAttributes {
  private ArrayList<PlayerAttribute> m_player_attributes;

  public ArrayList<PlayerAttribute> getPlayerAttributes() {
      return m_player_attributes;
  }

StrengthAttribute k = new StrengthAttribute();
  public PlayerAttributes(){
      super();
      m_player_attributes = new ArrayList();
  }

  public PlayerAttribute getAttributeByName(String p_strName) {
      for(PlayerAttribute a :

           m_player_attributes) {
          if (a.getAttributeName() == p_strName) {
              return a;
          }

      }
        return null;

  }





    @Override
    public void loadAttributes(ArrayList<PlayerAttribute> attributeList) {
        m_player_attributes.addAll(attributeList);
    }

    public void initialize(){
        for (PlayerAttribute p: m_player_attributes
             ) {



            p.setAttributeLevel(p.getStartingLevel());
            p.setEffectiveLevel(p.getStartingLevel());

        }
    }
}
