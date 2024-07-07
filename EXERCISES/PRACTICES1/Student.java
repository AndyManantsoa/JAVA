package PRACTICES1;
// Create a class called "Student" with the following attributes:
// name (String)
// grade (char)
// Write a program that:
// * Defines the Student class with the mentioned attributes.
// * Creates two objects of the Student class with different student information (name and grade).
// * Add a method to the Student class called displayDetails that prints the student's name and grade.
// * Calls the displayDetails method on each student object.


public class Student{
    String name;
    String grade;

    public Student(String name, String grade){
        this.name = name;
        this.grade = grade;
    }

    public void displayDetails(){
        System.out.println("Name ="+this.name +"  " + "Grade ="+this.grade);
    }

    public static void main(String[] args){
        Student student1 = new Student("Manantsoa","A");
        Student student2 = new Student("Claudino","B");

        student1.displayDetails();
        student2.displayDetails();

    }
}