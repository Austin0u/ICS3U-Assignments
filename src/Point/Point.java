package Point; 

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + x);
        System.out.println("The y-coordinate is: " + y);
    }

    public Point sum(Point point) {
        return new Point(this.x + point.getX(), this.y + point.getY());
    }

    public Point difference(Point point) {
        return new Point(this.x - point.getX(), this.y - point.getY());
    }

    public double distance(Point point) {
        Point diff = point.difference(this);
        return Math.sqrt(Math.pow(diff.getX(), 2) + Math.pow(diff.getY(), 2));
    }

    public Point midpoint(Point point) {
        Point sum = sum(point);
        return new Point((sum.getX()) / 2, (sum.getY()) / 2);
    }

    public double slope(Point point) {
        Point diff = point.difference(this);
        return (diff.getY()) / (diff.getX());
    }

    public double yIntercept(Point point) {
        return point.getY() - slope(point) * point.getX();
    }

    public void linearEquation(Point point) {
        double slope = slope(point);
        double yInt = yIntercept(point);

        if (Double.isInfinite(slope)) { // handles vertical lines
            System.out.println("x = " + this.x);
        } else if (slope == 0) { // handles horizontal lines
            System.out.println("y = " + this.y);
        } else {
            System.out.println("y = " + slope + "x" + ((yInt != 0) ? ((yInt > 0) ? " +" : " ") + yInt : ""));
        }
    }
}
