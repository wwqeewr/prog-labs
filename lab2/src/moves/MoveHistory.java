package moves;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ru.ifmo.se.pokemon.*;

/**
 * Журнал использованных атак: для каждого покемона хранит множество атак,
 * которые он уже применял в бою. Библиотека такую историю не ведёт,
 * а она нужна атаке Last Resort.
 */
public final class MoveHistory {

    private static final Map<Pokemon, Set<Move>> used = new HashMap<>();

    private MoveHistory() {
    }

    /** Запомнить, что покемон p применил атаку m. */
    public static void record(Pokemon p, Move m) {
        Set<Move> moves = used.get(p);
        if (moves == null) {
            moves = new HashSet<>();
            used.put(p, moves);
        }
        moves.add(m);
    }

    /** Применял ли покемон p атаку m хотя бы раз. */
    public static boolean hasUsed(Pokemon p, Move m) {
        Set<Move> moves = used.get(p);
        return moves != null && moves.contains(m);
    }
}