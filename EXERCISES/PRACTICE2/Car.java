// 1) Create a class Car with instance variables for make, model, and year.
//    Write constructors with and without arguments (default constructor).

public class Car {
     String make;
     String model;
     int year;
 
     //default constructor;
     public Car(){
         System.out.println("Car created");
     }
 
     //Parametrized constructor;
     public Car(String make, String model, int year){
         this.make = make;
         this.model = model;
         this.year = year;
     }
 
     public void display(){
         System.out.println("make : "+this.make+"\n"+
                           "model : "+this.model+"\n"+
                           "year : "+this.year+"\n\n");
     }
 
     public static void main(String[] args){
         Car car1 = new Car();
         car1.display();
         Car car2 = new Car("Lamborghini", "Urus", 2019);
         car2.display();
     }
 
 }
