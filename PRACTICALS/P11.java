//11. Write a java program to represent Abstract class with example.

abstract class Animal {
    public abstract void display();
    public abstract void sound();
}


class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
    @Override
    public void display() {
        System.out.println("This is a dog.");
    }
}

public class P11{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.display();
    }
}