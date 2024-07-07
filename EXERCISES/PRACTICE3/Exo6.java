import java.util.Scanner;

class Employee {
    String name;
    int ID;
    int age;
    String post;
    int salary;
    Scanner sc = new Scanner(System.in);

    public Employee(String name, int ID, int age, String post, int salary) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void addEmployee() {
        System.out.println("Enter the name of the employee: ");
        this.name = sc.next();
        System.out.println("Enter the ID of the employee: ");
        this.ID = sc.nextInt();

        System.out.println("Enter the age of the employee: ");
        this.age = sc.nextInt();
        while(age<20||age>75){
            System.out.println("Invalid age, Age should be between 20 t0 75\nEnter again:");
            this.age = sc.nextInt();
        }
        System.out.println("Enter the post of the employee: ");
        this.post = sc.next();
        System.out.println("Enter the salary of the employee: ");
        this.salary = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.ID);
        System.out.println("Age: " + this.age);
        System.out.println("Post: " + this.post);
        System.out.println("Salary: " + this.salary);
    }
}

public class Exo6 {

    
    public static void main(String[] args) {
        Employee employee1 = new Employee("", 0, 0, "", 0);
        employee1.addEmployee();
        employee1.display();
    }

}