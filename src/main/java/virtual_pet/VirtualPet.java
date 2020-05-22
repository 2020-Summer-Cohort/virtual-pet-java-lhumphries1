package virtual_pet;

/*
 * I would like to see a few changes made for clean code's sake:
 * 1 - I like hunger as a field name as it's a noun, the other names that are verbs (drink, play, and rest) I'm not a
 *   fan of.  Use verbs for method names, as they describe behaviors.  Field names are better as nouns, as they are
 *     things the class knows about. (Think 'thirst' instead of 'drink', 'tiredness' instead of 'rest')
 * 2 - Separate the status display from the tick() into it's own method.  This way it can be called independently of the
 *     tick.  It also keeps the tick with a single responsibility, advancing the game state.
 * 3 - Make the 'getter' methods simply return the fields they relate to.
 * 4 - Create methods that change the instance variables, like 'feed()', 'drink()', 'takeANap()', and 'play()'
 */
public class VirtualPet {
    private int hunger = 50;
    private int thirst = 50;
    private int biological = 25;
    private int exerciseNeed = 20;
    private int rechargeNeed = 20;

    public VirtualPet() {
    }

    void tick() {
        hunger = hunger + 5;
        thirst = thirst + 5;
        biological = biological + 3;
        exerciseNeed = exerciseNeed + 4;
        rechargeNeed = rechargeNeed + 4;
    }

    public void feed() {
        hunger -= 10;
    }

    int getHunger() {
        return hunger;
    }

    public void giveDrink() {
        thirst -= 10;
    }

    int getThirst() {
        return thirst;
    }

    public void bathroom() {
        biological = 5;
    }

    int getBiological() {
        return biological;
    }

    void getRest() {
        rechargeNeed -= 5;
    }

    int putToRest() {
        return rechargeNeed;
    }

    void playWithMe() {
        exerciseNeed -= 5;
    }

    int playTime() {
        return exerciseNeed;
    }

}


