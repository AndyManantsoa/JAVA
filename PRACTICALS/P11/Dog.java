package P11;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

