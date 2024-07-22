import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for matrix: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] matrix3 = new int[row][column];

        System.out.println("Enter the element of matrix 1: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the element of matrix 2: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                for(int k=0;k<column;k++){
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("The result is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}