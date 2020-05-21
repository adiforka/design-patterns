package design_patterns.strategy.demo1_weekdays;

public class TuesdayStrategy implements WeekdayStrategy {
    @Override
    public void use() {
        System.out.println("Using Tuesday Strategy");
    }
}
