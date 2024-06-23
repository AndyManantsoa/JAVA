// package EXERCISES;
//find the grade of subject marks. and validate the marks entered by the user

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        System.out.println("Enter the mark for English: ");
        float English = 0;
        while (true) { 
            English = scanner.nextFloat();
            if (!(English < 0 || English > 100)) {
                break;
            }else{
                System.out.println("Mark should be in range of 0-100. Enter correct value: ");
            }
         }

        System.out.println("Enter the mark for French: ");
        float French = 0;
        while (true) { 
            French = scanner.nextFloat();
            if ((French < 0 || French > 100)) {
                break;
            }else{
                System.out.println("Mark should be in range of 0-100. Enter correct value: ");
            }
         }
        

        System.out.println("Enter the mark for Math: ");
        float Math = 0;
        while (true) { 
            Math = scanner.nextFloat();
            if (!(Math < 0 || Math > 100)) {
                break;
            }else{
                System.out.println("Mark should be in range of 0-100. Enter correct value: ");
            }
         }

        System.out.println("Enter the mark for Physic: ");
        float Physics = 0;
        while (true) { 
            Physics = scanner.nextFloat();
            if (!(Physics < 0 || Physics > 100)) {
                break;
            }else{
                System.out.println("Mark should be in range of 0-100. Enter correct value: ");
            }
         }

        System.out.println("Enter the mark for History: ");
        float History = 0;
        while (true) { 
            History = scanner.nextFloat();
            if (!(History < 0 || History > 100)) {
                break;
            }else{
                System.out.println("Mark should be in range of 0-100. Enter correct value: ");
            }
         }

        float average = (English + French + Math + Physics + History)/5;

        if(average<0 || average>100){
            System.out.println("Error");
        }else if(average >=80 && average <=100){
            System.out.println("Grade: A++");
        }else if(average >=70 && average <80){
            System.out.println("Grade: A+");
        }else if(average >=60 && average <70){
            System.out.println("Grade: A");
        }else{
            System.out.println("You failed");
        }
    }
    
}
