package design_patterns.mvc.demo1;

public class StudentMVCDemo {
    public static void main(String[] args) {

        Model model = retrieveStudentDetailsFromDatabase();

        View view = new View();

        StudentController studentController = new StudentController(model, view);

        studentController.updateView();

        studentController.setStudentName("Johnny Brown");

        studentController.updateView();

    }

    private static Model retrieveStudentDetailsFromDatabase() {
        Model model = new Model();
        model.setName("Charlie Brown");
        model.setEnrollmentNumber("234");
        return model;
    }
}

class Model {

    private String enrollmentNumber;
    private String name;

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class View {
    public void printStudentDetails(String studentEnrollmentNumber, String studentName) {
            System.out.println("Student name: " + studentName);
            System.out.println("Student roll. no. " + studentEnrollmentNumber);
    }

}

class StudentController {
    private Model model;
    private View view;

    public StudentController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getEnrollmentNumber() {
        return model.getEnrollmentNumber();
    }

    public void setEnrollmentNumber(String enrolementNumber) {
        model.setEnrollmentNumber(enrolementNumber);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getEnrollmentNumber());
    }
}

