package design_patterns.decorator.demo6_coffee_headfirst;


public abstract class Beverage {

    protected String description;

    public Beverage(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }

    abstract double getCost();
}
