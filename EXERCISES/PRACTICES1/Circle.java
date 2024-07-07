package PRACTICES1;
// Create a class called "Circle" with the following attribute:
// radius (double)
// Write a program that:
// * Defines the Circle class with the mentioned attribute.
// * Add a method to the Circle class called calculateArea that calculates the area of the circle (pi * radius^2) and returns the result.
// * Create an object of the Circle class with a specific radius value.
// * Call the calculateArea method on the circle object and print the calculated area.


public class Circle {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(20);
        circle.calculateArea();
    }
}
