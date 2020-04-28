package design_patterns.builder.demo4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class BuilderTest4 {
    public static void main(String[] args) {


        var orderBuilder = new OrderBuilder();
        Order childrenOrder = orderBuilder.buildChildrenOrder();
        Order adultOrder = orderBuilder.buildAdultOrder();

        childrenOrder.showItems();
        System.out.println(childrenOrder.getCost());

        adultOrder.showItems();
        System.out.println(adultOrder.getCost());

    }
}

class Order {

    //normally we'd rely on the framework to instantiate this field
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        var cost = new BigDecimal(0);
        for (Item item : items) {
            cost = item.price().add(cost);
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", " + item.pack().bagUp());
            System.out.println(", " + item.price());
        }
    }
}

interface Item {

    String name();

    Bag pack();

    BigDecimal price();

}

interface Bag {

    String bagUp();
}

class PaperBag implements Bag {

    public String bagUp() {
        return "Paper Bag";
    }
}

class PlasticBox implements Bag {

    public String bagUp() {
        return "Plastic Box";
    }
}

abstract class Toy implements Item {

    @Override
    public Bag pack() {
        return new PlasticBox();
    }
}

class ToySoldier extends Toy {

    @Override
    public String name() {
        return "GIJoe";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(19.99)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class ToyCar extends Toy {

    @Override
    public String name() {
        return "Matchbox";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(11.99).setScale(2, RoundingMode.HALF_UP);
    }
}

abstract class Book implements Item {

    @Override
    public Bag pack() {
        return new PaperBag();
    }
}

class ChildrenBook extends Book {

    @Override
    public String name() {
        return "Huckleberry Finn";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(9.99)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class AdultFiction extends Book {

    @Override
    public String name() {
        return "Adam and Eve Made a Baby";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(14.99)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

/*evidently, the builder class contains no fields etc., and only a default constructor. its gist are the build methods
for various configurations of items in an order*/
class OrderBuilder {

    public Order buildChildrenOrder() {
        Order order = new Order();
        order.addItem(new ChildrenBook());
        order.addItem(new ToyCar());
        return order;
    }

    public Order buildAdultOrder() {
        Order order = new Order();
        order.addItem(new AdultFiction());
        return order;
    }
}


