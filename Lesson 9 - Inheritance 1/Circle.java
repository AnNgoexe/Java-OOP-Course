public class Circle {
    /**
     * Attribute of Circle class.
     */
    private double radius;
    private String color;
    protected static final double PI = Math.PI; 
    
    /**
     * Initialize Circle object without parameters.
     */
    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    /**
     * Initialize Circle object with 1 parameter.
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Initialize Circle object with 2 parameters.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
     * Get the color of the circle.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color of the circle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the area of the circle.
     */
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }
    
    /**
     * Get the information of the circle.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}