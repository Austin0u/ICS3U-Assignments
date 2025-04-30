package Inheritance;

/**
 * The Bird class serves as a base class for all bird-related subclasses, 
 * such as "Waterfowl" and "Duck". 
 * 
 * Provides common properties and behaviors for birds, such as flying, laying eggs, 
 * and making noise. Subclasses can extend this class to add specific functionality.
 * 
 * @author Austin Ou
 * @version 1.0
 */
public class Bird {

    /** The name of the bird. */
    protected String name;

    /** The age of the bird. */
    protected int age;

    /** Whether the bird can fly. */
    protected boolean canFly;

    /** Whether the bird is currently flying. */
    protected boolean isFlying;

    /** The number of eggs the bird has laid. */
    protected int eggCount;

    /** The noise the bird makes. */
    protected String noise;

    /**
     * Constructs a new Bird object with the given parameters.
     * 
     * @param name the name of the bird 
     * @param age the age of the bird
     * @param canFly whether the bird can fly
     * @param noise the noise the bird makes
     */
    public Bird(String name, int age, boolean canFly, String noise) {
        this.name = name;
        this.age = age;
        this.canFly = canFly;
        this.isFlying = false;
        this.eggCount = 0;
        this.noise = noise;
    }

    /**
     * Initializes a new Bird object with only the name and age.
     * 
     * @param name the name of the bird 
     * @param age the age of the bird
     */
    public Bird(String name, int age) {
        this(name, age, true, "chirp");
    }

    /**
     * Initializes a new Bird object with only the name.
     * 
     * @param name the name of the bird 
     */
    public Bird(String name) {
        this(name, 0, true, "chirp");
    }

    /**
     * @return the name of the bird
     */
    protected String getName() {
        return name;
    }

    /**
     * @return the age of the bird
     */
    protected int getAge() {
        return age;
    }

    /**
     * Determines if the bird is capable of flying.
     * 
     * @return true if the bird can fly, false otherwise
     */
    protected boolean canFly() {
        return canFly;
    }

    /**
     * @return the number of eggs laid by the bird
     */
    protected int eggCount() {
        return eggCount;
    }

    /**
     * Sets the name of the bird.
     * 
     * @param name the new name of the bird
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the bird.
     * 
     * @param age the new age of the bird
     */
    protected void setAge(int age) {
        this.age = age;
    }

    /**
     * Determines if the bird is currently in the air.
     * 
     * @return true if the bird is currently in the air, false otherwise
     */
    protected boolean isInAir() {
        return isFlying;
    }

    /**
     * Method to lay an egg; increases the number of eggs.
     * Also prints a message stating who laid the egg.
     */
    protected void layEgg() {
        eggCount++;
        System.out.println(name + " has laid an egg");
    }

    /**
     * Starts flight. Will only fly if the bird is capable of flight.
     * Also prints a message stating who has begun flying.
     */
    protected void startFlying() {
        if (canFly) {
            if (!isFlying) {
                isFlying = true;
                System.out.println(name + " has started flying");
            } else {
                System.out.println(name + " is already flying");
            }
        }
    }

    /**
     * Ends flight (lands). Will only fly if the bird is capable of flight.
     * Also prints a message stating who has stopped flying.
     */
    protected void stopFlying() {
        if (isFlying) {
            isFlying = false;
            System.out.println(name + " has stopped flying");
        } else {
            System.out.println(name + " is already on the ground");
        }
    }

    /**
     * Determines if this bird is older than the referenced bird.
     * 
     * @param bird the other bird that is being compared
     * @return true if this bird is older, false otherwise
     */
    protected boolean isOlder(Bird bird) {
        return (this.age > bird.getAge()) ? true : false;
    }

    /**
     * Determines if this bird has the same name as the referenced bird.
     * 
     * @param bird the other bird that is being compared
     * @return true if both have the same name, false otherwise
     */
    protected boolean sameName(Bird bird) {
        return this.name.equalsIgnoreCase(bird.getName());
    }

    /**
     * Prints a message of the noise this bird creates.
     */
    protected void makeNoise() {
        System.out.println(this.name + " " + this.noise + "s");
    }
}