package design_patterns.strategy.demo1_weekdays;

public class WednesdayStrategy implements WeekdayStrategy {
    @Override
    public void use() {
        System.out.println("Using Wednesday Strategy");
    }
}
