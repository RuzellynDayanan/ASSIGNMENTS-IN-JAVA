import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        
        System.out.print("Enter grade for student 1: ");
        int firstGrade = scanner.nextInt();

        int total = firstGrade;
        int highest = firstGrade;
        int lowest = firstGrade;
        int passedCount = 0;
        int failedCount = 0;

        
        String letter1;
        String status1;

        if (firstGrade >= 90) {
            letter1 = "A";
            status1 = "Passed";
            passedCount++;
        } else if (firstGrade >= 80) {
            letter1 = "B";
            status1 = "Passed";
            passedCount++;
        } else if (firstGrade >= 70) {
            letter1 = "C";
            status1 = "Passed";
            passedCount++;
        } else if (firstGrade >= 60) {
            letter1 = "D";
            status1 = "Passed";
            passedCount++;
        } else {
            letter1 = "F";
            status1 = "Failed";
            failedCount++;
        }

        System.out.println("Student 1: " + letter1 + " - " + status1);

        
        for (int i = 2; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            int grade = scanner.nextInt();

            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;

            String letter;
            String status;

            if (grade >= 90) {
                letter = "A";
                status = "Passed";
                passedCount++;
            } else if (grade >= 80) {
                letter = "B";
                status = "Passed";
                passedCount++;
            } else if (grade >= 70) {
                letter = "C";
                status = "Passed";
                passedCount++;
            } else if (grade >= 60) {
                letter = "D";
                status = "Passed";
                passedCount++;
            } else {
                letter = "F";
                status = "Failed";
                failedCount++;
            }

            System.out.println("Student " + i + ": " + letter + " - " + status);
        }

        
        double average = (double) total / numStudents;
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Total Passed: " + passedCount);
        System.out.println("Total Failed: " + failedCount);

        scanner.close();
    }
}
