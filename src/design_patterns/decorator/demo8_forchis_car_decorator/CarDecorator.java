package design_patterns.decorator.demo8_forchis_car_decorator;

public abstract class CarDecorator extends DecoratedCar {

    protected DecoratedCar decoratedCar;
    //have to have these here if I want to be able to keep access to partial names and prices in the final decorated object
    protected String decoratorName;
    protected double price;

    public CarDecorator(DecoratedCar decoratedCar, String decoratorName, double price) {
        super(decoratedCar.getName() + ", " +
                decoratorName, PriceCalc.getTwoDecPlaces(price + decoratedCar.getPrice()));
        this.decoratedCar = decoratedCar;
        this.decoratorName = decoratorName;
        this.price = price;
    }
}
