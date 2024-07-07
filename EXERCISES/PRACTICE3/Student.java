import java.util.Scanner;

public class Student {
    String name;
    int ID;
    int age;
    String division;

    public Student(String name, int ID, int age, String division){ 
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.division = division;
    }

    public void display(){ 
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of students: ");
        String name = scanner.next();
        System.out.println("Enter the ID of students: ");
        int ID = scanner.nextInt();
        System.out.println("Enter the age of students: ");
        int age = scanner.nextInt();
        System.out.println("Enter the division of students: ");
        String division = scanner.next();

        Student student = new Student(name, ID, age, division);
        student.display();
    }
}