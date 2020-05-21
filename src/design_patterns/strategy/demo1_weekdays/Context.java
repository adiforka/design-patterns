package design_patterns.strategy.demo1_weekdays;

public class Context {

    private final WeekdayStrategy strategy;

    public Context(WeekdayStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        System.out.println("Execute called on context object");
        strategy.use();
    }

}
