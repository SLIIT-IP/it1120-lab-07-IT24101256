import java.util.Scanner;

public class IT24101256Lab7Q1A {

    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Variables to store marks for each subject
        int subject1, subject2, subject3, subject4;
        double average;

        // Prompting the user to enter marks for four subjects
        System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
        subject1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        subject2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        subject3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        subject4 = input.nextInt();

        // Closing the scanner
        input.close();

        // Calculate the average marks
        average = (subject1 + subject2 + subject3 + subject4) / 4.0;

        // Display the average
        System.out.println("\nAverage is : " + average);

        // Determine and display the grade based on the average
        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade is : Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Overall Grade is : Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
}
