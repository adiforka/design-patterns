package design_patterns.mvc.demo3;

public class MVCPatternStudentDemo2 {
    public static void main(String[] args) {

        Model model = retrieveStudentDetailsFromDatabase();

        Controller controller = new Controller(model, new View());
        controller.updateView();

        controller.setName("Jessica Jones");
        controller.setAverage(89.2);

        controller.updateView();
    }

    private static Model retrieveStudentDetailsFromDatabase() {
        Model model = new Model();
        model.setName("Jessica Alba");
        model.setGradeAvg(67.8);
        return model;
    }
}

class Model {

    String name;
    Double gradeAvg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGradeAvg() {
        return gradeAvg;
    }

    public void setGradeAvg(Double gradeAvg) {
        this.gradeAvg = gradeAvg;
    }
}
class View {

    public void printStudentDetails(String name, Double gradeAverage) {
        System.out.println("Student name=" + name + ", grade average=" + gradeAverage);
    }
}

class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public Double getAverage() {
        return model.getGradeAvg();
    }

    public void setAverage(Double avg) {
        model.setGradeAvg(avg);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getGradeAvg());
    }
}