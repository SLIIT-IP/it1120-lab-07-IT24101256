import java.util.Scanner;

public class IT24101256Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Process data for 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            // Read four marks in a single line
            int subject1 = input.nextInt();
            int subject2 = input.nextInt();
            int subject3 = input.nextInt();
            int subject4 = input.nextInt();
            
            // Calculate average
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;
            System.out.println("Average is: " + average);
            
            // Determine grade based on average
            if (average >= 75) {
                System.out.println("Overall Grade is: Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is: Credit");
            } else {
                System.out.println("Overall Grade is: Fail");
            }
            
            System.out.println();  // Blank line for readability between students
        }
        
        
    }
}