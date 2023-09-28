public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        System.out.println(circle.toString());
        System.out.println("Bán kính hình tròn: " + circle.getRadius());
        System.out.println("Màu sắc hình tròn: " + circle.getColor());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        
        Cylinder cylinder = new Cylinder(5, 10, "green");
        System.out.println(cylinder.toString());
        System.out.println("Bán kính hình trụ: " + cylinder.getRadius());
        System.out.println("Chiều cao hình trụ: " + cylinder.getHeight());
        System.out.println("Màu sắc hình trụ: " + cylinder.getColor());
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());
        System.out.println("Diện tích hình trụ: " + cylinder.getArea());
    }
}