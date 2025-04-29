package Inheritance;

public class Duck extends Waterfowl {
    protected String breed; // e.g., "mallard", "pekin", "cayuga", "crested"
    protected String pattern; // e.g., "spotted", "solid", "striped"
    protected String patternColour;

    public Duck(String name, int age, boolean canFly, boolean canSwim, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        super(name, age, canFly, canSwim, true, "quack", waterTypeTolerance);
        this.breed = breed;
        this.pattern = pattern;
        this.patternColour = patternColour;
    }
    
    public Duck(String name, int age, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        this(name, age, true, true, breed, waterTypeTolerance, pattern, patternColour);
    }

    public Duck(String name, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        this(name, 0, breed, waterTypeTolerance, pattern, patternColour);
    }

    // Getters
    protected String getBreed() {
        return this.breed;
    }

    protected String getPattern() {
        return this.pattern;
    }

    protected String getPatternColour() {
        return this.patternColour;
    }

    // Instance Methods
    protected boolean isSameBreed(Duck duck) {
        return this.breed.equalsIgnoreCase(duck.getBreed());
    }

    protected boolean hasSamePattern(Duck duck) {
        return this.pattern.equalsIgnoreCase(duck.getPattern());
    }

    protected boolean hasSamePatternColour(Duck duck) {
        return this.patternColour.equalsIgnoreCase(duck.getPatternColour());
    }
}
