import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the 3 side lengths of the triangle.
        System.out.print("Please input the length of side A of your triangle: ");
        double a = keyboard.nextDouble();
        System.out.print("Please input the length of side B of your triangle: ");
        double b = keyboard.nextDouble();
        System.out.print("Please input the length of side C of your triangle: ");
        double c = keyboard.nextDouble();
        keyboard.close();

        // Calculates and prints result
        double area = Math.sqrt(4 * a * a * b * b - Math.pow(a * a + b * b - c * c, 2)) / 4;
        System.out.println("The area of your triangle is " + area);
    }
}
