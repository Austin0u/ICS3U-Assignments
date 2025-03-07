import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the 4 booleans
        System.out.print("Please input an A value (true/false): ");
        boolean a = keyboard.nextBoolean();
        System.out.print("Please input a B value (true/false): ");
        boolean b = keyboard.nextBoolean();
        System.out.print("Please input a C value (true/false): ");
        boolean c = keyboard.nextBoolean();
        System.out.print("Please input a D value (true/false): ");
        boolean d = keyboard.nextBoolean();
        keyboard.close();

        // Calculates and prints output result
        boolean result = b && !d || !b && !c && d || !a && !b && !c || a && c && !d;        
        System.out.println("The output value is " + result);
    }
}