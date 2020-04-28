package design_patterns.decorator.demo6_coffee_headfirst;


public class Decaf extends Beverage {

    private final double cost;

    public Decaf(String description, double cost) {
        super(description);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}