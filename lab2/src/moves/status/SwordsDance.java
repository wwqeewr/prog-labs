package moves.status;
import ru.ifmo.se.pokemon.*;
import moves.MoveHistory;

/**
 * Атака Swords Dance:
 * StatusMove, NORMAL, увеличивает ATTACK владельца на 2, базовый урон 0, применяется на себя со 100% точностью
 * checkAccuracy переопределен для того, чтобы действие гарантированно применилось независимо от формулы
 * return (accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION)) > Math.random();
 * Данная атака используется покемоном, имеющим атаку Last Resort. Необходимо отслеживание
 * MoveHistory.record() нужен для того, чтобы использование атаки записалось для отслеживания в атаке Last Resort
 */
public final class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        MoveHistory.record(att, this);
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe(){
        return "использует Swords Dance";
    }
}