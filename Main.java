public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "david";
        student.password = "davikwute123";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());

        //Admin
        Admin adminName = new Admin();
        adminName.name = "david";
        adminName.password = "123445";
        Admin results = new Admin();
        results.uploadResults("CMP 202", 100);
        System.out.println(adminName.register());
    }
}