package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Test Bird class
        System.out.println("======== Bird Class Test ========");
        Bird bird = new Bird("Sparrow", 2);
        System.out.println("> Bird: " + bird.getName());
        System.out.println("> Age: " + bird.getAge());
        System.out.println("> Can Fly: " + bird.canFly());
        System.out.println("---------------------------------");
        bird.startFlying();
        bird.makeNoise();
        bird.layEgg();
        bird.stopFlying();
        System.out.println("> Egg Count: " + bird.eggCount());

        // Test Waterfowl class
        System.out.println("\n====== Waterfowl Class Test ======");
        Waterfowl swan = new Waterfowl("Chas the Swan", 3, true, true, true, "honk", "freshwater");
        System.out.println("> Waterfowl: " + swan.getName());
        System.out.println("> Age: " + swan.getAge());
        System.out.println("> Can Fly: " + swan.canFly());
        System.out.println("> Can Swim: " + swan.canSwim());
        System.out.println("---------------------------------");
        swan.enterWater("freshwater");
        System.out.println("> Is in Water: " + swan.isInWater());
        swan.exitWater();
        System.out.println("> Is in Water: " + swan.isInWater());
        swan.makeNoise();

        // Test Duck class
        System.out.println("\n======== Duck Class Test ========");
        Duck duck1 = new Duck("Alice", 4, true, true, "crested", "freshwater", "spotted");
        Duck duck2 = new Duck("Bob", "crested", "freshwater", "solid");

        System.out.println("> Duck 1: " + duck1.getName());
        System.out.println("> Age: " + duck1.getAge());
        System.out.println("> Can Fly: " + duck1.canFly());
        System.out.println("> Can Swim: " + duck1.canSwim());
        System.out.println("> Breed: " + duck1.getBreed());
        System.out.println("> Plumage Pattern: " + duck1.getPattern());
        System.out.println("\n> Duck 2: " + duck2.getName());
        System.out.println("> Age: " + duck2.getAge());
        System.out.println("> Can Fly: " + duck2.canFly());
        System.out.println("> Can Swim: " + duck2.canSwim());
        System.out.println("> Breed: " + duck2.getBreed());
        System.out.println("> Plumage Pattern: " + duck2.getPattern());
        System.out.println("---------------------------------");

        duck1.enterWater("freshwater");
        System.out.println("> Is " + duck1.getName() + " in Water: " + duck1.isInWater());
        duck1.exitWater();
        System.out.println("> Is " + duck1.getName() + " in Water: " + duck1.isInWater());

        duck2.enterWater("saltwater");
        System.out.println("> Is " + duck2.getName() + " in Water: " + duck2.isInWater());

        duck1.makeNoise();
        duck2.layEgg();
        System.out.println("> Is " + duck1.getName() + " the Same Breed as " + duck2.getName() + ": " + duck1.isSameBreed(duck2));
        System.out.println("> Do " + duck1.getName() + " and " + duck2.getName() + " Have the Same Plumage Pattern: " + duck1.hasSamePattern(duck2));

        if (duck1.isOlder(duck2)) {
            System.out.println("> " + duck1.getName() + " is older than " + duck2.getName());
        } else if (duck2.isOlder(duck1)) {
            System.out.println("> " + duck2.getName() + " is older than " + duck1.getName());
        } else {
            System.out.println("> " + duck1.getName() + " and " + duck2.getName() + " are the same age.");
        }
    }
}