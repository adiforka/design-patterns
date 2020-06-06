package design_patterns.decorator.demo7_pizza_banas;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato sauce";
    }
Espresso
    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.50;
    }
}
