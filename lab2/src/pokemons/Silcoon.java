package pokemons;
import moves.physical.RockSlide;
import moves.status.SwordsDance;
import moves.physical.LastResort;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Silcoon. Тип: BUG.
 * Базовые характеристики: HP 50, атака 35, защита 55,
 * спец. атака 25, спец. защита 25, скорость 15.
 * Наследуется напрямую от Pokemon.
 * Не final: от него наследуется Beautifly (эволюция).
 * Атаки: Rock Slide, Swords Dance, Last Resort.
 */
public class Silcoon extends Pokemon {
    public Silcoon (String name, int level){
        super(name, level);
        setType(Type.BUG);
        setStats(50, 35, 55, 25, 25, 15);
        setMove(new RockSlide(), new SwordsDance(), new LastResort());
    }
}