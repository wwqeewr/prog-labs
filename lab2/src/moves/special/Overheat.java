package moves.special;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Overheat:
 * специальная, тип FIRE, уменьшает SPECIAL_ATTACK владельца на 2, базовый урон 130, точность 90%
 */
public final class Overheat extends SpecialMove {
    public Overheat(){
        super(Type.FIRE, 130, 0.9);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe(){
        return "использует Overheat";
    }
}
