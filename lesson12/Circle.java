public class Circle extends Shape {
    /**
     * Attribute of Circle class.
     */
    protected double radius;
    protected Point center;

    /**
     * Initialize Circle object without parameters.
     */
    public Circle() {
        super();
    }

    /**
     * Initialize Circle object with 1 parameter.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Initialize Circle object with 3 parameters.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Initialize Circle object with 3 parameters.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * Get the color of the circle.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Get the radius of the circle.
     */
    public void setRadius(double radius) {
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
     * Get the area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Get the perimeter of the circle.
     */
    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    /**
     * Get the information of the circle.
     */
    @Override
    public String toString() {
        return "Circle[center=" + this.center + ",radius=" + this.radius + ",color=" 
               + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * Compare two circles.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return this.hashCode() == circle.hashCode();
    }

    /**
     * Get the hash code.
     */
    @Override
    public int hashCode() {
        int result = 17;
        int r = (int) (1000 * this.radius);
        result = 31 * result + this.center.hashCode();
        result = 31 * result + r;
        return result;
    }
}   