public class Main {
    public static void main(String[] args) {
        Layer layer = new Layer();

        Circle circle1 = new Circle(new Point(0, 0), 5, "red", true);
        Circle circle2 = new Circle(new Point(1, 1), 3, "blue", false);
        Rectangle rectangle = new Rectangle(new Point(0, 0), 4, 5, "green", true);
        Square square = new Square(new Point(2, 2), 6, "yellow", false);

        layer.addShape(circle1);
        layer.addShape(circle2);
        layer.addShape(rectangle);
        layer.addShape(square);

        System.out.println(layer.getInfo());

        layer.removeDuplicates();

        System.out.println(layer.getInfo());

        layer.removeCircles();

        System.out.println(layer.getInfo());
    }
}
