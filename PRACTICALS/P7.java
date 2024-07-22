//7. Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
import java.util.Scanner;

public class P7 {

    public boolean prime(int num){
        for(int j =2;j<num;j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        P7 p7 = new P7();

        System.out.print("The prime numbers are : ");
        for(int i = 2;i<n;i++){
            boolean isPrime = p7.prime(i);

            if(isPrime){
                System.out.print(i+" ");
            }
        }
            
        
    
    }
}
