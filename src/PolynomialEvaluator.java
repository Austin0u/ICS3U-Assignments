import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompts the user for a polynomial and an x value
        System.out.println("Please enter a polynomial of the form: f(x)=3x^3 -5x^2 +1x^4 +9x^6 +3.1x^1 +2 ");
        String polynomial = keyboard.nextLine().substring(5); // Also removes the f(x)=
        System.out.print("Please enter an x value: ");
        double x = keyboard.nextDouble();
        keyboard.close();

        StringTokenizer st = new StringTokenizer(polynomial);
        double output = 0;

        while (st.hasMoreTokens()) {
            String term = st.nextToken();

            // Declares local variables for the components of the term (Default: 1x^0)
            double coefficient = 1.0;
            int exponent = 0;
            int xIndex;

            // Determines if the term is a constant or not
            if (term.contains("x")) { // Not constant
                xIndex = term.indexOf("x");

                // Determines the coeeficient and exponent of the term using the location of x (xIndex)
                coefficient = Double.parseDouble(term.substring(0, xIndex));
                exponent = Integer.parseInt(term.substring(xIndex + 2)); // xIndex +2 skips the "^"
            } else { // The term is a constant
                coefficient = Double.parseDouble(term);
            }

            output += coefficient * Math.pow(x, exponent);
        }

        // Prints final result
        System.out.println("f(" + x + ")=" + output);
    }
}
