public class Student extends Person {
    /**
     * Attribute of Student class.
     */
    private String program;
    private int year;
    private double fee;

    /**
     * Initialize Student object with 5 parameters.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Get the program of the student.
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * Set the program of the student.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Get the year of the student.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Set the year of the student.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get the fee of the student.
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * Set the fee of the student.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Get the information of the student.
     */
    @Override
    public String toString() {
        String information = "Student[" + super.toString() + ",program=" + this.program;
        information = information.concat(",year=" + this.year + ",fee=" + this.fee + "]");
        return information;
    }
}
