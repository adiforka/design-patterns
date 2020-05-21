package design_patterns.decorator.pizza_based_on_visual_studio_lecture;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected double price;
    protected List<String> ingredients = new ArrayList<>();

    public abstract double getPrice();

    public List<String> getIngredients() {
        return ingredients;
    }
}
