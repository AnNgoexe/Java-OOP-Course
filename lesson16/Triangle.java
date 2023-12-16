public class Triangle implements GeometricObject {
    /**
     * Attribute of Triangle class.
     */
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Initialize Triangle object with 3 parameters
     */
    public Triangle(Point p1, Point p2, Point p3) {
        double vector13x = p3.getPointX() - p1.getPointX();
        double vector12x = p2.getPointX() - p1.getPointX();
        double vector13y = p3.getPointY() - p1.getPointY();
        double vector12y = p2.getPointY() - p1.getPointY();
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new RuntimeException();
        } else if (vector13x * vector12y == vector13y * vector12x) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    /**
     * Get the first point of the triangle.
     */
    public Point getP1() {
        return this.p1;
    }

    /**
     * Get the second point of the triangle.
     */
    public Point getP2() {
        return this.p2;
    }

    /**
     * Get the third point of the triangle.
     */
    public Point getP3() {
        return this.p3;
    }

    /**
     * Get the area of the triangle.
     */
    @Override
    public double getArea() {
        double f1 = this.p1.getPointX() * (this.p2.getPointY() - this.p3.getPointY());
        double f2 = this.p2.getPointX() * (this.p3.getPointY() - this.p1.getPointY());
        double f3 = this.p3.getPointX() * (this.p1.getPointY() - this.p2.getPointY());
        if (f1 + f2 + f3 < 0) {
            return -(f1 + f2 + f3) / 2;
        } else {
            return (f1 + f2 + f3) / 2;
        }
    }

    /**
     * Get the perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        double edge12 = this.p1.distance(this.p2);
        double edge23 = this.p2.distance(this.p3);
        double edge31 = this.p3.distance(this.p1);
        return edge12 + edge23 + edge31;
    }

    /**
     * Get the information of the triangle.
     */
    @Override
    public String getInfo() {
        String s = "";
        s = s.concat("Triangle[" + this.p1.toString() + ",");
        s = s.concat(this.p2.toString() + ",");
        s = s.concat(this.p3.toString() + "]");
        return s;
    }
}
 