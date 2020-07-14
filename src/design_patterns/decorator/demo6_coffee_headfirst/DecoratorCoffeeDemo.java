package design_patterns.decorator.demo6_coffee_headfirst;

//a decorator always refers to what it directly wraps, even if that thing's another decorator
//e.g. "get the cost of the thing I'm wrapping, because my cost is to be added to that thing,"
//but it does not know that that thing is a decorator. it just knows it is of the right formal type
//also, every decorator knows it's only wrapping a single thing

//based on HeadFirst Design Patterns (OBJECTION: Okhravi says the pattern turns out too complicated for
// what we're using it for here, and that it'd be more suitable to just give the bevarage a collection
// of condiments and when calculating the total cost of the beverage, to iterate over the cost of the
// components in the collection and add that to the base cost of the beverage (Iterator Pattern)
//here, for DecoratorP, concerns might be insufficiently separated (see get Cost method with + in it)

//also this example assumes that condiments are beverages which: they're not

//Java API for input output streams is a good example of DP: you can wrap implementations around a basic
//input stream for buffering, line numbers, etc. Unlike with the coffee ex., a DataInputStream is clearly,
//including in its name, an instance of InputStream
public class DecoratorCoffeeDemo {
    public static void main(String[] args) {

        //decaf with soy (decorator wrapped around a component)
        Beverage beverage = new SoyDecorator(new Decaf("decaf", 2.0), "soy", 0.5);

        System.out.println("Cost of decaf with soy: " + beverage.getCost());

        System.out.println("DESC: " + beverage.getDescription());

        //espresso with soy and caramel (decorator wrapped around another decorator
        //wrapped around a component)
        Beverage beverage1 = new CaramelDecorator(
                new SoyDecorator(new Espresso("espresso", 1.5),
                        "soy", 0.5), "caramel", 0.3);

        System.out.println("Cost of espresso with soy and caramel: " + beverage1.getCost());

        //the downside here is that it's fairly quickly lose track of what you have decorated around what
        //and how much of it
    }
}
