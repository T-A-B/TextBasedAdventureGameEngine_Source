package Spells;

import java.util.ArrayList;

public class BasicSpellBook extends SpellBook implements ISpellBook{
    ArrayList<Spell> m_spell_list;


    @Override
    public ArrayList<Spell> getSpells() {
      return m_spell_list;
    }

    @Override
    public Spell getSpellByName(String p_spell_name) {

        for(Spell i : m_spell_list) {
            if(i.getSpellName().equalsIgnoreCase(p_spell_name)){
                return i;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "BasicSpellBook{" +
                "m_spell_list=" + m_spell_list +
                '}';
    }
}
