public class MotorBike extends Vehicle {
    /**
     * Attribute of MotorBike class.
     */
    private boolean hasSidecar;

    /**
     * Initialize Motorbike object with 5 parameters.
     */
    public MotorBike(String brand, String model, String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get the information of the motorbike.
     */
    public String getInfo() {
        String information = "";
        information = information.concat("Motor Bike:" + "\n");
        information = information.concat("\t" + "Brand: " + this.brand + "\n");
        information = information.concat("\t" + "Model: " + this.model + "\n");
        information = information.concat("\t" + "Registration Number: " + this.registrationNumber + "\n");
        information = information.concat("\t" + "Has Side Car: " + this.hasSidecar + "\n");
        information = information.concat("\t" + "Belongs to " + this.owner.toString() + "\n");
        return information;
    }

    /**
     * Check whether motorbike has sidecar.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Set the status of having sidecar.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
 