public abstract class Shape {
    /**
     * Attribute of Shape class.
     */
    protected String color;
    protected boolean filled;

    /**
     * Initialize Shape object without parameters.
     */
    public Shape() {
        
    }

    /**
     * Initialize Shape object with 2 parameters.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Get the color of the shape.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color of the shape.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the filled status of the shape.
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * Set the filled status of the shape.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get the area of the shape.
     */
    public abstract double getArea();

    /**
     * Get the perimeter of the shape.
     */
    public abstract double getPerimeter();

    /**
     * Get the information of the shape.
     */
    @Override
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
 