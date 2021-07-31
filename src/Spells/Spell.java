package Spells;

import java.util.ArrayList;

public abstract class Spell implements ISpell{
    public abstract ArrayList<SpellEffect> getSpellEffects();
    public abstract void applySpellEffects(SpellEffect p_spell_effect);


}
