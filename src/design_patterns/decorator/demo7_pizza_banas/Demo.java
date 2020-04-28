package design_patterns.decorator.demo7_pizza_banas;

public class Demo {
    public static void main(String[] args) {

        Pizza pizza = new Mushrooms(new Olives(new TomatoSauce(new Mozzarella(new PlainPizza()))));

        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
