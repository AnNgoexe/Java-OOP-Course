public class Square extends Rectangle {
    /**
     * Initialize Square object without parameters.
     */
    public Square() {
        
    }

    /**
     * Initialize Square object with 1 parameter.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Initialize Square object with 3 parameters.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Initialize Square object with 4 parameters.
     */
    public Square(Point topleft, double side, String color, boolean filled) {
        super(topleft, side, side, color, filled);
    }

    /**
     * Get the side of the square.
     */
    public double getSide() {
        return this.width;
    }

    /**
     * Set the side of the square.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Set the width of the square.
     */
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    /**
     * Set the length of the square.
     */
    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    /**
     * Get the information of the square.
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + this.topLeft + ",side=" 
               + this.width + ",color=" + this.color + ",filled=" 
               + this.filled + "]";
    }

    /**
     * Compare two squares.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Square)) {
            return false;
        }
        Square square = (Square) obj;
        return this.hashCode() == square.hashCode();
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
  
 