package design_patterns.decorator.pizza_based_on_visual_studio_lecture;

public class DecoDemo {
    public static void main(String[] args) {

        //pizza with onion, mushrooms, olives
        Pizza pizza = new Onion(new Mushrooms(new Olives(new PlainPizza())));

        System.out.println(pizza.getPrice());
        System.out.println(pizza.getIngredients());

        //pizza with onions only
        Pizza onionPizza = new Onion(new PlainPizza());
        System.out.println(onionPizza.getPrice());
        System.out.println(onionPizza.getIngredients());
    }
}
