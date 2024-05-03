public class Student extends User {
    String  name = "david";
    String admission_no = "1789237958103";
    String registerCourse() {
        if (name.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (name.equals("") || admission_no.equals("")) {
            return "enter valid credentials";
        } else {
            return "welcome";
        }
    }    
}