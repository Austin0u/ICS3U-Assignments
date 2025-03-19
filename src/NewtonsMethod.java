import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            // Prompt user for an initial guess
            System.out.print("Please enter an initial root guess: ");
            double x = keyboard.nextDouble();

            // Use Newton's method to find roots
            while (true) {
                // Calculate f(x) and f'(x)
                double fx = 6 * Math.pow(x, 4) - 13 * Math.pow(x, 3) - 18 * Math.pow(x, 2) + 7 * x + 6;
                double fpx = 24 * Math.pow(x, 3) - 39 * Math.pow(x, 2) - 36 * x + 7;

                // Calculate the next guess and output each successive approximation
                double x1 = x - fx / fpx;
                System.out.println(x1);

                // Break from loop once the guess is close enough
                if (Math.abs(x1 - x) < 0.000000001) {
                    // Print the final guess
                    System.out.println("The root is at " + x1);
                    break;
                }

                x = x1; // Set x to the new guess for the next iteration
            }

            // Prompt user if they want to retry
            System.out.print("Do you want to try again? (y/n): ");
            if (keyboard.next().toLowerCase().charAt(0) != 'y') {
                break;
            }
        }

        keyboard.close();
    }
}