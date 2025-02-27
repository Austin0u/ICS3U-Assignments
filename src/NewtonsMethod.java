import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char response;

        // Loop to calculate
        do {
            // Prompts user for an n value
            System.out.print("Please enter an n value: ");
            double guess = keyboard.nextDouble();
            double x = guess;
            double x1 = 0;

            // Continues to guess to obtain a root is found
            while (x1 != -1) {
                // Calculates and prints the computer guess
                x1 = x - (6 * Math.pow(x, 4) - 13 * Math.pow(x, 3) - 18 * Math.pow(x, 2) + 39 * x + 6) / (24 * Math.pow(x, 3) - 39 * Math.pow(x, 2) - 36 * x + 7);

                if (-0.01 <= x1 && x1-1 <= 0.01)

                x = x1;
                System.out.println(x1);
            }

            // Prints the final quess
            System.out.println("The root is at x = " + x1);

            // Prompts user if they want to repeat the calculation
            System.out.print("Do you to try again? (y/n): ");
            response = keyboard.next().toLowerCase().charAt(0);
        } while (response == 'y'); // If the user says yes, do again, else break

        keyboard.close();
    }
}
