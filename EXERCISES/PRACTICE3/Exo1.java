//WAP to calculate the average currency value in the last years taken from user4;

import java.util.Scanner;

public class Exo1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;
        System.out.println("Enter the number of years: ");
        year = s.nextInt();
        float []rate = new float[year];

        for (int i = 0; i < year; i++) {
            System.out.println("Enter the rate number " + (i+1));
            rate[i]=s.nextFloat();
        }

        float total=0;

        for (int i = 0; i < year; i++) {
            total += rate[i];
        }

        float average = total/year;

        System.out.println("The average is " + average);
        s.close();


    }
    
}