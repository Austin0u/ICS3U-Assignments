package Enum;

public class ElementTest {
    Element element;

    public ElementTest(Element element) {
        this.element = element;
    }

    private double roundToTwoDecimals(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    public void test(double mass, double atoms, double moles) {
        System.out.println("-------------------------------------------");
        System.out.println("Element: " + element.getSymbol());
        System.out.println(" > Atomic number: " + element.getAtomicNumber());
        System.out.println(" > Atomic mass: " + element.getAtomicMass());
        System.out.println(" > " + mass + " grams = " + roundToTwoDecimals(element.massToMoles(mass)) + "moles");
        System.out.println(" > " + atoms + " atoms = " + roundToTwoDecimals(element.atomsToMass(atoms)) + "grams");
        System.out.println(" > " + moles + " moles = " + roundToTwoDecimals(element.molesToAtoms(moles)) + "atoms");
    }
}
