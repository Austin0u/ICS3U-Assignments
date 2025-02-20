import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the 4 booleans
        System.out.print("Please input an A value (true/false): ");
        Boolean A = keyboard.nextBoolean();
        System.out.print("Please input an B value (true/false): ");
        Boolean B = keyboard.nextBoolean();
        System.out.print("Please input an C value (true/false): ");
        Boolean C = keyboard.nextBoolean();
        System.out.print("Please input an D value (true/false): ");
        Boolean D = keyboard.nextBoolean();
        keyboard.close();

        // Calculates and prints output result
        Boolean a = !(B && !D) || !(!B && !C && D) || !(!A && B && C) || !(A && C && !D);        
        System.out.println("The output value is " + a);
    }
}
