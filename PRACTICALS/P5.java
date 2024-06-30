// 5. Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0.
//    Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative,
//    display a message stating that there are no real solutions?

import java.util.Scanner;

public class P5.java{
    public void findDiscriminant(float a,float b, float c){
        float discriminant = b*b - 4*a*c;
            if (discriminant < 0){
                System.out.println("There are no real solutions");
            }else if(discriminant >= 0){
                System.out.println("");
            }
        }

    }
    
    public static void main(String[] args){
        System.out.print("Enter the value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        float b = sc.nextFloat();
        System.out.print("Enter the value of c: ");
        float c = sc.nextFloat();

        float discriminant = b*b - 4*a*c;
        if (discriminant < 0){
            System.out.println("There are no real solutions");
        }
    }
}
