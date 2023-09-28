public class StudentManagement {
    /**
     * attribute.
     */
    private int currentLength = 0;
    private Student[] students = new Student[100];

    /**
     * Check whether 2 students are in same group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        String groupS1 = s1.getGroup();
        String groupS2 = s2.getGroup();
        return groupS1.equals(groupS2);
    }

    /**
     * Add new student's information.
     */
    public void addStudent(Student newStudent) {
        students[currentLength] = newStudent;
        currentLength++;
    }

    /**
     * Print students by group.
     */
    public String studentsByGroup() {
        String result = "";
        String group = "-1";
        for (int i = 0; i < currentLength; i++) {
            String groupName = students[i].getGroup();
            if (groupName.equals(group) == false) {
                result = result.concat(students[i].getGroup() + "\n");
                group = groupName;
            }
            result = result.concat(students[i].getInfo() + "\n");
        }
        return result;
    }
    
    /**
     * Delete a student.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < currentLength; i++) {
            String idNumber = students[i].getId();
            if (idNumber.equals(id)) {
                for (int j = i; j < currentLength - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
        currentLength--;
    }
}
