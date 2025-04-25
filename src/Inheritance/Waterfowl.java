package Inheritance;

public class Waterfowl extends Bird {
    protected boolean inWater;
    protected boolean canSwim;
    protected boolean hasWebbedFeet;
    protected String waterTypeTolerance; // "freshwater", "saltwater", or "both"

    public Waterfowl(String name, int age, boolean canFly, boolean canSwim, boolean hasWebbedFeet, String noise, String waterTypeTolerance) {
        super(name, age, canFly, noise);
        this.canSwim = canSwim;
        this.inWater = false;
        this.hasWebbedFeet = hasWebbedFeet;
        this.noise = noise;
        this.waterTypeTolerance = waterTypeTolerance;
    }

    protected boolean canSwim() {
        return canSwim;
    }

    protected boolean isInWater() {
        return inWater;
    }

    protected boolean hasWebbedFeet() {
        return hasWebbedFeet;
    }

    protected String getWaterTypeTolerance() {
        return waterTypeTolerance;
    }

    protected boolean checkWaterTolerance(String waterType) {
        return waterType.equalsIgnoreCase(waterTypeTolerance) || waterTypeTolerance.equalsIgnoreCase("both");
    }

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

    protected void exitWater() {
        if (inWater) {
            inWater = false;
            System.out.println(name + " is swimming out of the water"); 
        } else {
            System.out.println(name + " is already out of the water"); 
        }
    }  
}
