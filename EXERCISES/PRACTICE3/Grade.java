import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

            int marks = scanner.nextInt();

            char grade = calculateGrade(marks);

            System.out.println("Grade of student: " + grade);
        }

    public static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else {
            return 'F';
        }
        
    }
} 