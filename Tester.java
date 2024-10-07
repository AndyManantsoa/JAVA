

import java.util.*;

public class Tester {
    public static boolean isEven(int a){
        return a % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line of numbers: ");
        String numbers = sc.next();

        StringTokenizer tokenizer = new StringTokenizer(numbers);

        int sum = 0, odd = 0, even = 0;

        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());

            String token = tokenizer.nextToken();
            int num = Integer.parseInt(token);
            sum += num;
            if(isEven(num)){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The sum is: " + sum);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}