import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char response = 'y'; // Defaults to y for first interation

        while (response == 'y') { 
            // Prompts user for an n value (initial guess)
            System.out.print("Please enter an n value: ");
            double x = keyboard.nextDouble(); 

            // Uses Newton's method to find roots
            while (true) {
                // Calculates f(x) and f'(x)
                double fx = 6 * Math.pow(x, 4) - 13 * Math.pow(x, 3) - 18 * Math.pow(x, 2) + 7 * x + 6;
                double fpx = 24 * Math.pow(x, 3) - 39 * Math.pow(x, 2) - 36 * x + 7;

                // Calculates the next (computer) guess using function and prints the successive aproximations
                double x1 = x - fx / fpx;
                System.out.println(x1);

                // Breaks from loop once the guesses are close enough (to -1)
                if (Math.abs(x1 - x) < 0.000000001) {
                    x = x1; // Ensures it will output the last guess (otherwise it will do the second last guess)
                    break;
                }

                x = x1; // set x to the new guess for the next iteration
            }

            // Prints the final quess
            System.out.println("The root is at " + x);

            // Prompts user if they want to retry
            System.out.print("Do you to try again? (y/n): ");
            response = keyboard.next().toLowerCase().charAt(0);
        } 

        keyboard.close();

    }
}
