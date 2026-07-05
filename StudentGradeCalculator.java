import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter number of grades: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("No grades entered.");
            scanner.close();
            return;
        }

      
        double[] grades = new double[n];
        double total = 0;

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

        
        double average = total / n;

        
        System.out.println("\n--- Grade Summary ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Grade %d: %.2f%n", i + 1, grades[i]);
        }
        System.out.printf("Average Grade: %.2f%n", average);

        scanner.close();
    }
}
