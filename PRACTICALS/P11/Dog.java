package P11;

interface Animal {
    public void display();
    public abstract void sound();
}


public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
    @Override
    public void display() {
        System.out.println("This is a dog.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

