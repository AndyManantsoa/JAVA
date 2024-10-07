public class P21 {
  public static void main(String[] args) {
    try {
      int x = 5 / 0;
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException ");
    }

    try {
      String str = null;
      System.out.println(str.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    } finally {
      System.out.println("Finally block executed");
    }
  }
}