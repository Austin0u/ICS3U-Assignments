package Point;

public class Main {
    public static void main(String[] args) {
        Point point0 = new Point();
        Point point1 = new Point(-3, 4);
        Point point2 = new Point(7, 1);

        System.out.print("Point 0: ");
        point0.displayCoordinate();
        System.out.print("Point 1: ");
        point1.displayCoordinate();
        System.out.print("Point 2: ");
        point2.displayCoordinate();

        Point sum = point1.sum(point2);
        System.out.print("Sum of Point 1 and Point 2: ");
        sum.displayCoordinate();

        Point difference = point1.difference(point2);
        System.out.print("Difference of Point 1 and Point 2: ");
        difference.displayCoordinate();

        double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);

        Point midpoint = point1.midpoint(point2);
        System.out.print("Midpoint of Point 1 and Point 2: ");
        midpoint.displayCoordinate();

        double slope = point1.slope(point2);
        System.out.println("Slope of the line through Point 1 and Point 2: " + slope);    

        double yIntercept = point1.yIntercept(point2);
        System.out.println("y-intercept of the line through Point 1 and Point 2: " + yIntercept); 

        System.out.print("Linear equation of the line through Point 1 and Point 2: ");
        point1.linearEquation(point2);
    }
}