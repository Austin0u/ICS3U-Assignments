import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the 4 booleans
        System.out.print("Please input an A value (true/false): ");
        boolean A = keyboard.nextBoolean();
        System.out.print("Please input a B value (true/false): ");
        boolean B = keyboard.nextBoolean();
        System.out.print("Please input a C value (true/false): ");
        boolean C = keyboard.nextBoolean();
        System.out.print("Please input a D value (true/false): ");
        boolean D = keyboard.nextBoolean();
        keyboard.close();

        // Calculates and prints output result
        boolean a = (B && !D) || (!B && !C && D) || (!A && B && C) || (A && C && !D);        
        System.out.println("The output value is " + a);
    }
}