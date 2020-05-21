package design_patterns.strategy.demo2_calc;

/*strategy pattern makes it possible to change behavior at runtime (by invoking different implementations of overridden
methods. depending on the actual type of the instance of Strategy, a different implementation of the doOperation method
will be used.

we say this is a behavior modification at runtime since it is only at runtime that methods are called and objects are
instantiated. at runtime an instance of Context is created when its constructor is called, an instance of one of the
concrete implementations of Strategy is created and passed to the Context constructor call, and then, the Context object,
with a Strategy object as part of its state, calls its executeOperation method, which calls an implementation of the
doOperation method depending on the actual type of the Strategy object the Context object has
*/
public class DemoEx {
    public static void main(String[] args) {

        /*a different operation is carried out within Context's execute method depending on the actual type of Strategy
        object passed to it*/
        Context ctx = new Context(new Addition());
        double result = ctx.doCalculation(4, 2);
        System.out.println("result of addition = " + result);

        ctx.setCalculator(new Multiplication());
        result = ctx.doCalculation(4, 2);
        System.out.println("result of multiplication = " + result);

        ctx.setCalculator(new Remainder());
        result = ctx.doCalculation(4, 2);
        System.out.println("result of remainder op. = " + result);
    }
}
