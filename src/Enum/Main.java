package Enum;

public class Main {
    public static void main(String[] args) {
        double mass = 288;
        double atoms = 3.2e25;
        double moles = 25.3;
        
        for (Element element : Element.values()) {
            ElementTest elementTest = new ElementTest(element);

            elementTest.test(mass, atoms, moles);
        }

        System.out.println("-------------------------------------------");
    }
}
