package design_patterns.decorator.demo8_forchis_car_decorator;

public class PimpinRims extends CarDecorator {

    public PimpinRims(DecoratedCar decoratedCar, String decoratorName, double price) {
        super(decoratedCar, decoratorName, price);
    }
}
