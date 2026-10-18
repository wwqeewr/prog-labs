package moves.physical;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Body Slam:
 * физическая, тип NORMAL, 30% шанс парализовать, базовый урон 85, точность 100%
 */
public final class BodySlam extends PhysicalMove {
    public BodySlam(){
        super(Type.NORMAL, 85, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.3){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Body Slam";
    }
}
