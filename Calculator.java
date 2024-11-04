		import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        int operation = scanner.nextInt();
        double result;

        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + result);
                break;
            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}
	
