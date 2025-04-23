package Inheritance;

public class Duck extends Waterfowl {
    public Duck(String name, int age, boolean canFly, boolean canSwim) {
        super(name, age, canFly, canSwim, true);
    }

    public Duck(String name) {
        this(name, 0, true, true);
    }
}
