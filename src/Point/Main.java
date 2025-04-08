package Point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(3, -10);

        System.out.print("\nPoint 1: ");
        p1.displayCoordinate();
        System.out.print("\nPoint 2: ");
        p2.displayCoordinate();

        System.out.print("\n---------------------------------------\n");

        Point sum = p1.sum(p2);
        System.out.print("Sum: ");
        sum.displayCoordinate();

        Point difference = p1.difference(p2);
        System.out.print("Difference: ");
        difference.displayCoordinate();

        double distance = p1.distance(p2);
        System.out.println("Distance between points: " + distance);

        Point midpoint = p1.midpoint(p2);
        System.out.print("Midpoint: ");
        midpoint.displayCoordinate();

        double slope = p1.slope(p2);
        System.out.println("Slope of the line: " + slope);    

        double yIntercept = p1.yIntercept(p2);
        System.out.println("y-intercept of the line : " + yIntercept); 

        System.out.print("Linear equation: ");
        p1.linearEquation(p2);
    }
}