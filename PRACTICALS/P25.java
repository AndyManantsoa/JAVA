//Write a program to create dynamic array using ArrayList class and print the contents od the array object

import java.util.ArrayList;

public class P25 {
    public static void main(String[] args) {
        ArrayList<String> dynamicArray = new ArrayList<>();

        dynamicArray.add("Apple");
        dynamicArray.add("Banana");
        dynamicArray.add("Cherry");
        dynamicArray.add("Date");

        System.out.println("Dynamic Array Contents:");
        for (String element : dynamicArray) {
            System.out.println(element);
        }

        System.out.println("\nUsing toString() method:");
        System.out.println(dynamicArray);
    }
}