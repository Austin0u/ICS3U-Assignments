package Inheritance;

/**
 * The Duck class is a subclass of Waterfowl.
 * It represents a duck with specific properties such as breed, plumage pattern, and pattern color.
 * 
 * @author Austin Ou
 * @version 1.0
 */
public class Duck extends Waterfowl {

    /** The breed of the duck (e.g., "mallard", "pekin", "cayuga", "crested"). */
    protected String breed;

    /** The type of plumage pattern (e.g., "spotted", "solid", "striped"). */
    protected String pattern;

    /** The color of the plumage pattern (e.g., "brown", "white", "black"). */
    protected String patternColour;

    /**
     * Constructs a new Duck object with the given parameters.
     * 
     * @param name the name of the duck
     * @param age the age of the duck
     * @param canFly whether the duck can fly
     * @param canSwim whether the duck can swim
     * @param breed the breed of the duck (e.g., "mallard", "crested")
     * @param waterTypeTolerance the water tolerance of the duck (e.g., "freshwater", "saltwater")
     * @param pattern the type of plumage pattern (e.g., "spotted", "solid")
     * @param patternColour the color of the plumage pattern (e.g., "brown", "white")
     */
    public Duck(String name, int age, boolean canFly, boolean canSwim, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        super(name, age, canFly, canSwim, true, "quack", waterTypeTolerance);
        this.breed = breed;
        this.pattern = pattern;
        this.patternColour = patternColour;
    }

    /**
     * Constructs a new Duck object with default flying and swimming abilities set to true.
     * 
     * @param name the name of the duck
     * @param age the age of the duck
     * @param breed the breed of the duck (e.g., "mallard", "crested")
     * @param waterTypeTolerance the water tolerance of the duck (e.g., "freshwater", "saltwater")
     * @param pattern the type of plumage pattern (e.g., "spotted", "solid")
     * @param patternColour the color of the plumage pattern (e.g., "brown", "white")
     */
    public Duck(String name, int age, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        this(name, age, true, true, breed, waterTypeTolerance, pattern, patternColour);
    }

    /**
     * Constructs a new Duck object with default age set to 0 and flying/swimming abilities set to true.
     * 
     * @param name the name of the duck
     * @param breed the breed of the duck (e.g., "mallard", "crested")
     * @param waterTypeTolerance the water tolerance of the duck (e.g., "freshwater", "saltwater")
     * @param pattern the type of plumage pattern (e.g., "spotted", "solid")
     * @param patternColour the color of the plumage pattern (e.g., "brown", "white")
     */
    public Duck(String name, String breed, String waterTypeTolerance, String pattern, String patternColour) {
        this(name, 0, breed, waterTypeTolerance, pattern, patternColour);
    }

    /**
     * Gets the breed of the duck.
     * 
     * @return the breed of the duck
     */
    protected String getBreed() {
        return this.breed;
    }

    /**
     * Gets the plumage pattern of the duck.
     * 
     * @return the plumage pattern of the duck
     */
    protected String getPattern() {
        return this.pattern;
    }

    /**
     * Gets the color of the plumage pattern of the duck.
     * 
     * @return the color of the plumage pattern
     */
    protected String getPatternColour() {
        return this.patternColour;
    }

    /**
     * Checks if this duck has the same breed as another duck.
     * 
     * @param duck the other duck to compare with
     * @return true if the breeds are the same, false otherwise
     */
    protected boolean isSameBreed(Duck duck) {
        return this.breed.equalsIgnoreCase(duck.getBreed());
    }

    /**
     * Checks if this duck has the same pattern as another duck.
     * 
     * @param duck the other duck to compare with
     * @return true if the patterns are the same, false otherwise
     */
    protected boolean hasSamePattern(Duck duck) {
        return this.pattern.equalsIgnoreCase(duck.getPattern());
    }

    /**
     * Checks if this duck has the same pattern colour as another duck.
     * 
     * @param duck the other duck to compare with
     * @return true if the pattern colours are the same, false otherwise
     */
    protected boolean hasSamePatternColour(Duck duck) {
        return this.patternColour.equalsIgnoreCase(duck.getPatternColour());
    }
}