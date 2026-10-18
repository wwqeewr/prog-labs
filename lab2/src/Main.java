import ru.ifmo.se.pokemon.*;
import pokemons.*;

/**
 * Точка входа: создаёт две команды покемонов по три
 * и запускает бой между ними.
 * Команды разделены так, чтобы в каждой была одна форма
 * из каждой цепочки эволюции (Silcoon/Beautifly, Trapinch/Vibrava).
 * Уровни минимальные: атаки варианта эти покемоны в играх по уровню не изучают,
 * поэтому ограничение снизу даёт только эволюция:
 * Silcoon появляется на 7 уровне, Beautifly на 10, Vibrava на 35.
 */
public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon carvanha = new Carvanha("Карванха", 1);
        Pokemon silcoon = new Silcoon("Силкун", 7);
        Pokemon beautifly = new Beautifly("Бьютифлай", 10);
        Pokemon spinda = new Spinda("Спинда", 1);
        Pokemon trapinch = new Trapinch("Трэпинч", 1);
        Pokemon vibrava = new Vibrava("Вибрава", 35);
        b.addAlly(carvanha);
        b.addAlly(beautifly);
        b.addAlly(trapinch);
        b.addFoe(silcoon);
        b.addFoe(spinda);
        b.addFoe(vibrava);
        b.go();
    }
}
