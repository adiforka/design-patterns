package design_patterns.mvc.demo4;

import java.util.Objects;

public class PencilMVCTest {
    public static void main(String[] args) {

        Model pencilModel = retrieveModelFromDatabase();
        View pencilView = new View();
        Controller pencilController = new Controller(pencilModel, pencilView);

        pencilController.updateView();

        pencilController.setTypeCon("Enthusiast");
        pencilController.setHardnessCon("1H");

        pencilController.updateView();

    }

    private static Model retrieveModelFromDatabase() {
        Model model = new Model();
        model.setType("Professional");
        model.setHardness("2B");
        return model;
    }
}

class Model {

    private String type;
    private String hardness;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(type, model.type) &&
                Objects.equals(hardness, model.hardness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, hardness);
    }
}

class View {
    public void printPencilDetails(Model pencil) {
        System.out.println("Pencil type=" + pencil.getType()
                + ", hardness=" + pencil.getHardness());
    }
}

class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //wrapper methods, look like
    public String getTypeCon() {
        return model.getType();
    }

    public void setTypeCon(String type) {
        model.setType(type);
    }

    public String getHardnessCon() {
        return model.getHardness();
    }

    public void setHardnessCon(String hardness) {
        model.setHardness(hardness);
    }

    public void updateView() {
        view.printPencilDetails(model);
    }
}


