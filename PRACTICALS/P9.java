//9. Write a Java program for sorting a given list of names in ascending order?

import java.util.*;

public class P9 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mana");
        names.add("Alex");
        names.add("Coco");

        System.out.println("Unsorted list: " + names);
        Collections.sort(names);
        System.out.println("Sorted list: " + names);
    }
}

/*
public class P9 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr = new String[] {"Mom","Dad","Me"};

        System.out.print("Unsorted: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }  
        }
        System.out.println();

        System.out.print("Sorted: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
*/
