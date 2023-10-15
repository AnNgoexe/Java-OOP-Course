public class Car extends Vehicle {
    /**
     * Attribute of Car class.
     */
    private int numberOfDoors;

    /**
     * Initialize Car object with 5 parameters.
     */
    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Get the information of the car.
     */
    public String getInfo() {
        String information = "";
        information = information.concat("Car:" + "\n");
        information = information.concat("\t" + "Brand: " + this.brand + "\n");
        information = information.concat("\t" + "Model: " + this.model + "\n");
        information = information.concat("\t" + "Registration Number: " + this.registrationNumber + "\n");
        information = information.concat("\t" + "Number of Doors: " + this.numberOfDoors + "\n");
        information = information.concat("\t" + "Belongs to " + this.owner.toString() + "\n");
        return information;
    }

    /**
     * Get the number of doors of the car.
     */
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    /**
     * Set the number of doors of the car.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
 