public class Main {
    public static void main(String[] args) {
        
        Person person = new Person("Nguyen Van A", "Ha Noi");
        System.out.println(person.toString());
        System.out.println("Tên: " + person.getName());
        System.out.println("Địa chỉ: " + person.getAddress());

       
        Staff staff = new Staff("Le Van B", "Hai Phong", "PTIT", 20000);
        System.out.println(staff.toString());
        System.out.println("Tên: " + staff.getName());
        System.out.println("Địa chỉ: " + staff.getAddress());
        System.out.println("Trường: " + staff.getSchool());
        System.out.println("Lương: " + staff.getPay());

        
        Student student = new Student("Tran Van C", "Da Nang", "CNTT", 2023, 12000.0);
        System.out.println(student.toString());
        System.out.println("Tên: " + student.getName());
        System.out.println("Địa chỉ: " + student.getAddress());
        System.out.println("Chương trình: " + student.getProgram());
        System.out.println("Năm: " + student.getYear());
        System.out.println("Học phí: " + student.getFee());
    }
}
