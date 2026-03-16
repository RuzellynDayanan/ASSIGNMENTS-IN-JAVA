class Student {
    String name;
    int grade;

    // Constructor to initialize attributes
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to check if student passed
    boolean hasPassed() {
        return grade >= 50;
    }
}

public class StudentGradeCheckerUserInput {
    public static void main(String[] args) {
        // Create an array of 4 students
        Student[] students = {
            new Student("Alice", 75),
            new Student("Bob", 40),
            new Student("Charlie", 90),
            new Student("Diana", 55)
        };

        // Loop through each student
        for (Student s : students) {
            if (s.hasPassed()) {
                System.out.println(s.name + " has passed with grade " + s.grade);
            } else {
                System.out.println(s.name + " has failed with grade " + s.grade);
            }
        }
    }
}