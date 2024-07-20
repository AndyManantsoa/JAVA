//Write a program to perform arithmetic and bitwise operations by creating individual methods and classes
//then create an object to execute the individual methods of each operation.


/*
 ALGORITHM:
 1. Create calculator class
 2. Define all the methodes: add,sub,div,mul,&,|,^,>>,<<
 3. Create main function and call all methodes

 */

 import java.util.Scanner;

 public class P3 {
     public void Add(float a, float b){
         System.out.println(a +" + " +b +" = "+ (a+b));
     }
     public void Sub(float a, float b){
         System.out.println(a +" - " + b + " = "+(a-b));
     }
     public void Mul(float a, float b){
         System.out.println(a +" * " + b + " = "+(a*b));
     }
     public void Div(float a, float b){
         System.out.println(a +" / " + b + " = "+(a/b));
     }
     public void And(int a, int b){
         System.out.println(a + " & " + b + " = "+(a&b));
     }
     public void Or(int a, int b){
         System.out.println(a + " | " + b + " = "+(a|b));
     }
     public void Not(int a, int b){
         System.out.println(a + " ^ " + b + " = "+(a^b));
     }
     public void Left(int a, int b){
         System.out.println(a + " >> " + b + " = "+(a>>b));
     }
     public void Right(int a, int b){
         System.out.println(a + " << " + b + " = "+(a<<b));
     }
 
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         P3 calc= new P3();
         int a,b;
         System.out.println("Enter The operations you want to perform");
         System.out.println("Press 1 for Addition");
         System.out.println("Press 2 for Multiplication");
         System.out.println("Press 3 for Division");
         System.out.println("Press 4 for Substration");
         System.out.println("Press 5 for bitwise And");
         System.out.println("Press 6 for bitwise Or");
         System.out.println("Press 7 for Bitwise Not");
         System.out.println("Press 8 for Bitwise Left Shift");
         System.out.println("Press 9 for Bitwise Right Shift");
        
         int c=s.nextInt();

         

        switch (c) {
            case 1:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Add(a,b);
                break;
                
            case 2:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Mul(a,b);
                break;
                
            case 3:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                while(true){
                    
                    if(!(b>0)){
                        break;
                    }else{
                        System.out.println("Enter correct values " );
                    }
                    calc.Div(a,b);
                }
                break;
                
            case 4:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Sub(a,b);
                break;
                
            case 5:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.And(a,b);
                break;
                
            case 6:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Or(a,b);
                break;
                
            case 7:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Not(a,b);
                break;
                
            case 8:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Left(a,b);
                break;
                
            case 9:
                System.out.println("Enter the value of a: ");
                a=s.nextInt();
                System.out.println("Enter the value of b: ");
                b=s.nextInt();
                calc.Right(a,b);
                break;
             default:
                 System.out.println("Error in taking the right operation");;
         }
         s.close();

     }
 }
 