//Write a program to create dynamic array using ArrayList class and print the contents od the array object

import java.util.ArrayList;

public class P24 {
    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> dynamicArray = new ArrayList<>();

        // Add elements to the ArrayList
        dynamicArray.add("Apple");
        dynamicArray.add("Banana");
        dynamicArray.add("Cherry");
        dynamicArray.add("Date");

        // Print the contents of the ArrayList
        System.out.println("Dynamic Array Contents:");
        for (String element : dynamicArray) {
            System.out.println(element);
        }

        // You can also use the toString() method to print the ArrayList
        System.out.println("\nUsing toString() method:");
        System.out.println(dynamicArray);
    }
}