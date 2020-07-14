package design_patterns.decorator.demo8_forchis_car_decorator;

public class PlushSeats extends CarDecorator {

    public PlushSeats(DecoratedCar decoratedCar, String decoratorName, double price) {
        super(decoratedCar, decoratorName, price);
    }

}
