public class Rectangle extends Shape {
    /**
     * Attribute of Rectangle class.
     */
    protected double width;
    protected double length;

    /**
     * Initialize Rectangle object without parameters.
     */
    public Rectangle() {
        
    }

    /**
     * Initialize Rectangle object with 2 parameters.
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Initialize Rectangle object with 4 parameters.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Get the width of the rectangle.
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Set the width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Get the length of the rectangle.
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Set the length of the rectangle.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get the area of the rectangle.
     */
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Get the perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return 2.0 * (this.width + this.length);
    }

    /**
     * Get the information of the rectangle.
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length + ",color=" 
               + this.color + ",filled=" + this.filled + "]";
    }
}
 