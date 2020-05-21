package design_patterns.strategy.demo2_calc;

public class Multiplication implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
