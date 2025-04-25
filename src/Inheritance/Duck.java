package Inheritance;

public class Duck extends Waterfowl {
    protected String breed; // e.g., "mallard", "pekin", "cayuga", "crested"
    protected String pattern; // e.g., "spotted", "solid", "striped"

    public Duck(String name, int age, boolean canFly, boolean canSwim, String breed, String waterTypeTolerance, String pattern) {
        super(name, age, canFly, canSwim, true, "quack", waterTypeTolerance);
        this.breed = breed;
        this.pattern = pattern;
    }
    
    public Duck(String name, int age, String breed, String waterTypeTolerance, String pattern) {
        this(name, age, true, true, breed, waterTypeTolerance, pattern);
    }

    public Duck(String name, String breed, String waterTypeTolerance, String pattern) {
        this(name, 0, breed, waterTypeTolerance, pattern);
    }

    protected String getBreed() {
        return this.breed;
    }

    protected String getPattern() {
        return this.pattern;
    }


    protected boolean isSameBreed(Duck duck) {
        return this.breed.equalsIgnoreCase(duck.getBreed());
    }

    protected boolean hasSamePattern(Duck duck) {
        return this.pattern.equalsIgnoreCase(duck.getPattern());
    }
}
