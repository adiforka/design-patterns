package design_patterns.builder.demo11.coffee_builder;


public class Distributor {
    private final String name;

    public Distributor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
