import java.util.ArrayList;
import java.util.List;

public class Person {
    /**
     * Attribute of Person class.
     */
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Initialize Motorbike object with 2 parameters.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<Vehicle>();
    }

    /**
     * Add a new vehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    /**
     * Remove vehicles according to their registration number.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < this.vehicleList.size(); i++) {
            String num = this.vehicleList.get(i).getRegistrationNumber();
            if (num.equals(registrationNumber)) {
                this.vehicleList.remove(i);
            }
        }
    }

    /**
     * Get the information of all vehicles.
     */
    public String getVehiclesInfo() {
        String information = "";
        if (this.vehicleList.isEmpty()) {
            information = information.concat(this.name + " has no vehicle!");
            return information;
        }
        information = information.concat(this.name + " has:" + "\n");
        information = information.concat("\n");
        for (Vehicle vehicle : this.vehicleList) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                information = information.concat(car.getInfo());
            } else {
                MotorBike motorbike = (MotorBike) vehicle;
                information = information.concat(motorbike.getInfo());
            }
        }
        return information;
    }


    /**
     * Get the name of the owner.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the address of the user.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address of the user.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the information of the user.
     */
    @Override
    public String toString() {
        String information = "";
        information = information.concat(this.name + " - " + this.address);
        return information;
    }
}
 