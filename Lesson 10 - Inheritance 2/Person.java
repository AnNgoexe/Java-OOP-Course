public class Person {
    /**
     * Attribute of Person class.
     */
    private String name;
    private String address;

    /**
     * Initialize Person object with 2 parameters.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Get the name of the person.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address of the person.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address of the person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the information of the person.
     */
    @Override
    public String toString() {
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
}