import java.util.List;

public class ShapeUtil {
    /**
     * Print all information.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String s = new String();
        s = s.concat("Circle:\n");
        for (GeometricObject i : shapes) {
            if (i instanceof Circle) {
                Circle c = (Circle) i;
                s = s.concat(c.getInfo() + "\n");
            }
        }
        s = s.concat("Triangle:\n");
        for (GeometricObject i : shapes) {
            if (i instanceof Triangle) {
                Triangle t = (Triangle) i;
                s = s.concat(t.getInfo() + "\n");
            }
        }
        return s;
    }
}
 