//11. Write a java program to represent Abstract class with example.

interface Animal {
    public void display();
    public abstract void sound();
}


class Dog implements Animal {
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
    }
}

