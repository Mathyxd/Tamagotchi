
import java.util.ArrayList;
import java.util.Scanner;

public class TamagotchiTest {
    public static void main(String[] args) {
        ArrayList<Tamagotchi> pets = new ArrayList<>();

        pets.add(new Dog("Walter", 100, Food.BONE, Mood.HAPPY));
        pets.add(new Bear("Kuma", 500, Food.SEAL, Mood.TIRED));
        pets.add(new Cat("Luna", 40, Food.MILK, Mood.HUNGRY));
        pets.add(new Dog("kp", 10 ,Food.MEAT, Mood.TIRED));


        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("------Your pets-----");
            for (int i = 0; i < pets.size(); i++) {
                System.out.println(i + ": " + pets.get(i));
            }
            System.out.println("pick a pet, or type -1 to quit");
            int choice = scanner.nextInt();

            if (choice == -1) {
                running = false;
            } else if (choice >= 0 && choice < pets.size()) {
                Tamagotchi selected = pets.get(choice);
                System.out.println("\n You selected: " + selected.getName());
                System.out.println("What do you want to do");
                System.out.println("1: play 2: feed 3: check stats for: " + selected.getName());
                int action = scanner.nextInt();

                if (action == 1) {
                    selected.play();
                } else if (action == 2) {
                    System.out.println("What food would you like to feed " + selected.getName() + " ? " + "\n 1: BONE. 2: MEAT. 3: FISH. 4: MILK. 5: SEAL");
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
                        selected.feed(chosenFood);
                    }
                } else if (action == 3) {
                    System.out.println(selected);
                }
            }
        }
        scanner.close();
    }
}
