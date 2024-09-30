//13. write program to demonstrate method overriding and super keyword.

// Define a parent class
class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Define a child class that overrides the sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }

    void eat() {
        System.out.println("The dog eats");
        super.sound(); // Call the parent class's sound() method using super
    }
}

public class P13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden sound() method
        dog.eat(); // Calls the eat() method, which calls the parent class's sound() method using super
    }
}
