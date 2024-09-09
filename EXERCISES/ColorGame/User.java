import java.util.Scanner;

public class User {
    Scanner sc= new Scanner(System.in);
    String name;
    int attempt=3;
    int win;
    int loss;

    public void addUser(){
        System.out.print("Enter your name: ");
        name = sc.next();
    }

    public void displayData(){
        System.out.println("\nUser = "+this.name+
                            "\n Win: "+this.win+
                            "\n Lose: "+this.loss+
                            "\n Attempts left: "+this.attempt+"\n");
    }
}
