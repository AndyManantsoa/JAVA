//Write a program to impliment add, search and remove operation on ArrayList object.

import java.util.ArrayList;
import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add element");
            System.out.println("2. Search element");
            System.out.println("3. Remove element");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.next();
                    arrayList.add(elementToAdd);
                    System.out.println("Element added successfully!");
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    String elementToSearch = scanner.next();
                    if (arrayList.contains(elementToSearch)) {
                        System.out.println("Element found in the list!");
                    } else {
                        System.out.println("Element not found in the list!");
                    }
                    break;
                case 3:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.next();
                    if (arrayList.contains(elementToRemove)) {
                        arrayList.remove(elementToRemove);
                        System.out.println("Element removed successfully!");
                    } else {
                        System.out.println("Element not found in the list!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
    }
}