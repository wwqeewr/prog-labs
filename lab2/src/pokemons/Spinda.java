package pokemons;
import moves.special.FireBlast;
import moves.special.Flamethrower;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Spinda. Тип: NORMAL.
 * Базовые характеристики: все по 60.
 * Не эволюционирует, наследуется напрямую от Pokemon, класс final.
 * Атаки: Fire Blast, Flamethrower.
 */
public final class Spinda extends Pokemon {
    /**
    * name  имя покемона
    * level уровень покемона
    */
    public Spinda(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 60, 60, 60, 60, 60);
        setMove(new FireBlast(), new Flamethrower());
    }
}
