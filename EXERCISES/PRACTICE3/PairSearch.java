import java.util.Arrays;
import java.util.Scanner;

public class PairSearch {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total of the pair x: ");
        int x = sc.nextInt();

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array: ");

        PairSearch pairSearch = new PairSearch();
        pairSearch.bubbleSort(arr);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] + arr[i]) == x) {
                    System.out.println("(" + arr[i] + " " + arr[j] + ") & (" + arr[i] + " " + arr[j] + ")");
                }
            }
        }
    }
}