package design_patterns.strategy.demo4_weekdays;

public class DemoApp {
    public static void main(String[] args) {

        Context context = new Context(new MondayStrategy());
        context.execute();

        context = new Context(new TuesdayStrategy());
        context.execute();

        context = new Context(new WednesdayStrategy());
        context.execute();
    }
}
