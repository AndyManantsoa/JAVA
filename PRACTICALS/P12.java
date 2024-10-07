//12. Write a java Program to implement multiple Inheritances

interface Animal {
    void eat();
}

interface Mammal {
    void walk();
}

class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }
}

public class P12 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
    }
}