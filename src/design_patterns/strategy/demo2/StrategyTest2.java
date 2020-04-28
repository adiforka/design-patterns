package design_patterns.strategy.demo2;

public class StrategyTest2 {
    public static void main(String[] args) {

        Context context = new Context(new Addition());
        System.out.println("sum of 1 and 3 is : " + context.executeOperation(1, 3));

        context = new Context(new Division());
        System.out.println("quotient of 10 and 5 is : " + context.executeOperation(10, 5));
    }
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int element1, int element2) {
        return strategy.doOperation(element1, element2);
    }
}

interface Strategy {
    int doOperation(int element1, int element2);
}

class Addition implements Strategy {

    @Override
    public int doOperation(int element1, int element2) {
        return element1 + element2;
    }
}

class Subtractor implements Strategy {

    @Override
    public int doOperation(int element1, int element2) {
        return element1 - element2;
    }
}

class Multiplier implements Strategy {

    @Override
    public int doOperation(int element1, int element2) {
        return element1 * element2;
    }
}

class Division implements Strategy {

    @Override
    public int doOperation(int element1, int element2) {
        return element1 / element2;
    }
}
