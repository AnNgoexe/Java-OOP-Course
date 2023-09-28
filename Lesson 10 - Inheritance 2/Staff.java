public class Staff extends Person {
    /**
     * Attribute of Staff class.
     */
    private String school;
    private double pay;

    /**
     * Initialize Staff object with 4 parameters.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Get the school of the staff.
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * Set the school of the staff.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Get the pay of the staff.
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * Set the pay of the staff.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Get the information of the staff.
     */
    @Override
    public String toString() {
        String information = "Staff[" + super.toString() + ",school=" + this.school;
        information = information.concat(",pay=" + this.pay + "]");
        return information;
    }
}
