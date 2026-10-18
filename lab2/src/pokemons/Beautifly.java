package pokemons;
import moves.physical.Punishment;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Beautifly — эволюция Silcoon, поэтому наследуется от него.
 * Тип BUG и атаки Rock Slide, Swords Dance, Last Resort получает от Silcoon,
 * сам добавляет второй тип FLYING и атаку Punishment.
 * Базовые характеристики свои (заменяют характеристики Silcoon):
 * HP 60, атака 70, защита 50, спец. атака 100, спец. защита 50, скорость 65.
 * Наследников нет, класс final.
 */
public final class Beautifly extends Silcoon {
    /**
    * name  имя покемона
    * level уровень покемона
    */
    public Beautifly(String name, int level){
        super(name, level);
        addType(Type.FLYING);
        setStats(60, 70, 50, 100, 50, 65);
        addMove(new Punishment());
    }
}