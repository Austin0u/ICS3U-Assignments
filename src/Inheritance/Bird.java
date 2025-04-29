package Inheritance;

public class Bird {
    protected String name;
    protected int age;
    protected boolean canFly;
    protected boolean isFlying;
    protected int eggCount;
    protected String noise;

    // Constructors
    public Bird(String name, int age, boolean canFly, String noise) {
        this.name = name;
        this.age = age;
        this.canFly = canFly;
        this.isFlying = false;
        this.eggCount = 0;
        this.noise = noise;
    }

    public Bird(String name, int age) {
        this(name, age, true, "chirp");
    }

    public Bird(String name) {
        this(name, 0, true, "chirp");
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

    // Instance Methods
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
        if (!canFly) {
            System.out.println(name + " cannot fly");
        } else if (isFlying) {
            isFlying = false;
            System.out.println(name + " has stopped flying");
        } else {
            System.out.println(name + " is already on the ground");
        }
    }

    protected boolean isOlder(Bird bird) {
        return (this.age > bird.getAge()) ? true : false;
    }

    protected boolean sameName(Bird bird) {
        return this.name.equalsIgnoreCase(bird.getName());
    }

    protected void makeNoise() {
        System.out.println(this.name + " " + this.noise + "s");
    }
}
