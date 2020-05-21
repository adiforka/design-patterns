package design_patterns.decorator.pizza_based_on_visual_studio_lecture;

public class Olives extends Pizza {

    private final Pizza decoratedPizza;

    public Olives(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
        price = 2.50;
        ingredients.addAll(decoratedPizza.ingredients);
        ingredients.add("olives");
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + price;
    }

}
