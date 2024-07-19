import java.util.Scanner;

public class WeeklyTestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = 5;
        int numTests = 4;
        int[][] scores = new int[numStudents][numTests];

        for (int student = 0; student < numStudents; student++) {
            System.out.println("Enter scores for Student " + (student + 1) + ":");
            for (int test = 0; test < numTests; test++) {
                System.out.print("Test " + (test + 1) + ": ");
                scores[student][test] = scanner.nextInt();
            }
        }

        System.out.println("\nScores for all students:");
        for (int student = 0; student < numStudents; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int test = 0; test < numTests; test++) {
                System.out.print(scores[student][test] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAverage scores for each student:");
        for (int student = 0; student < numStudents; student++) {
            int total = 0;
            for (int test = 0; test < numTests; test++) {
                total += scores[student][test];
            }
            double average = (double) total / numTests;
            System.out.println("Student " + (student + 1) + ": " + average);
        }

        scanner.close();
    }
}
