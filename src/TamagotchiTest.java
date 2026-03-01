
import java.util.ArrayList;
import java.util.Scanner;

public class TamagotchiTest {
    public static void main(String[] args) {
        ArrayList<Tamagotchi> pets = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        boolean addingPets = true;
        while (addingPets) {
            System.out.println("What type of animal would like your pet to be? Type 1 for Cat, Type 2 for Dog and type 3 for Bear. ");
            int typeChoice = scanner.nextInt();
            scanner.nextLine();

            if (typeChoice == 0) {
                if (pets.isEmpty()) {
                    System.out.println("You need at least one pet to continue!");
                } else {
                    addingPets = false;
                }

            } else if (typeChoice == 1 || typeChoice == 2 || typeChoice == 3) {
                System.out.println("What would you like to name your new pet?");
                String petName = scanner.nextLine();
                int startingEnergy = (int) (Math.random() * 51) + 50;

                if (typeChoice == 1) {
                    pets.add(new Cat(petName, startingEnergy, Food.BONE, Mood.HAPPY));
                } else if (typeChoice == 2) {
                    pets.add(new Dog(petName, startingEnergy, Food.FISH, Mood.HAPPY));
                } else {
                    pets.add(new Bear(petName, startingEnergy, Food.FISH, Mood.HAPPY));
                }
                System.out.println(petName + "Has been added to the roster, with " + startingEnergy + "energy!!!");
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        System.out.println("\n------Choose your pet-----");
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(i + ": " + pets.get(i).getName());
        }
        System.out.println("Pick your pet: ");
        int startChoice = scanner.nextInt();
        Tamagotchi activePet = pets.get(startChoice);
        System.out.println("\n" + activePet.getName() + "Is now your active pet!\n");

        boolean running = true;
        while (running) {
            System.out.println("\n------Your active pet: " + activePet.getName() + "------");
            System.out.println(activePet);
            System.out.println("What would you like to do with your pet?");
            System.out.println("Type: 1 to play, Type: 2 to feed, Type: 3 to check stats, Type: 4 to switch your pet with another, Type 0: to Exit the game!");
            int action = scanner.nextInt();
            {
                ;
            }
            if (action == 0) {
                running = false;
            } else if (action == 1) {
                activePet.play();
            } else if (action == 2) {
                System.out.println("What food would you like to feed " + activePet.getName() + " ? " + "\n 1: BONE. 2: MEAT. 3: FISH. 4: MILK. 5: SEAL");
                int foodChoice = scanner.nextInt();
                Food chosenFood = switch (foodChoice) {
                    case 1 -> Food.BONE;
                    case 2 -> Food.MEAT;
                    case 3 -> Food.FISH;
                    case 4 -> Food.MILK;
                    case 5 -> Food.SEAL;
                    default -> null;
                };
                if (chosenFood != null) {
                    activePet.feed(chosenFood);
                }
            } else if (action == 3) {
                System.out.println(activePet);
            } else if (action == 4) {
                System.out.println("\n------Your pets-----");
                for (int i = 0; i < pets.size(); i++) {
                    String marker = pets.get(i) == activePet ? " (active)" : "";
                    System.out.println(i + ": " + pets.get(i).getName() + marker);
                }
                System.out.println("Pick your new active pet!");
                int switchChoice = scanner.nextInt();
                if (switchChoice >= 0 && switchChoice < pets.size()) {
                    activePet = pets.get(switchChoice);
                    System.out.println("\nSwitched to " + activePet.getName() + "!");
                } else {
                    System.out.println("Thats not your pet");
                }
            } else {
                System.out.println("Invalid option, try again.");
            }

            }
            scanner.close();
        }
    }
