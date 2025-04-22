package Inheritance;

public class Bird {
    protected String name;
    protected int age;
    protected boolean canFly;
    protected boolean isFlying;
    protected int eggCount;

    // Constructors
    public Bird(String name, int age, boolean canFly) {
        this.name = name;
        this.age = age;
        this.canFly = canFly;
        this.eggCount = 0;
    }

    public Bird(String name) {
        this(name, 0, true);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean canFly() {
        return canFly;
    }

    public int eggCount() {
        return eggCount;
    }   

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public boolean isInAir() {
        return isFlying;
    }
    
    // Methods
    public void layEgg() {
        eggCount++;
    }

    public int ageInBirdYears() {
        return age * 5;
    }

    public void startFlying() {
        if (canFly) {
            isFlying = true;
            System.out.println(name + " has started flying");
        }
    }

    public void stopFlying() {
        isFlying = false;
        System.out.println(name + " has stopped flying");
    }
}
