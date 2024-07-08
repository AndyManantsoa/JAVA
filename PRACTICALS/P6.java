// 6. The Fibonacci sequence is defined by the following rule. 
//     The first 2 values in the sequence are 1, 1. 
//     Every subsequent value is the sum of the 2 values preceding it. 
//     Write a Java program that uses both recursive and non- recursive functions to print the nth value of the Fibonacci sequence?
import java.util.Scanner;

public class P6{


    public int fibo (int n) {
        if(n==0 || n==1){
            return n;
        }else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int x = 0, y = 1, sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = x + y;
            System.out.print(sum + " ");
            x = y;
            y = sum;

        }
        P6 fibo = new P6();
        for (int i = 0; i <= n; i++) {
            System.out.println(fibo.fibo(n)+" ");
        }
    }
}
