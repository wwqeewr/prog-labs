package moves.special;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Mud Slap:
 * специальная, тип GROUND, уменьшает ACCURACY противника на 1, базовый урон 20, точность 100%
 */
public final class MudSlap extends SpecialMove {
    public MudSlap(){
        super(Type.GROUND, 20, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe(){
        return "использует Mud Slap";
    }
}
