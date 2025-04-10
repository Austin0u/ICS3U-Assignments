package Enum;

public enum Element {
    HYDROGEN("H", 1, 1.0078),
    HELIUM("He", 2, 4.0026),
    LITHIUM("Li", 3, 6.9410),
    BERYLLIUM("Be", 4, 9.0122),
    BORON("Be", 5, 10.811),
    CARBON("C", 6, 12.011),
    NITROGEN("N", 7, 14.007),
    OXYGEN("O", 8, 15.9990),
    FLUORINE("F", 9, 18.998),
    NEON("Ne", 10, 20.180);

    private String symbol = "";
    private int atomicNumber;
    private double molarMass;
    private final double avogadrosNumber = 6.02214076 * Math.pow(10, 23);


    Element(String symbol, int atomicNumber, double molarMass) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.molarMass = molarMass;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getMolarMass() {
        return molarMass;
    }

    public double massToMoles(double mass) {
        return mass / molarMass;
    }

    public double molesToMass(double moles) {
        return moles * molarMass;
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


