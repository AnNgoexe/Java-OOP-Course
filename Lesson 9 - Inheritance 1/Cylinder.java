public class Cylinder extends Circle {
    /**
     * Attribute of Cylinder class.
     */
    private double height;
    
    /**
     * Initialize Cylinder object without parameters.
     */
    public Cylinder() {
        this.height = 1;
    }

    /**
     * Initialize Circle object without 1 parameter.
     */
    public Cylinder(double radius) {
        super(radius);
        this.height = 1;
    }

    /**
     * Initialize Circle object without 2 parameter.
     */
    public Cylinder(double radius, double height) {
        super(radius, "red");
        this.height = height;
    }

    /**
     * Initialize Circle object without 3 parameters.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Get the height of the cylinder.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Set the height of the cylinder.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get the volume of the cylinder.
     */
    public double getVolume() {
        return super.getArea() * this.height;
    }

    /**
     * Get the information of the circle.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }

    /**
     * Get the area of the cylinder.
     */
    public double getArea() {
        return 2 * super.getArea() + 2 * PI * super.getRadius() * this.height;
    }

}