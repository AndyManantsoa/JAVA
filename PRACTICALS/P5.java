// 5. Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0.
//    Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative,
//    display a message stating that there are no real solutions?

import java.util.Scanner;

public class P5{
    public void findDiscriminant(double a,double b, double c){
        double discriminant = b*b - 4*a*c;
            if (discriminant < 0){
                System.out.println("There are no real solutions");
            }else if(discriminant >= 0){
                System.out.println("The real solutions are: ");
                double x1= ((-b)-Math.sqrt(discriminant))/(2*a);
                double x2= ((-b)-Math.sqrt(discriminant))/(2*a);
                System.out.println("  x1 = "+x1);
                System.out.println("  x2 = "+x2);
            }
        }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the equation in the format of ax^2 + bx + c = 0");

        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        System.out.println("\n Your equation is: " + a +"x^2 + "+ b +"x + " + c + "= 0");
        P5 p5 = new P5();
        p5.findDiscriminant(a,b,c);        

    }
}

