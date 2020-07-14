package design_patterns.decorator.demo8_forchis_car_decorator;

public class Car extends DecoratedCar {

    public Car(String model, double price) {
        super(model, price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
