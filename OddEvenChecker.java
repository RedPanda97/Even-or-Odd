import java.util.Scanner;

public class OddEvenChecker {

    /*
     * Program Description:
     * This program asks the user to input a number and checks whether it is odd or even.
     * The program continues to run, allowing multiple inputs, until the user types "exit".
     *
     * Input:
     * - The user provides a numerical input (integer) or types "exit" to quit the program.
     *
     * Output:
     * - The program outputs whether the number is "even" or "odd".
     * - If the user inputs a non-numeric value, an error message is shown.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner to read user input

        // Loop until the user types 'exit'
        while (true) {
            System.out.print("Enter a number (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;  // Exit the program if 'exit' is entered
            }

            try {
                int number = Integer.parseInt(input);  // Try to parse the input as an integer

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
            } catch (NumberFormatException e) {
                // Handle invalid input by informing the user
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        scanner.close();  // Close the scanner
        System.out.println("Goodbye!");  // Print a goodbye message
    }
}
