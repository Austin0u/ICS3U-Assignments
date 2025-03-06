import java.util.Scanner;

public class AmbiguousCase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the angle A and two sides
        System.out.print("Please enter the value of angle A (degrees): ");
        double angleA = keyboard.nextDouble();
        System.out.print("Please enter the value of side a: ");
        double a = keyboard.nextDouble();
        System.out.print("Please enter the value of side b: ");
        double b = keyboard.nextDouble();
        keyboard.close();

        double h = b*Math.sin(Math.toRadians(angleA));
        String result = "";

        // Outputs type of triangle based on case
        if (angleA <= 90) { 
            if (a < h) {
                result = "no triangle";
            } else if (a == h) {
                result = "right triangle";
            } else if (a > b) {
                result = "one triangle";
            } else if (h < a && a < b) {
                result = "two triangles (ambiguous case)";
            }
        } else { 
            if (a < b || a == b) {
                result = " no triangle";
            } else { // a > b
                result = "one triangle";
            }
        }

        // Prints result
        System.out.println("Result: " + result);
    }
}
