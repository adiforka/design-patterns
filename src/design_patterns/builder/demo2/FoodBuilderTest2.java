package design_patterns.builder.demo2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class FoodBuilderTest2 {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegCoffeeMeal = mealBuilder.buildVegCoffeeMeal();
        vegCoffeeMeal.viewItems();
        System.out.println("Meal total: " + vegCoffeeMeal.calculatePrice());

        System.out.println();

        Meal vegCokeMeal = mealBuilder.buildVegCokeMeal();
        vegCokeMeal.viewItems();
        System.out.println("Meal total: " + vegCokeMeal.calculatePrice());

        System.out.println();

        Meal meatCoffeeMeal = mealBuilder.buildMeatCoffeeMeal();
        meatCoffeeMeal.viewItems();
        System.out.println("Meal total " + meatCoffeeMeal.calculatePrice());
    }
}

interface Item {
    String getName();
    BigDecimal getPrice();
}

abstract class Burger implements Item {
}

class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1.99)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class VeggieBurger extends Burger {
    @Override
    public String getName() {
        return "Veggie Burger";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1.99)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

abstract class Drink implements Item {
}

class Coke extends Drink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1.39)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class Coffee extends Drink {
    @Override
    public String getName() {
        return "Coffee";
    }

    public BigDecimal getPrice() {
        return new BigDecimal(1.69)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public BigDecimal calculatePrice() {
        BigDecimal total = new BigDecimal(0);
        for (Item item : items) {
            total = total.add(item.getPrice());
        }
        return total;
    }

    public void viewItems() {
        System.out.println("Meal: ");
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }
}

class MealBuilder {

    public Meal buildMeatCokeMeal() {
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal buildVegCokeMeal() {
        Meal meal = new Meal();
        meal.addItems(new VeggieBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal buildMeatCoffeeMeal() {
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Coffee());
        return meal;
    }

    public Meal buildVegCoffeeMeal() {
        Meal meal = new Meal();
        meal.addItems(new VeggieBurger());
        meal.addItems(new Coffee());
        return meal;
    }
}
