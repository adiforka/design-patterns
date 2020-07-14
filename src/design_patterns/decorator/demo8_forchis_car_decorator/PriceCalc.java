package design_patterns.decorator.demo8_forchis_car_decorator;

public class PriceCalc {

    public static double getTwoDecPlaces(double val) {
        return (int) (val * 100) / 100.0;
    }
}
