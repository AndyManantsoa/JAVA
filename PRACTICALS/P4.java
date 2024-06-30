//4. Write a java program to display the employee details using Scanner class.
import java.util.Scanner;

public class P4{
    String name;
    int age;
    int salary;

    public P4(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    };

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = sc.next();

        System.out.println("Enter the age of the employee: ");
        int age = sc.nextInt();
        while(age<20 ||age >75){
            System.out.println("Age invalid, age shoul be between 20 to 75\nEnter the age of the employee: ");
            age = sc.nextInt();
        }
        System.out.println("Enter the salary of the employee: ");
        int salary = sc.nextInt();
        P4 employee = new P4(name, age, salary);
        employee.display();
    }
}