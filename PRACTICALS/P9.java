//9. Write a Java program for sorting a given list of names in ascending order?

import java.util.*;

public class P9 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Eve");
        names.add("Charlie");

        System.out.println("Unsorted list: " + names);
        Collections.sort(names);
        System.out.println("Sorted list: " + names);
    }
}

