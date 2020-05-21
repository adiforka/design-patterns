package design_patterns.decorator.pizza_based_on_visual_studio_lecture;

public class Mushrooms extends Pizza {

    private final Pizza decoratedPizza;

    public Mushrooms(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
        price += 4.00;
        ingredients.addAll(decoratedPizza.ingredients);
        ingredients.add("mushrooms");
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + price;
    }
}
