package moves.physical;
import ru.ifmo.se.pokemon.*;
import moves.MoveHistory;

/**
 * Атака Rock Slide:
 * физическая, тип ROCK, 30% шанс на flinch, базовый урон 75, точность 90%
 * Данная атака используется покемоном, имеющим атаку Last Resort. Необходимо отслеживание
 * MoveHistory.record() нужен для того, чтобы использование атаки записалось для отслеживания в атаке Last Resort
 */
public final class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 0.9);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        MoveHistory.record(att, this);           // записать в журнал: att применил эту атаку
        return super.checkAccuracy(att, def);    // дальше обычная проверка попадания
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.3){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Rock Slide";
    }
}
