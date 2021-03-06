package design_patterns.decorator.demo7_pizza_banas;

public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Olives" ;
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.00;
    }
}
