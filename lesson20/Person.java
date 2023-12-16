public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    /**
     * Initialize Person object without parameters.
     */
    Person() {

    }

    /**
     * Initialize Person object with three parameters.
     */
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Get the name of Person class.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name of Person class.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the age of Person class.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Get the age of Person class.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the address of Person class.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address of Person class.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Compare two people(name and age).
     */
    public int compareTo(Person p) {
        int nameComparison = this.name.compareTo(p.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.age, p.age);
        }
    }
}
