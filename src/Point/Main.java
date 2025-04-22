package Point;

public class Main {
    public static void main(String[] args) {
        Point p0 = new Point(); // test constructor
        Point p1 = new Point(5, 3);
        Point p2 = new Point(10, 10);

        System.out.println("---------------------------------------");
        System.out.println("Point 0: ");
        p0.displayCoordinate();
        System.out.println("Point 1: ");
        p1.displayCoordinate();
        System.out.println("Point 2: ");
        p2.displayCoordinate();
        System.out.println("---------------------------------------");

        Point sum = p1.sum(p2);
        System.out.println("Sum of p1 & p2: ");
        sum.displayCoordinate();
        System.out.println("---------------------------------------");

        Point difference = p1.difference(p2);
        System.out.println("Difference of p1 & p2: ");
        difference.displayCoordinate();
        System.out.println("---------------------------------------");

        double distance = p1.distance(p2);
        System.out.println("Distance between p1 & p2: " + distance);
        System.out.println("---------------------------------------");

        Point midpoint = p1.midpoint(p2);
        System.out.println("Midpoint of p1 & p2: ");
        midpoint.displayCoordinate();
        System.out.println("---------------------------------------");

        double slope = p1.slope(p2);
        System.out.println("Slope of the line through p1 & p2: " + slope);
        System.out.println("---------------------------------------");

        double yIntercept = p1.yIntercept(p2);
        System.out.println("Y-Intercept of the line through p1 & p2: " + yIntercept);
        System.out.println("---------------------------------------");

        System.out.println("Linear equation of the line through p1 & p2: ");
        p1.linearEquation(p2);
        System.out.println("---------------------------------------");
    }
}