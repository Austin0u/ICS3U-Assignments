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
    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected boolean canFly() {
        return canFly;
    }

    protected int eggCount() {
        return eggCount;
    }   

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected boolean isInAir() {
        return isFlying;
    }
    
    // Methods
    protected void layEgg() {
        eggCount++;
        System.out.println(name + " has laid an egg");
    }

    protected void startFlying() {
        if (canFly) {
            isFlying = true;
            System.out.println(name + " has started flying");
        }
    }

    protected void stopFlying() {
        isFlying = false;
        System.out.println(name + " has stopped flying");
    }

    protected boolean isOlder(int age) {
        return (this.age > age) ? true : false;
    }

    protected boolean sameName(Bird bird) {
        return this.name.equalsIgnoreCase(bird.getName());
    }

    protected void makeNoise(String noise) {
        System.out.println(this.name + " quacks!");
    }
}
