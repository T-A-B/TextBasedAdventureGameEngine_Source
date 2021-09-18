package Attributes;

import java.util.ArrayList;

public class GameAttributes {
    ArrayList<PlayerAttribute> m_gameAttributes = new ArrayList() {
    };


    public GameAttributes(){
        m_gameAttributes.add(new FortitudeAttribute());
        m_gameAttributes.add(new StrengthAttribute());
        m_gameAttributes.add(new IntellectAttribute());
        m_gameAttributes.add(new CharismaAttribute());
        m_gameAttributes.add(new Dennyhood());
    }
    public ArrayList<PlayerAttribute> getGameAttributes() {
        return this.m_gameAttributes;
    }


}
