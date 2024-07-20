//WAP to print reverese of the numbers in the given range where the range will be taken from the user;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("Enter the start point: ");
        a = scanner.nextInt();
        b = 0;

        while (true) { 
            System.out.println("Enter the End point: ");
            b=scanner.nextInt();
            if(!(a>b)){
                break;
            }else{
                System.out.println("End point should be greater than start point");
            }
        }

        
        for (int i =b; i >=a; i--) {
            System.out.print(i + " ");
        }
        scanner.close();

    }
}
