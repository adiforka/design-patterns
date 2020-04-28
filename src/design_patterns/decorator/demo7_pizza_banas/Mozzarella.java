package design_patterns.decorator.demo7_pizza_banas;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella" ;
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 2.00;
    }
}

