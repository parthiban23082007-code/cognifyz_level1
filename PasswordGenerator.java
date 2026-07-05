import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLower = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUpper = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = scanner.nextLine().equalsIgnoreCase("y");

       
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+<>?/";

        String charPool = "";
        if (includeLower) charPool += lower;
        if (includeUpper) charPool += upper;
        if (includeNumbers) charPool += numbers;
        if (includeSpecial) charPool += special;

        if (charPool.isEmpty()) {
            System.out.println("No character types selected. Cannot generate password.");
            scanner.close();
            return;
        }

    
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        
        System.out.println("Generated Password: " + password);

        scanner.close();
    }
}
