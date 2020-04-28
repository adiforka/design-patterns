package design_patterns.builder.demo8_pizza_example;

//really not sure about this at all... another different take on builder
public class PizzaCase {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();

        System.out.println(pizza.toString());
    }
}

//product
class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}

//abstract builder
abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}

class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("thick");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham + pineapple");
    }
}

class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("pepper-infused");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("spicy pepper");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }
}

//director
class Waiter {

    private PizzaBuilder pizzaBuilder;

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
