public class Rectangle extends Shape {
    /**
     * Attribute of Rectangle class.
     */
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Initialize Rectangle object without parameters.
     */
    public Rectangle() {
        super();
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
     * Initialize Rectangle object with 5 parameters.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * Get the top-left point of the rectangle.
     */
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * Set the top-left point of the rectangle.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        return "Rectangle[topLeft=" + this.topLeft + ",width=" + this.width 
               + ",length=" + this.length + ",color=" + this.color + ",filled=" 
               + this.filled + "]";
    }

    /**
     * Compare two rectangles.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return this.hashCode() == rectangle.hashCode();
    }

    /**
     * Get the hash code.
     */
    @Override
    public int hashCode() {
        int result = 17;
        int l = (int) (1000 * this.length);
        int w = (int) (1000 * this.width);
        result = 31 * result + this.topLeft.hashCode();
        result = 31 * result + w;
        result = 31 * result + l;
        return result;
    }
}

 