package design_patterns.decorator.demo8_forchis_car_decorator;

public class CarDecoratorDemo {
    public static void main(String[] args) {

        DecoratedCar civic = new Car("Civic", 159_999.99);
        civic = new PimpinRims(civic, "Pimpin' rims", 5_999.99);
        civic = new PlushSeats(civic, "Plush seats", 3_999.99);
        civic = new BlueLights(civic, "Blue lights", 1_999.99);

        System.out.println("Car with add-ons: " + civic.getName());
        System.out.println("Car total price: " + civic.getPrice());

    }
}
