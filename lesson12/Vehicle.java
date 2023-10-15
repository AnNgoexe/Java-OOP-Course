public abstract class Vehicle {
    /**
     * Attribute of Vehicle class.
     */
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Initialize Circle object with 4 parameters.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }
    
    /**
     * Get the information of the vehicle.
     */
    public abstract String getInfo();

    /**
     * Transfer the ownership of the vehicle.
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Get the brand of the vehicle.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Set the brand of the vehicle.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get the model of the vehicle.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model of the vehicle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the registration number of the vehicle.
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /**
     * Set the registration number of the vehicle.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Get the owner of the vehicle.
     */
    public Person getOwner() {
        return this.owner;
    }

    /**
     * Set the owner of the vehicle.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
} 