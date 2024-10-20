//9. Write a Java program for sorting a given list of names in ascending order?

import java.util.*;

// public class P9 {
//     public static void main(String[] args) {

//         List<String> names = new ArrayList<>();
//         names.add("Mana");
//         names.add("Alex");
//         names.add("Coco");

//         System.out.println("Unsorted list: " + names);
//         Collections.sort(names);
//         System.out.println("Sorted list: " + names);
//     }
// }


public class P9 {
    public static void main(String[] args) {
        String[] arr = {"Mom","Dad","Me"};

        System.out.print("Unsorted: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        Arrays.sort(arr);

        System.out.print("Sorted: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

