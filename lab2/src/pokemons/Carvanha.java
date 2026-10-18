package pokemons;
import moves.special.MudSlap;
import moves.special.Overheat;
import moves.status.Growl;
import moves.physical.BodySlam;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Carvanha. Типы: WATER, DARK.
 * Базовые характеристики: HP 45, атака 90, защита 20,
 * спец. атака 65, спец. защита 20, скорость 65.
 * Наследуется напрямую от Pokemon,
 * наследников нет, поэтому класс final.
 * Атаки: Mud-Slap, Growl, Overheat, Body Slam.
 */
public final class Carvanha extends Pokemon {
    /**
    * name  имя покемона
    * level уровень покемона
    */
    public Carvanha(String name, int level){
        super(name, level);
        setType(Type.WATER, Type.DARK);
        setStats(45, 90, 20, 65, 20, 65);
        setMove(new MudSlap(), new Overheat(), new Growl(), new BodySlam());
    }
}