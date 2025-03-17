import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char response = 'y'; // Allows first iteration

        while (response == 'y') {
            // Prompt user for an initial guess
            System.out.print("Please enter an initial guess: ");
            double x = keyboard.nextDouble();

            // Use Newton's method to find roots
            while (true) {
                // Calculate f(x) and f'(x)
                double fx = 6 * Math.pow(x, 4) - 13 * Math.pow(x, 3) - 18 * Math.pow(x, 2) + 7 * x + 6;
                double fpx = 24 * Math.pow(x, 3) - 39 * Math.pow(x, 2) - 36 * x + 7;

                // Calculate the next guess and output each successive approximation
                double x1 = x - fx / fpx;
                System.out.println(x1);

                // Break from loop once the guesses are close enough
                if (Math.abs(x1 - x) < 0.000000001) {
                    x = x1; // Ensure it will output the last guess
                    break;
                }

                x = x1; // Set x to the new guess for the next iteration
            }

            // Print the final guess
            System.out.println("The root is at " + x);

            // Prompt user if they want to retry
            System.out.print("Do you want to try again? (y/n): ");
            response = keyboard.next().toLowerCase().charAt(0);
        }

        keyboard.close();
    }
}