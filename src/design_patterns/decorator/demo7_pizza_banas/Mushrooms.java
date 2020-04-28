package design_patterns.decorator.demo7_pizza_banas;

public class Mushrooms extends ToppingDecorator {

    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.00;
    }
}
