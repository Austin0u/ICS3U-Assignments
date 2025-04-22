package Inheritance;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Sparrow", 2, true);
        System.out.println("Bird: " + bird.getName() + ", Age: " + bird.getAge() + ", Can Fly: " + bird.canFly());

        Waterfowl waterfowl = new Waterfowl("Swan", 3, true, true);
        System.out.println("Waterfowl: " + waterfowl.getName() + ", Age: " + waterfowl.getAge() + ", Can Fly: " + waterfowl.canFly() + ", Can Swim: " + waterfowl.canSwim());
        waterfowl.enterWater();
        System.out.println("Is in water: " + waterfowl.isInWater());
        waterfowl.exitWater();
        System.out.println("Is in water: " + waterfowl.isInWater());

        Duck duck1 = new Duck("Alice", 4, true, true);
        Duck duck2 = new Duck("Bob"); // uses basic constructor
        System.out.println("Duck 1: " + duck1.getName() + ", Age: " + duck1.getAge() + ", Can Fly: " + duck1.canFly() + ", Can Swim: " + duck1.canSwim());
        System.out.println("Duck 2: " + duck2.getName() + ", Age: " + duck2.getAge() + ", Can Fly: " + duck2.canFly() + ", Can Swim: " + duck2.canSwim());
        duck1.enterWater();
        System.out.println("Duck 1 is in water: " + duck1.isInWater());
        duck1.exitWater();
        System.out.println("Duck 1 is in water: " + duck1.isInWater());
    }
}