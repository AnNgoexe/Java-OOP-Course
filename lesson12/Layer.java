import java.util.ArrayList;
import java.util.List;

public class Layer {
    /**
     * Attributes of Layer class.
     */
    private List<Shape> shapes;

    /**
     * Initialize Layer object without parameters.
     */
    public Layer() {
        shapes = new ArrayList<Shape>();
    }

    /**
     * Add a shape to the list.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Print the information of the layer.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString());
            info.append("\n");
        }
        return info.toString();
    }

    /**
     * Remove duplicate shapes.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size();) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                } else {
                    j++;
                }
            }
        }
    }

    /**
     * Remove circles.
     */
    public void removeCircles() {
        this.shapes.removeIf(shape -> shape instanceof Circle);
    }
}
 