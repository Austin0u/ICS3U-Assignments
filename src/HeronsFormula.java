import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the 3 side lengths of the triangle.
        System.out.println("Please input the length of side A of your triangle: ");
        Double sideA = keyboard.nextDouble();
        System.out.println("Please input the length of side B of your triangle: ");
        Double sideB = keyboard.nextDouble();
        System.out.println("Please input the length of side C of your triangle: ");
        Double sideC = keyboard.nextDouble();
        keyboard.close();

        // Calculates and prints result
        Double area = Math.sqrt(4 * sideA * sideA * sideB * sideB - Math.pow(sideA * sideA + sideB * sideB - sideC * sideC, 2)) / 4;
        System.out.println("The area of your triangle is " + area);
    }
}
