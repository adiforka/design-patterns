package design_patterns.builder.demo1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/*Builder pattern builds a complex object using simple objects and a step by step approach. */
public class FastFoodBuilderTest {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.buildVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Meal Cost: " + vegMeal.getCost());

        System.out.println();

        Meal fleshMeal = mealBuilder.buildFleshMeal();
        System.out.println("Flesh Meal");
        fleshMeal.showItems();
        System.out.println("Meal Cost: " + fleshMeal.getCost());

        System.out.println();

        Meal vegMeal2 = mealBuilder.buildVegMeal();
        System.out.println("This be a flesh meal: ");
        vegMeal2.showItems();
        System.out.println("Meal Costs: " + vegMeal2.getCost());

        System.out.println();

        Meal fleshMeal2 =  mealBuilder.buildFleshMeal();
        System.out.println("FleshMeal: ");
        fleshMeal2.showItems();
        System.out.println("Cost: " + fleshMeal2.getCost());
    }
}

interface Item {

    String getName();
    Packing getPacking();
    BigDecimal getPrice();
}

interface Packing {
    String getPackingType();
}

class Wrapper implements Packing {

    @Override
    public String getPackingType() {
        return "Wrapper";
    }
}

class Bottle implements Packing {

    @Override
    public String getPackingType() {
        return "Bottle";
    }
}

abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal getPrice();

}

abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal getPrice();
}

class VegBurger extends Burger {


    public String getName() {
        return "Veg Burger";
    }

    public BigDecimal getPrice() {
        return new BigDecimal("5.99")
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class ChickenBurger extends Burger {


    public String getName() {
        return "Chicken Burger";
    }

    public BigDecimal getPrice() {
        return new BigDecimal("5.99")
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class Coke extends ColdDrink {

    @Override
    public String getName() {
        return "Coke";
    }

    public BigDecimal getPrice() {
        return new BigDecimal("1.99")
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class Pepsi extends ColdDrink {

    public String getName() {
        return "Pepsi";
    }

    public BigDecimal getPrice() {
        return new BigDecimal("1.99")
                .setScale(2, RoundingMode.HALF_UP);
    }
}

//class meal groups the objects defined above in a list property
class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        BigDecimal cost = new BigDecimal(0);

        for (Item item : items) {
            cost = cost.add(item.getPrice());
        }
        return cost.setScale(2, RoundingMode.HALF_UP);
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.getName());
            System.out.print(", Packing: " + item.getPacking().getPackingType());
            System.out.println(", Price: " + item.getPrice());
        }
    }
}

//class responsible for actually creating meals out of items
class MealBuilder {

    //has different methods for combining items into different configurations
    public Meal buildVegMeal() {
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal buildFleshMeal() {
        Meal fleshMeal = new Meal();
        fleshMeal.addItem(new ChickenBurger());
        fleshMeal.addItem(new Pepsi());
        return fleshMeal;
    }

}
