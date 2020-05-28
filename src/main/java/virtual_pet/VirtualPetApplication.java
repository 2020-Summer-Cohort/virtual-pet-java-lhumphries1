package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {
    static Scanner input = new Scanner(System.in);
    static VirtualPet virtualPet = new VirtualPet();

    public static void main(String[] args) {
        System.out.println("What would you like to call your dog?");
        String petName = input.nextLine();
        gameLoop(input, petName);
    }

        public static void whatToDo(String petName){

            System.out.println("What would you like " + petName + " to do?");
            System.out.println("1. Play with " + petName + ". ");
            System.out.println("2. Give " + petName + " a drink.");
            System.out.println("3. Biological time for " + petName + ". ");
            System.out.println("4. Feed " + petName + "!");
            System.out.println("5. " + petName + "'s nap time. ");
            System.out.println("6. Exit with no actions.");
        }

        public static void gameLoop (Scanner input, String petName){
            while (true) {
                whatToDo(petName);
                virtualPet.tick();
                System.out.println("Hunger" + virtualPet.getHunger());
                System.out.println("Thirst" + virtualPet.getThirst());
                System.out.println("Biological" + virtualPet.getBiological());
                System.out.println("Exercise" + virtualPet.playTime());
                System.out.println("Exhaustion" + virtualPet.putToRest());

                int userChoice = input.nextInt();

                if (userChoice == 1) {
                    virtualPet.playWithMe();
                    virtualPet.tick();
                    System.out.println(petName + " is having fun,\nbut iam sure he will be hungry soon!!");
                } else if (userChoice == 2) {
                    virtualPet.giveDrink();
                    System.out.println(petName + "'s thirst is quenched!\nBiological is calling soon ");
                } else if (userChoice == 3) {
                    virtualPet.takeForBiological();
                    System.out.println(petName + " looks relieved!!");
                } else if (userChoice == 4) {
                    virtualPet.feed();
                    System.out.println("Food makes " + petName + " so very happy!!\n ...But i see those eyes getting heavy.");
                } else if (userChoice == 5) {
                    virtualPet.getRest();
                    System.out.println("Lets go to bed " + petName + ", you look very sleepy!!s");
                }else if (userChoice == 6){
                    System.out.println("Do nothing");
                    break;
                }
            }
        }
    }