import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for a polynomial and an x value
        System.out.println("Please enter a polynomial of the form: f(x)=3x^3 -5x^2 +1x^4 +9x^6 +3.1x^1 +2: ");
        String polynomial = keyboard.nextLine();
        
        System.out.print("Please enter an x value: ");
        double x = keyboard.nextDouble();
        keyboard.close();

        // Removes "f(x)=""
        if (polynomial.substring(0,5).equals("f(x)=")) {
            polynomial = polynomial.substring(5);
        }

        System.out.println(polynomial + x); // DEBUG

        StringTokenizer st = new StringTokenizer(polynomial, " ");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


        
    }
}
