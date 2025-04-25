package Inheritance;

public class Landfowl extends Bird {
    protected double runningSpeed;

    public Landfowl(String name, int age, boolean canFly, String noise, double runningSpeed) {
        super(name, age, canFly, noise);
        this. runningSpeed = runningSpeed;
    }

    
}
