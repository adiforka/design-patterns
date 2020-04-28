package design_patterns.mvc.demo2;

public class CarMVCDemo {
    public static void main(String[] args) {

        CarModel carModel = retrieveCarModelFromDatabase();
        CarView carView = new CarView();

        CarController carController = new CarController(carModel, carView);
        carController.updateView();

        carController.setMake("Toyota");
        carController.setModel("Corolla");
        carController.setEngineCapacity("2.3 liters");

        carController.updateView();

    }

    static CarModel retrieveCarModelFromDatabase() {
         CarModel carModel =  new CarModel();
         carModel.setMake("Honda");
         carModel.setModel("Civic");
         carModel.setEngineCapacity("2.0 liters");
         return carModel;
    }
}

class CarModel {
    private String make;
    private String model;
    private String engineCapacity;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

class CarView {
    public void printCarDetails(String carMake, String carModel, String engineCapacity) {
        System.out.println("Car make: " + carMake + ", model: " + carModel + ", engine capacity: " + engineCapacity);
    }
}

class CarController {

    private CarModel carModel;
    private CarView carView;

    public CarController(CarModel carModel, CarView carView) {
        this.carModel = carModel;
        this.carView = carView;
    }

    public String getMake() {
        return carModel.getMake();
    }

    public void setMake(String make) {
        carModel.setMake(make);
    }

    public String getModel() {
        return carModel.getModel();
    }

    public void setModel(String model) {
        carModel.setModel(model);
    }

    public String getEngineCapacity () {
        return carModel.getEngineCapacity();
    }

    public void setEngineCapacity(String engineCapacity) {
        carModel.setEngineCapacity(engineCapacity);
    }

    public void updateView() {
        carView.printCarDetails(carModel.getMake(), carModel.getModel(), carModel.getEngineCapacity());
    }



}
