package Attributes;

import java.util.ArrayList;

public class GameAttributes {
    ArrayList<PlayerAttribute> m_gameAttributes = new ArrayList() {
    };

    public GameAttributes(){
        m_gameAttributes.add(new StrengthAttribute());

    }
    public ArrayList<PlayerAttribute> getGameAttributes() {
        return this.m_gameAttributes;
    }


}
