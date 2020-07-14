package design_patterns.decorator.demo7_pizza_banas;

//crucially, the decorator type not only is composed with the decorated type, but also implements its interface
public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

}
