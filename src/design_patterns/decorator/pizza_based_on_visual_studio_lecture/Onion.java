package design_patterns.decorator.pizza_based_on_visual_studio_lecture;

public class Onion extends Pizza {

    private final Pizza decoratedPizza;

    public Onion(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
        price = 1.50;
        ingredients.addAll(decoratedPizza.ingredients);
        ingredients.add("onion");
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + price;
    }
}
