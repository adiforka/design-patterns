package design_patterns.strategy.demo2_calc;

public class Context {
    private CalculatorStrategy calculator;

    public Context(CalculatorStrategy calculator) {
        this.calculator = calculator;
    }

    public double doCalculation(int a, int b) {
        return calculator.calculate(a, b);
    }

    public CalculatorStrategy getCalculator() {
        return calculator;
    }

    public void setCalculator(CalculatorStrategy calculator) {
        this.calculator = calculator;
    }
}
