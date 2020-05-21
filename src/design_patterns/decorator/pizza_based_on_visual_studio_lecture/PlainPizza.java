package design_patterns.decorator.pizza_based_on_visual_studio_lecture;

public class PlainPizza extends Pizza {

    public PlainPizza() {
        price = 15.00;
        ingredients.add("plain pizza");
    }

    @Override
    public double getPrice() {
        return super.price;
    }
}
