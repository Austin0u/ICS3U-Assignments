package Enum;

public class ElementTest {
    Element element;

    public ElementTest(Element element) {
        this.element = element;
    }

    public void test(double mass, double atoms, double moles) {
        System.out.println("Element: " + element.toString().toLowerCase() + " (" + element.getSymbol() + ")");
        System.out.println(" > Atomic number: " + element.getAtomicNumber());
        System.out.println(" > Atomic mass: " + element.getAtomicMass());
        System.out.println(" > " + mass + " grams = " + element.massToMoles(mass) + " moles");
        System.out.println(" > " + atoms + " atoms = " + element.atomsToMass(atoms) + " grams");
        System.out.println(" > " + moles + " moles = " + element.molesToMass(moles) + " grams");
    }
}
