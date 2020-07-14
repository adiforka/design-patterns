package design_patterns.decorator.demo6_coffee_headfirst;


class CaramelDecorator extends CondimentDecorator {

    public CaramelDecorator(Beverage beverage, String description, double cost) {
        super(description);
        super.beverage = beverage;
        this.cost = cost;
    }

    //the cost of the caramel cannot be calculated without also getting the cost of the beverage it wraps
    //hence: decorator --> it is not standalone (although you could have a "reset" decorator that purposefully
    //ignores what the thing it wraps, and reports only what it itself does to the thing that wraps it
    //e.g. if you tell it to multiply by 0, it won't matter what value is inside the object it wraps (return
    //will be 0 anyway)

    //potentially dangerous: mixing concerns of getting own price and getting another object's price
    //would be more useful if the implementation of this method were different among different decorators
    //(i.e., more behavioral variation)
    public double getCost() {
        return cost + beverage.getCost();
    }
}
