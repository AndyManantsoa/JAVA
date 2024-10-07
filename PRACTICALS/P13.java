//13. write program to demonstrate method overriding and super keyword.

class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }

    void eat() {
        System.out.println("The dog eats");
        super.sound(); 
    }
}

public class P13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat(); 
    }
}
