package pokemons;
import moves.physical.BodySlam;
import moves.special.FireBlast;
import moves.special.Flamethrower;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Trapinch. Тип: GROUND.
 * Базовые характеристики: HP 45, атака 100, защита 45,
 * спец. атака 45, спец. защита 45, скорость 10.
 * Наследуется напрямую от Pokemon.
 * Не final: от него наследуется Vibrava (эволюция).
 * Атаки: Fire Blast, Flamethrower, Body Slam.
 */
public class Trapinch extends Pokemon {
    public Trapinch (String name, int level){
        super(name, level);
        setType(Type.GROUND);
        setStats(45, 100, 45, 45, 45, 10);
        setMove(new FireBlast(), new Flamethrower(), new BodySlam());
    }
}