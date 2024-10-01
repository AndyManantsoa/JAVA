//20. Write a java program for creating single try block with multiple catch blocks.

public class P20 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 10; // This will throw an ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}