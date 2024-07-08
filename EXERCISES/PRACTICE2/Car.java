// 1) Create a class Car with instance variables for make, model, and year.
//    Write constructors with and without arguments (default constructor).

public class Car {
    String make;
    String model;
    int year;

    //default constructor
   public Car(){
        System.out.println("Car created");
   }

   public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
   }

   
}
