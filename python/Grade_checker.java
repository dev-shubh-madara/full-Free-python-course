import java.util.Scanner;

public class Grade_checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("       WELCOME TO STUDENT GRADE CALCULATOR    ");
        System.out.println("==============================================");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int totalSubjects = sc.nextInt();

        double totalMarks = 0;

        for (int subject = 1; subject <= totalSubjects; subject++) {
            System.out.print("Enter marks for subject " + subject + " (out of 100): ");
            double marks = sc.nextDouble();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks. Enter marks between 0 and 100: ");
                marks = sc.nextDouble();
            }

            totalMarks = totalMarks + marks;
        }

        double average = totalMarks / totalSubjects;
        String grade;
        String resultMessage;

        if (average >= 90) {
            grade = "A+";
            resultMessage = "Excellent performance!";
        } else if (average >= 80) {
            grade = "A";
            resultMessage = "Very good performance!";
        } else if (average >= 70) {
            grade = "B";
            resultMessage = "Good performance!";
        } else if (average >= 60) {
            grade = "C";
            resultMessage = "You passed. Keep improving!";
        } else if (average >= 40) {
            grade = "D";
            resultMessage = "You passed, but need more practice.";
        } else {
            grade = "F";
            resultMessage = "You need to work harder. Don't give up!";
        }

        System.out.println("\n==============================================");
        System.out.println("             STUDENT RESULT CARD               ");
        System.out.println("==============================================");
        System.out.println("Student Name  : " + name);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Total Marks   : " + totalMarks + " / " + (totalSubjects * 100));
        System.out.println("Average Marks : " + average);
        System.out.println("Grade         : " + grade);
        System.out.println("Remark        : " + resultMessage);
        System.out.println("==============================================");

        sc.close();
    }
}