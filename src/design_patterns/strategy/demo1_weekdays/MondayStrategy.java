package design_patterns.strategy.demo1_weekdays;

public class MondayStrategy implements WeekdayStrategy {
    @Override
    public void use() {
        System.out.println("Using Monday Strategy");
    }
}
