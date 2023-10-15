public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student s1 = new Student("Nguyen Van A", "001", "uet@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "002", "uet@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "003", "uet@vnu.edu.vn");

        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);

        System.out.println(sm.studentsByGroup());

        sm.removeStudent("002");
        System.out.println(sm.studentsByGroup());
    }
}
