package Inheritance;

/**
 * The Waterfowl class is a subclass of Bird.
 * This class is intended to be extended by more specific waterfowl types, such as ducks.
 * 
 * @author Austin Ou
 * @version 1.0
 */
public class Waterfowl extends Bird {

    /** Whether the waterfowl is currently in water. */
    protected boolean inWater;

    /** Whether the waterfowl can swim. */
    protected boolean canSwim;

    /** Whether the waterfowl has webbed feet. */
    protected boolean hasWebbedFeet;

    /** The water type tolerance of the waterfowl (e.g., "freshwater", "saltwater", or "both"). */
    protected String waterTypeTolerance;

    /**
     * Constructs a new Waterfowl object with the given parameters.
     * 
     * @param name the name of the waterfowl
     * @param age the age of the waterfowl
     * @param canFly whether the waterfowl can fly
     * @param canSwim whether the waterfowl can swim
     * @param hasWebbedFeet whether the waterfowl has webbed feet
     * @param noise the noise the waterfowl makes
     * @param waterTypeTolerance the water tolerance of the waterfowl (e.g., "freshwater", "saltwater", or "both")
     */
    public Waterfowl(String name, int age, boolean canFly, boolean canSwim, boolean hasWebbedFeet, String noise, String waterTypeTolerance) {
        super(name, age, canFly, noise);
        this.canSwim = canSwim;
        this.inWater = false;
        this.hasWebbedFeet = hasWebbedFeet;
        this.waterTypeTolerance = waterTypeTolerance;
    }

    /**
     * Determines if the waterfowl can swim.
     * 
     * @return true if the waterfowl can swim, false otherwise
     */
    protected boolean canSwim() {
        return canSwim;
    }

    /**
     * Determines if the waterfowl is currently in water.
     * 
     * @return true if the waterfowl is in water, false otherwise
     */
    protected boolean isInWater() {
        return inWater;
    }

    /**
     * Determines if the waterfowl has webbed feet.
     * 
     * @return true if the waterfowl has webbed feet, false otherwise
     */
    protected boolean hasWebbedFeet() {
        return hasWebbedFeet;
    }

    /**
     * Gets the water type tolerance of the waterfowl.
     * 
     * @return the water type tolerance (e.g., "freshwater", "saltwater", or "both")
     */
    protected String getWaterTypeTolerance() {
        return waterTypeTolerance;
    }

    /**
     * Checks if the waterfowl can tolerate a specific type of water.
     * 
     * @param waterType the type of water to check (e.g., "freshwater", "saltwater")
     * @return true if the waterfowl can tolerate the specified water type, false otherwise
     */
    protected boolean checkWaterTolerance(String waterType) {
        return waterType.equalsIgnoreCase(waterTypeTolerance) || waterTypeTolerance.equalsIgnoreCase("both");
    }

    /**
     * Allows the waterfowl to enter water if it can swim and the water type is tolerated.
     * Prints a message indicating the result.
     * 
     * @param waterType the type of water the waterfowl is attempting to enter (e.g., "freshwater", "saltwater")
     */
    protected void enterWater(String waterType) {
        if (canSwim && checkWaterTolerance(waterType)) {
            inWater = true;
            System.out.println(name + " is diving into the water");
        } else if (!canSwim) {
            System.out.println(name + " cannot swim");
        } else {
            System.out.println(name + " cannot enter " + waterType + " water");
        }
    }

    /**
     * Allows the waterfowl to exit water if it is currently in water.
     * Prints a message indicating the result.
     */
    protected void exitWater() {
        if (inWater) {
            inWater = false;
            System.out.println(name + " is swimming out of the water");
        } else {
            System.out.println(name + " is already out of the water");
        }
    }
}