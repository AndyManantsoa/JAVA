package PRACTICE3;
import java.util.Scanner;

public class ArrayExo{

    public void filterOdd(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if(!(arr[i]%2==0)){
                System.out.print(arr[i] +" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The answer: ");

        ArrayExo arrayExo = new ArrayExo();
        arrayExo.filterOdd(arr);

    }
}