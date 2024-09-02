//11. Write a java program to represent Abstract class with example.

public abstract class Dog {
    public abstract void sound();
}

public class P11 extends Dog {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        P11 dog = new P11();
        dog.sound();
    }
}