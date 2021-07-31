package Spells;

import java.util.ArrayList;

public interface ISpellBook {
    ArrayList<Spell> getSpells();
    Spell getSpellByName(String s);

}
