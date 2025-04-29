package Inheritance;

/**
 * The Duck class is a subclass of Waterfowl.
 * 
 * @author Austin Ou
 * @version 1.0
 */
public class Duck extends Waterfowl {
    protected String breed; // e.g., "mallard", "pekin", "cayuga", "crested"
    protected String pattern; // e.g., "spotted", "solid", "striped"
    protected String patternColour;

    /**
     * Constructs a new Duck object with the given parameters.
     * 
     * @param name - the name of the bird 
     * @param age - the age of the bird
     * @param canFly - whether the bird can fly
     * @param canSwim - whether the bird can swim
     * @param waterTypeTolerance - the water tolerance of the bird (e.g. saltwater or freshwater)
     * @param pattern - the type of pattern 
     * @param patternColour - the colour of the pattern
     */
    public Duck(String name, int age, boolean canFly, boolean canSwim, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        super(name, age, canFly, canSwim, true, "quack", waterTypeTolerance);
        this.breed = breed;
        this.pattern = pattern;
        this.patternColour = patternColour;
    }
    
    /**
     * Initalizes a new Duck object with name, age, breed, water tollerance, patterm, and pattern colour.
     */
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
