import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstDerivative = "f'(x) =";
        String secondDerivative = "f''(x) =";

        // Prompts the user for the coefficients and exponents (as strings, then splits to store into arrays)
        System.out.println("Please enter your coefficients: ");
        String[] coefficients = keyboard.nextLine().split(" ");
        System.out.println("Please enter your exponents: ");
        String[] exponents = keyboard.nextLine().split(" ");
        keyboard.close();

        // Calculate both first and second derivatives in the same loop
        for (int i = 0; i < coefficients.length; i++) {
            // Local variables to store the original double and int versions of the coefficient and exponent (to be modified later)
            // double coef = Double.parseDouble(coefficients[i]);
            // int exp = Integer.parseInt(exponents[i]);

            // Calculates the first derivative
            double firstCoef = Double.parseDouble(coefficients[i]) * Integer.parseInt(exponents[i]);
            int firstExp = Integer.parseInt(exponents[i]) - 1;

            if (firstCoef != 0) {
                String term = firstCoef + ((firstExp != 0) ? "x^" + firstExp : ""); // Concatenates the term, only adds exponent if needed
                firstDerivative += (firstCoef > 0 && i != 0 ? " +" : " ") + term; // Adds a plus sign if needed
            }

            // Calculates the second derivative
            double secondCoef = firstCoef * firstExp;
            int secondExp = firstExp - 1;

            if (secondCoef != 0) {
                String term = secondCoef + ((secondExp != 0) ? "x^" + secondExp : ""); // Concatenates the term, only adds exponent if needed
                secondDerivative += (secondCoef > 0 && i != 0 ? " +" : " ") + term; // Adds a plus sign if needed
            }
        }

        // Prints both derivatives
        System.out.println("Your first derivative is: " + firstDerivative);
        System.out.println("Your second derivative is: " + secondDerivative);
    }
}