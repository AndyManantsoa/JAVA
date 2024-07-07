import java.util.Scanner;

public class BubbleSort{
    public void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1 ;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    Swap(arr,j,j+1);
                }
            }
        }
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

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.bubbleSort(arr);

        System.out.println("Sorted array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }
    }
}