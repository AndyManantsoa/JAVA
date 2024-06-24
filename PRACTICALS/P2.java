//Write a program to perform arithmetic and bitwise operations in a single source program without object creation.


/*
 ALGORITHM:
 1. Create calculator class
 2. Define all the methodes: add,sub,div,mul,&,|,^,>>,<<
 3. Create main function and call all methodes

 */

 import java.util.Scanner;

 public class P2 {
     static void Add(float a, float b){
         System.out.println(a +" + " +b +" = "+ (a+b));
     }
     static void Sub(float a, float b){
         System.out.println(a +" - " + b + " = "+(a-b));
     }
     static void Mul(float a, float b){
         System.out.println(a +" * " + b + " = "+(a*b));
     }
     static void Div(float a, float b){
         System.out.println(a +" / " + b + " = "+(a/b));
     }
     static void And(int a, int b){
         System.out.println(a + " & " + b + " = "+(a&b));
     }
     static void Or(int a, int b){
         System.out.println(a + " | " + b + " = "+(a|b));
     }
     static void Not(int a, int b){
         System.out.println(a + " ^ " + b + " = "+(a^b));
     }
     static void Left(int a, int b){
         System.out.println(a + " >> " + b + " = "+(a>>b));
     }
     static void Right(int a, int b){
         System.out.println(a + " << " + b + " = "+(a<<b));
     }
 
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int a,b;

        a = s.nextInt();
        b = s.nextInt();
         while(b==0){
            System.out.println("Enter correct values " );
            b = s.nextInt();
        }
        
    Add(a,b);
    Mul(a,b);
    Sub(a,b);
    Div(a,b);
    And(a,b);
    Or(a,b);
    Not(a,b);
    Left(a,b);
    Right(a,b);
               
 }
}
 