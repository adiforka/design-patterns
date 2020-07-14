package design_patterns.decorator.demo8_forchis_car_decorator;

public class BlueLights extends CarDecorator {
    public BlueLights(DecoratedCar decoratedCar, String decoratorName, double price) {
        super(decoratedCar, decoratorName, price);
    }
}
