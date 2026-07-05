import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double convertedTemp;
        String convertedUnit;

     
        if (unit == 'C') {
            convertedTemp = (temp * 9/5) + 32;
            convertedUnit = "Fahrenheit";
            System.out.printf("%.2f Celsius = %.2f %s%n", temp, convertedTemp, convertedUnit);
        } else if (unit == 'F') {
            convertedTemp = (temp - 32) * 5/9;
            convertedUnit = "Celsius";
            System.out.printf("%.2f Fahrenheit = %.2f %s%n", temp, convertedTemp, convertedUnit);
        } else {
            System.out.println("Invalid unit entered. Please use C or F.");
        }

        scanner.close();
    }
}
