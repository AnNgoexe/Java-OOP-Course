public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nguyen Van A", "Ha Noi");

        Car car1 = new Car("Toyota", "Camry", "30E-123.45", person1, 4);
        person1.addVehicle(car1);

        MotorBike motorBike1 = new MotorBike("Honda", "Air Blade", "29F-678.90", person1, false);
        person1.addVehicle(motorBike1);

        System.out.println(person1.getVehiclesInfo());

        Person person2 = new Person("Tran Thi B", "Da Nang");
        car1.transferOwnership(person2);

        System.out.println(person1.getVehiclesInfo());
        System.out.println(person2.getVehiclesInfo());

        Vehicle vehicle1 = car1;
        Vehicle vehicle2 = motorBike1;

        System.out.println("Vehicle 1 is a Car: " + (vehicle1 instanceof Car));
        System.out.println("Vehicle 2 is a MotorBike: " + (vehicle2 instanceof MotorBike));
        System.out.println("Vehicle 1 Info: " + vehicle1.getInfo());
        System.out.println("Vehicle 2 Info: " + vehicle2.getInfo());
    }
}