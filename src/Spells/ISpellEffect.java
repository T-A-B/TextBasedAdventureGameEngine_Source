package Spells;

import Battle.Enemy;
import Player.Player;

public interface ISpellEffect {
    String getSpellEffectName();
    void applySpellEffect(Player p_player);
    void applySpellEffect(Enemy p_enemy);
}
