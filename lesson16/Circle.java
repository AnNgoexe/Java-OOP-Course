public class Circle implements GeometricObject {
    /**
     * Attribute of Circle class.
     */
    private double radius;
    private Point center;
    public static final double PI = 3.14;

    /**
     * Initialize Circle object with 2 parameters.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get the center point of the circle.
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Set the center point of the circle.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Get the radius of the circle.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Set the radius of the circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get the area of the circle.
     */
    @Override
    public double getArea() {
        return PI * radius * this.radius;
    }

    /**
     * Get the perimeter of the circle.
     */
    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    /**
     * Get the information of the circle.
     */
    @Override
    public String getInfo() {
        String s = "";
        s = s.concat("Circle[" + this.center.toString() + ",r=");
        s = s.concat(String.format("%.2f", this.radius) + "]");
        return s;
    }
}
 