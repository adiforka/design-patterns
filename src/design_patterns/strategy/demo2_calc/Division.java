package design_patterns.strategy.demo2_calc;

public class Division implements CalculatorStrategy{
    @Override
    public int calculate(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
