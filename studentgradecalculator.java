import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate grade based on average percentage
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else if (averagePercentage >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Input: Marks for each subject
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();

            // Ensure valid marks are entered
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                i--; // Decrement index to repeat input for the same subject
                continue;
            }

            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / numSubjects;

        // Calculate grade based on average percentage
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nResults:");
        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
/*
Output:

Enter total number of students : 3

Enter Names of Students  : 1) jeeva
2) varshi
3) rishi

Enter total number of subject : 3   
Enter Names of Subject  : 1) Physics 
2) Math
3) Chemistry

Enter Marks : jeeva
Physics : 78
Math : 91
Chemistry : 81

varshi
Physics : 55
Math : 71
Chemistry : 96

rishi
Physics : 91
Math : 88
Chemistry : 99


Result :
jeeva :
Physics : 78.0
Math : 91.0
Chemistry : 81.0
Total : 250.0
Percentage : 83.0
Grade : B

varshi :
Physics : 55.0
Math : 71.0
Chemistry : 96.0
Total : 222.0
Percentage : 74.0
Grade : C

rishi :
Physics : 91.0
Math : 88.0
Chemistry : 99.0
Total : 278.0
Percentage : 92.0
Grade : A
 */
