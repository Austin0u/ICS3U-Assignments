package Inheritance;

public class Waterfowl extends Bird {
    protected boolean inWater;
    protected boolean canSwim;
    protected boolean hasWebbedFeet;

    public Waterfowl(String name, int age, boolean canFly, boolean canSwim, boolean hasWebbedFeet) {
        super(name, age, canFly);
        this.canSwim = canSwim;
        this.inWater = false;
        this.hasWebbedFeet = hasWebbedFeet;
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

    protected void enterWater() {
        if (canSwim) {
            inWater = true;
            System.out.println(name + " is diving into the water"); 
        }
    }

    protected void exitWater() {
        inWater = false;
    }  
}
