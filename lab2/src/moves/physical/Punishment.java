package moves.physical;
import java.lang.reflect.Field;
import moves.MoveHistory;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Punishment: физическая, тип DARK, точность 100%.
 * Сила зависит от того, насколько повышены характеристики соперника:
 * 60 + 20 за каждую ступень повышения, но не больше 200.
 * Ступени хранятся в приватном поле Pokemon.stage, публичного геттера нет,
 * поэтому они читаются через рефлексию (только чтение, объект не меняется).
 * Данная атака используется покемоном, имеющим атаку Last Resort, 
 * которая срабатывает, только если покемон уже применил все остальные атаки.. Необходимо отслеживание
 * MoveHistory.record() нужен для того, чтобы использование атаки записалось для отслеживания в атаке Last Resort
 */
public final class Punishment extends PhysicalMove {

    public Punishment() {
        super(Type.DARK, 60, 1.0);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        int boosts = countBoosts(def);
        power = Math.min(60 + 20 * boosts, 200);
        return super.calcBaseDamage(att, def);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        MoveHistory.record(att, this);           // записать в журнал: att применил эту атаку
        return super.checkAccuracy(att, def);    // дальше обычная проверка попадания
    }
    /** Считает, на сколько ступеней в сумме повышены характеристики покемона p. */
    private static int countBoosts(Pokemon p) {
        try {
            Field f = Pokemon.class.getDeclaredField("stage");
            f.setAccessible(true);
            Effect stage = (Effect) f.get(p);

            int count = 0;
            for (Stat s : Stat.values()) {
                if (s == Stat.HP) {
                    continue;
                }
                int value = stage.stat(s);
                if (value > 0) {
                    count += value;
                }
            }
            return count;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return 0;
        }
    }

    @Override
    protected String describe() {
        return "использует Punishment";
    }
}