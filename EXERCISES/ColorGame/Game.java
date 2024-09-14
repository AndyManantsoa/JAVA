import java.util.Random;
import java.util.Scanner;

public class Game {

    private static String[] color = {"Blue", "Green", "Black", "Red", "Yellow", "Purple","Pink"};
    private String selectedColor;
    User user = new User();

    public static String getRandomColor() {
        Random random = new Random();
        return color[random.nextInt(color.length)];
    }
    
    public void startGame(){
        user.addUser();
        user.attempt=3;
        playGame();
    }

    public void playGame() {

        while (user.attempt>0) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            Enter a color to guess:
                1) Blue
                2) Green
                3) Black
                4) Red 
                5) Yellow
                6) Purple
                7) Pink
            """);
        int a = sc.nextInt();
        

        switch (a) {
            case 1:
                selectedColor = "Blue";
                break;
            case 2:
                selectedColor = "Green";
                break;
            case 3:
                selectedColor = "Black";
                break;
            case 4:
                selectedColor = "Red";
                break;
            case 5:
                selectedColor = "Yellow";
                break;
            case 6:
                selectedColor = "Purple";
                break;
            case 7:
                selectedColor = "Pink";
                break;
            default:
                System.out.println("Invalid choice");
        }

        String randomColor = getRandomColor();

        if (selectedColor.equals(randomColor)) {
            System.out.println("You win");
            user.win++;
            user.displayData();
            break;
        } else {
            System.out.println("You lose, the correct color is "+randomColor);
            user.loss++;
            user.attempt--;
            user.displayData();
        }
    }
    }

    

}