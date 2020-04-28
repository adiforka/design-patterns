package design_patterns.mvc.demo5;

public class MVCDesignPatternTest5Fridges {
    public static void main(String[] args) {

        //controller takes a model from the data layer
        FridgeModel fridgeModel = retrieveModelFromDataBase();

        //a view template is created
        View fridgeView = new View();

        //controller is passed model and view
        Controller fridgeController = new Controller(fridgeModel, fridgeView);

        //controller uses the passed model data to update the view
        fridgeController.updateView(fridgeModel.getBrand(), fridgeModel.getSize());

        System.out.println("Updating model, updating view");

        //controller sets new values for brand and size, and updates the view
        fridgeController.setBrand("Siemens");
        fridgeController.setSize(Size.MEDIUM);
        fridgeController.updateView(fridgeModel.getBrand(), fridgeModel.getSize());
    }

    static FridgeModel retrieveModelFromDataBase() {
        return new FridgeModel("Braun", Size.LARGE);
    }
}

enum Size {



    SMALL(1), MEDIUM(2), LARGE(3);

    int sizeID;

    Size(int sizeID) {
        this.sizeID = sizeID;
    }

    int getSizeID() {
        return sizeID;
    }
}

class FridgeModel {

    private String brand;
    private Size size;

    public FridgeModel(String brand, Size size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}

class View {

    public void display(String brand, Size size) {
        System.out.println("Fridge: " + brand + ", " + size);
    }

}

class Controller {

    private FridgeModel fridgeModel;
    private View view;

    public Controller(FridgeModel fridgeModel, View view) {
        this.fridgeModel = fridgeModel;
        this.view = view;
    }

    public String getBrand() {
        return fridgeModel.getBrand();
    }

    public void setBrand(String brand) {
        fridgeModel.setBrand(brand);
    }

    public Size getSize() {
        return fridgeModel.getSize();
    }

    public void setSize(Size size) {
        fridgeModel.setSize(size);
    }

    public void updateView(String brand, Size size) {
        view.display(brand, size);
    }
}
