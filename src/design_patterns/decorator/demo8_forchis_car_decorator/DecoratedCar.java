package design_patterns.decorator.demo8_forchis_car_decorator;

public abstract class DecoratedCar {

    protected String name;
    protected double price;

    public DecoratedCar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
