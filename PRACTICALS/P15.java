//15. Write a java program to create inner classes.

public class P15 {
    private int x = 10;

    // Inner class
    class InnerClass {
        private int y = 20;

        public void printValues() {
            System.out.println("Outer class variable x: " + x);
            System.out.println("Inner class variable y: " + y);
        }
    }

    public static void main(String[] args) {
        P15 outer = new P15();
        P15.InnerClass inner = outer.new InnerClass();
        inner.printValues();
    }
}