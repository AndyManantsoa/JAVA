import java.util.Scanner;

public class LinearSearch{

static void linearSearch(int []arr, int x){

}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int []arr = new int[n];

    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x= sc.nextInt();
        linearSearch(arr,x);
        sc.close();

    }

}      
