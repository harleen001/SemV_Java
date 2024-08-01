import java.util.Scanner;

public class HighestMarksFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store the marks
        int[] marks = new int[numberOfStudents];

        // Input marks for each student
        System.out.println("Enter the marks for each student:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Find the highest marks
        int highestMarks = marks[0];
        for (int i = 1; i < numberOfStudents; i++) {
            if (marks[i] > highestMarks) {
                highestMarks = marks[i];
            }
        }

        // Display the highest marks
        System.out.println("The highest marks in the class are: " + highestMarks);

        scanner.close();
    }
}
