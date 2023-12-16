import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {    
        List<GeometricObject> shapes = new ArrayList<>();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(0, 1);
        Point center = new Point(0, 0);

        Circle c = new Circle(center, 1);
        shapes.add(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Triangle t = new Triangle(p1, p2, p3);
        shapes.add(t);
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());

        ShapeUtil util = new ShapeUtil();
        System.out.println(util.printInfo(shapes));
    }
}
