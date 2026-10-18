package pokemons;
import moves.special.FireBlast;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Vibrava — эволюция Trapinch, поэтому наследуется от него.
 * Тип GROUND и атаки Fire Blast, Flamethrower, Body Slam получает от Trapinch,
 * сам добавляет второй тип DRAGON и ещё один Fire Blast
 * (по варианту атака повторяется — так покемон применяет её чаще).
 * Базовые характеристики свои (заменяют характеристики Trapinch):
 * HP 50, атака 70, защита 50, спец. атака 50, спец. защита 50, скорость 70.
 * Наследников нет, класс final.
 */
public final class Vibrava extends Trapinch {
    /**
    * name  имя покемона
    * level уровень покемона
    */
    public Vibrava(String name, int level){
        super(name, level);
        addType(Type.DRAGON);
        setStats(50, 70, 50, 50, 50, 70);
        addMove(new FireBlast());
    }
}