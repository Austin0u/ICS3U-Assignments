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

        // Outputs type of triangle based on case
        if (angleA < 90) { 
            double h = b * Math.sin(Math.toRadians(angleA));

            if (a < h) {
                System.out.println("There is no triangle.");
            } else if (a == h) {
                System.out.println("It is a right triangle.");
            } else if (a > b) {
                System.out.println("There is one triangle.");
            } else if (h < a && a < b) {
                System.out.println("There are two triangles (ambiguous case).");
            }
        } else { 
            if (a < b || a == b) {
                System.out.println("There is no triangle.");
            } else { // a > b
                System.out.println("There is one triangle.");
            }
        }
    }
}