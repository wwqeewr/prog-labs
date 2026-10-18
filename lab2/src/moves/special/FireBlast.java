package moves.special;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Fire Blast:
 * специальная, огненная, 10% шанс поджечь, базовый урон 110, точность 85%
 */
public final class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE, 110, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.1){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Fire Blast";
    }
}
