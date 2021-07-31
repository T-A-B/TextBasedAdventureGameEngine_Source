package Spells;

import Battle.Enemy;
import Player.Player;

import java.util.ArrayList;

public interface ISpell {
    String getSpellName();
    String getSpellDescription();
    ArrayList<SpellEffect> getSpellEffects();
    void ApplyEffects(Player p);
    void ApplyEffects(Enemy e);


}
