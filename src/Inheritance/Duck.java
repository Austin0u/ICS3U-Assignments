package Inheritance;

public class Duck extends Waterfowl {
    protected String breed; // e.g., "mallard", "pekin", "cayuga", "crested"
    protected String plumagePattern; // e.g., "spotted", "solid", "striped"

    public Duck(String name, int age, boolean canFly, boolean canSwim, String breed, String waterTypeTolerance, String plumagePattern) {
        super(name, age, canFly, canSwim, true, "quack", waterTypeTolerance);
        this.breed = breed;
        this.plumagePattern = plumagePattern;
    }
    
    public Duck(String name, int age, String breed, String waterTypeTolerance, String plumagePattern) {
        this(name, age, true, true, breed, waterTypeTolerance, plumagePattern);
    }

    public Duck(String name, String breed, String waterTypeTolerance, String plumagePattern) {
        this(name, 0, breed, waterTypeTolerance, plumagePattern);
    }

    protected String getBreed() {
        return this.breed;
    }

    protected String getPlumagePattern() {
        return this.plumagePattern;
    }

    protected void quack() {
        super.makeNoise();
    }

    protected boolean isSameBreed(Duck duck) {
        return this.breed.equalsIgnoreCase(duck.getBreed());
    }

    protected boolean hasSamePattern(Duck duck) {
        return this.plumagePattern.equalsIgnoreCase(duck.getPlumagePattern());
    }
}
