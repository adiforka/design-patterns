package design_patterns.strategy.demo1;

/*strategy pattern makes it possible to change behavior at runtime (by invoking different implementations of overridden
methods. depending on the actual type of the instance of Strategy, a different implementation of the doOperation method
will be used.

we say this is a behavior modification at runtime since it is only at runtime that methods are called and objects are
instantiated. at runtime an instance of Context is created when its constructor is called, an instance of one of the
concrete implementations of Strategy is created and passed to the Context constructor call, and then, the Context object,
with a Strategy object as part of its state, calls its executeOperation method, which calls an implementation of the
doOperation method depending on the actual type of the Strategy object the Context object has
*/

public class StrategyTest1 {
    public static void main(String[] args) {

        Context context = new Context(new Addition());
        int sum = context.executeOperation(10, 10);

        int difference = new Context(new Subtraction()).executeOperation(10, 10);
        int product = new Context(new Multiplication()).executeOperation(10, 10);
        int quotient = new Context(new Division()).executeOperation(10, 10);

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
        System.out.println("The sum of " + element1 + " and " + element2 + " is " + (element1 + element2));
        return element1 + element2;
    }
}

class Subtraction implements Strategy {
    @Override
    public int doOperation(int element1, int element2) {
        System.out.println("The different of " + element1 + " and " + element2 + " is " + (element1 - element2));
        return element1 - element1;
    }
}

class Multiplication implements Strategy {
    @Override
    public int doOperation(int element1, int element2) {
        System.out.println("The product of " + element1 + " and " + element2 + " is " + (element1 * element2));
        return element1 * element2;
    }
}

class Division implements Strategy {
    @Override
    public int doOperation(int element1, int element2) {
        System.out.println("The quotient of " + element1 + " and " + element2 + " is " + (element1 / element2));
        return element1 / element2;
    }
}

