package Spells;

import Battle.Enemy;
import Player.Player;

public abstract class SpellEffect implements ISpellEffect {

    @Override
    public abstract String getSpellEffectName();
    @Override
    public abstract void applySpellEffect(Player p_player);
    @Override
    public abstract void applySpellEffect(Enemy p_enemy);


}
