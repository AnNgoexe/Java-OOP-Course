

public class Student {
    /**
     * attribute. 
     */
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Initialize class student by default.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Initialize class student.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }
    
    /**
     * Initialize class student by copying.
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    /**
     * get the information of the student.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * set new name for the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set new id for the student.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * set new group for the student.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * set new email for the student.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get the student's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * get the student's id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * get the student's group.
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * get the student's email.
     */
    public String getEmail() {
        return this.email;
    }
}