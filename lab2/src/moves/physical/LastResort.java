package moves.physical;

import java.lang.reflect.Field;
import java.util.List;
import moves.MoveHistory;
import ru.ifmo.se.pokemon.*;

/**
 * Атака Last Resort: физическая, тип NORMAL, сила 140, точность 100%.
 * Срабатывает, только если покемон уже применил все остальные свои атаки
 * (и они у него вообще есть). Список атак покемона хранится в приватном поле
 * Pokemon.moves без геттера, поэтому он читается через рефлексию; историю
 * применения ведёт MoveHistory. Остальные атаки покемона должны записывать
 * себя в MoveHistory, иначе Last Resort не сработает никогда.
 */
public final class LastResort extends PhysicalMove {

    public LastResort() {
        super(Type.NORMAL, 140, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        if (!allOtherMovesUsed(att)) {
            return false;
        }
        return super.checkAccuracy(att, def);
    }

    /** Проверяет, применил ли покемон p все свои атаки, кроме этой. */
    private boolean allOtherMovesUsed(Pokemon p) {
        try {
            Field f = Pokemon.class.getDeclaredField("moves");
            f.setAccessible(true);
            List<?> moves = (List<?>) f.get(p);

            int others = 0;
            for (Object m : moves) {
                if (m == this) {
                    continue;
                }
                others++;
                if (!MoveHistory.hasUsed(p, (Move) m)) {
                    return false;
                }
            }
            return others > 0;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return false;
        }
    }

    @Override
    protected String describe() {
        return "использует Last Resort";
    }
}
