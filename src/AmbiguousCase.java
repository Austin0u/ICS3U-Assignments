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
            } else {
                result = "two triangles (ambiguous case)";
            }
        } else { 
            result = (a < b || a == h) ? "no triangle" : "one triangle";
        }

        // Prints result
        System.out.println("There is " + result);
    }
}
