	import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their username
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        // Prompt the user for their password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Display the username and password
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
	
