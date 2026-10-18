package moves.special;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Flamethrower:
 * специальная, огненная, 10% шанс поджечь, базовый урон 90, точность 100%
 */
public final class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.1){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Flamethrower";
    }
}
