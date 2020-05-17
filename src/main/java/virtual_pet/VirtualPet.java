package virtual_pet;

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


