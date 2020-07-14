package design_patterns.decorator.demo6_coffee_headfirst;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;
    protected double cost;

    public CondimentDecorator(String description) {
        super(description);
    }

}