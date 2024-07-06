// Create a class called "Calculator" with the following methods:
// add(int a, int b) - This method takes two integers and returns their sum.
// subtract(int a, int b) - This method takes two integers and returns their difference.
// Write a program that:
// * Defines the Calculator class with the mentioned methods.
// * Creates an object of the Calculator class.
// * Calls the add and subtract methods with different numbers and prints the results.

import java.util.Scanner;

public class Calculator{

    public void add(int a, int b) {
        System.out.println("Addition = "+(a+b));
    }

    public void sub(int a, int b){
        System.out.println("Substraction = "+(a-b));
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a : ");
        int a=sc.nextInt();

        System.out.print("Enter a : ");
        int b=sc.nextInt();

        Calculator calc = new Calculator();
        calc.add(a,b);
        calc.sub(a,b);
    }

}