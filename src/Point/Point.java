package Point; // Don't mind this; Just here since all the assignments are in one folder.

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void displayCoordinate() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public Point sum(Point point) {
        return new Point(this.x + point.getX(), this.y + point.getY());
    }

    public Point difference(Point point) {
        return new Point(this.x - point.getX(), this.y - point.getY());
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.difference(this).getX(), 2) + Math.pow(point.difference(this).getY(), 2));
    }

    public Point midpoint(Point point) {
        return new Point((sum(point).getX()) / 2, (sum(point).getY()) / 2);
    }

    public double slope(Point point) {
        return (point.difference(this).getY()) / (point.difference(this).getX());
    }

    public double yIntercept(Point point) {
        return point.getY() - slope(point) * point.getX();
    }

    public void linearEquation(Point point) {
        double slope = slope(point);
        double yInt = yIntercept(point);

        if (Double.isInfinite(slope)) { // handles vertical lines
            System.out.println("x = " + x);
        } else if (slope == 0) { // handles horizontal lines
            System.out.println("y = " + yInt); 
        } else {
            System.out.println("y = " + "x" + ((yInt != 0) ? ((yInt > 0) ? " +" : " ") + yInt : ""));
        } 
    }    
}
