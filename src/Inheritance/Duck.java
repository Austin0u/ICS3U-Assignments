package Inheritance;

public class Duck extends Waterfowl {
    protected String breed;
    // quack counter


    public Duck(String name, int age, boolean canFly, boolean canSwim, String breed) {
        super(name, age, canFly, canSwim, true);
        this.breed = breed;
    }
    
    public Duck(String name, int age, String breed) {
        this(name, age, true, true, breed);
    }

    public Duck(String name, String breed) {
        this(name, 0, breed);
    }


    protected String getBreed() {
        return this.breed;
    }

    protected void quack() {
        super.makeNoise("quack");
    }

    protected boolean isSameBreed(Duck duck) {
        return this.breed.equalsIgnoreCase(duck.getBreed());
    }
}
