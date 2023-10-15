public class Point {
    /**
     * Attribute of Point class.
     */
    private double pointX;
    private double pointY;

    /**
     * Initialize Point object with 2 parameters.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Get the X of the point.
     */
    public double getPointX() {
        return this.pointX;
    }
    
    /**
     * Set the X of the point.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Get the Y of the point.
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * Set the Y of the point.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate the distance of two points.
     */
    public double distance(Point newPoint) {
        double x = (this.pointX - newPoint.pointX) * (this.pointX - newPoint.pointX);
        double y = (this.pointY - newPoint.pointY) * (this.pointY - newPoint.pointY);
        return Math.sqrt(x + y);
    }

    /**
     * Print the information of the point.
     */
    @Override
    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }

    /**
     * Compare two points.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.pointX, this.pointX) == 0 
               && Double.compare(point.pointY, this.pointY) == 0;
    }

    /**
     * Get the hash code.
     */
    @Override
    public int hashCode() {
        int result = 17;
        int x = (int) (pointX * 1000);
        int y = (int) (pointY * 1000);
        result =  31 * result + 1000 * x + 1000 * y;
        return result;
    }
}
 