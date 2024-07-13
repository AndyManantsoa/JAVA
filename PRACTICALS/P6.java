import java.util.Scanner;

public class P6 {

    public int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public void fiboNonRec(int n) {
        int x = 0, y = 1, sum = 0;
        
        System.out.print("Non Recursive: 0 1 ");
        for (int i = 2; i <= n; i++) {
            sum = x + y;
            x = y;
            y = sum;
            System.out.print(sum +" ");
        }
        System.out.println("\nThe nth is: "+y);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of series: ");
        int n = sc.nextInt();
        
        P6 fibo = new P6();
        fibo.fiboNonRec(n);
        System.out.println("\n");

        System.out.println("Recursive Fibonacci number: " + fibo.fibo(n));
    }
}