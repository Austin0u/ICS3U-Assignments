package Enum;

public enum Element {
    HYDROGEN("H", 1, 1.0078),
    HELIUM("He", 2, 4.0026),
    LITHIUM("Li", 3, 6.9410),
    BERYLLIUM("Be", 4, 9.0122),
    BORON("B", 5, 10.811),
    CARBON("C", 6, 12.011),
    NITROGEN("N", 7, 14.007),
    OXYGEN("O", 8, 15.9990),
    FLUORINE("F", 9, 18.998),
    NEON("Ne", 10, 20.180);

    private String symbol;
    private int atomicNumber;
    private double atomicMass;
    private final double avogadrosNumber = 6.02214076e23;


    Element(String symbol, int atomicNumber, double atomicMass) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public double massToMoles(double mass) {
        return mass / atomicMass;
    }

    public double molesToMass(double moles) {
        return moles * atomicMass;
    }

    public double atomsToMoles(double atoms) {
        return atoms / avogadrosNumber;
    }

    public double molesToAtoms(double moles) {
        return moles * avogadrosNumber;
    }

    public double massToAtoms(double mass) {
        return molesToAtoms(massToMoles(mass));
    }

    public double atomsToMass(double atoms) {
        return molesToMass(atomsToMoles(atoms));
    }
}


