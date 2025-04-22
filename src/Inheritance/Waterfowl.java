package Inheritance;

public class Waterfowl extends Bird {
    protected boolean inWater;
    protected boolean canSwim;

    public Waterfowl(String name, int age, boolean canFly, boolean canSwim) {
        super(name, age, canFly);
        this.canSwim = canSwim;
        this.inWater = false;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public boolean isInWater() {
        return inWater;
    }

    public void enterWater() {
        if (canSwim) {
            inWater = true;
            System.out.println(name + " is diving into the water"); 
        }
    }

    public void exitWater() {
        inWater = false;
    }

    
}
