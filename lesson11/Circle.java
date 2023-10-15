public class Circle extends Shape {
    /**
     * Attribute of Circle class.
     */
    protected double radius;

    /**
     * Initialize Circle object without parameters.
     */
    public Circle() {
        
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
        return "Circle[radius=" + this.radius + ",color=" 
               + this.color + ",filled=" + this.filled + "]";
    }
} 