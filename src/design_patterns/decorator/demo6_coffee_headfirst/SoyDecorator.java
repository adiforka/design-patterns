package design_patterns.decorator.demo6_coffee_headfirst;


public class SoyDecorator extends CondimentDecorator {

    public SoyDecorator(Beverage beverage, String description, double cost) {
        super(description);
        this.beverage = beverage;
        this.cost = cost;
    }

    //potentially dangerous: mixing concerns of getting own price and getting another object's price
    //would be more useful if the implementation of this method were different among different decorators
    //(i.e., more behavioral variation)
    public double getCost() {
        return cost + beverage.getCost();
    }
}