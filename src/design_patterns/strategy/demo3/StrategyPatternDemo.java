package design_patterns.strategy.demo3;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        /*a different operation is carried out within Context's execute method depending on the actual type of Strategy
        object passed to it*/
        Context ctx = new Context(new AdditionOperation());
        System.out.println(ctx.execute(1, 4));

        Context ctx2 = new Context(new MultiplicationOperation());
        System.out.println(ctx2.execute(2, 4));
    }
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double execute(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}

interface Strategy {

    int doOperation(int num1, int num2);

}

class AdditionOperation implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}

class SubtractionOperation implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}

class MultiplicationOperation implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class DivisionOperation implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}
