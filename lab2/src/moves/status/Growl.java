package moves.status;
import ru.ifmo.se.pokemon.*;


/**
 * Атака Growl:
 * StatusMove, NORMAL, снижает ATTACK цели на 1, базовый урон 0, точность 100%
 */
public final class Growl extends StatusMove {
    public Growl(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "использует Growl";
    }
}