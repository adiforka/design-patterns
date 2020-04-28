package design_patterns.decorator.demo7_pizza_banas;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain crust";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
