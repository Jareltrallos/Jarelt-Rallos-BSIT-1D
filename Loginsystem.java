		import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        // Predefined username and password
        String correctUsername = "user";
        String correctPassword = "pass";

        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Prompt for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the username and password are correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");

            // Show choices from A to D
            System.out.println("Please choose an option:");
            System.out.println("A. Option A");
            System.out.println("B. Option B");
            System.out.println("C. Option C");
            System.out.println("D. Option D");

            // Handling user choice
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "A":
                    System.out.println("You selected Option A.");
                    break;
                case "B":
                    System.out.println("You selected Option B.");
                    break;
                case "C":
                    System.out.println("You selected Option C.");
                    break;
                case "D":
                    System.out.println("You selected Option D.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select A, B, C, or D.");
            }
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        // Close the scanner
        scanner.close();
    }
}
	
