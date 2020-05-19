package virtual_pet;
/*
 * I would like to see a few changes made for clean code's sake:
 * 1 - I like hunger as a field name as it's a noun, the other names that are verbs (drink, play, and rest) I'm not a
 *     fan of.  Use verbs for method names, as they describe behaviors.  Field names are better as nouns, as they are
 *     things the class knows about. (Think 'thirst' instead of 'drink', 'tiredness' instead of 'rest')
 * 2 - Separate the status display from the tick() into it's own method.  This way it can be called independently of the
 *     tick.  It also keeps the tick with a single responsibility, advancing the game state.
 * 3 - Make the 'getter' methods simply return the fields they relate to.
 * 4 - Create methods that change the instance variables, like 'feed()', 'drink()', 'takeANap()', and 'play()'
 */
public class VirtualPet {
    private int hunger = 5;
    private int drink = 5;
    private int biological = 5;
    private int play = 5;
    private int rest = 5;

    void tick() {
        hunger = hunger + 1;
        drink = drink + 1;
        biological = biological + 1;
        play = play + 1;
        rest = rest + 1;
        System.out.println("Hunger" + hunger);
        System.out.println("drink" + drink);
        System.out.println("biological" + biological);
        System.out.println("play" + play);
        System.out.println("rest" + rest);
    }

    int getHunger() { hunger ++;
        return 0;
    }

    void getDrink() { drink ++; }

    void getBiological() {
        biological -= 3;
    }

    int getRest() {
        return rest;
    }

    void playWithMe() {
        play -= 5;
    }

}


