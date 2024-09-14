import java.util.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try (Scanner sc = new Scanner(System.in)) {
            int x = 1;
            System.out.println("Color Guessing game");

            do {
                System.out.println("""
                     1) Start new game
                     2) Exit
                """);

                x = sc.nextInt();
                sc.nextLine();

                switch (x) {
                    case 1:
                        game.startGame();
                        break;
                    case 2:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }

                System.out.println();
            } while (x != 2);
        }
    }
}
