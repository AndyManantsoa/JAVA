import java.util.Scanner;

public class P6 {

    public int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public int fiboNonRec(int n) {
        if (n == 0) {
            return 0;
        }
        int x = 0, y = 1;
        
        for (int i = 1; i <= n; i++) {
            int sum = x + y;
            x = y;
            y = sum;
        }
        return y;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series");

        int n = sc.nextInt();

        P6 fibo = new P6();
        System.out.println("Non-recursive Fibonacci series:"+fibo.fiboNonRec(n - 1));
        System.out.println("Recursive Fibonacci number: " + fibo.fibo(n));
    }
}