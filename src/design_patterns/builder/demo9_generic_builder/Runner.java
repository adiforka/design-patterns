package design_patterns.builder.demo9_generic_builder;

public class Runner {
    public static void main(String[] args) {


        Aircraft aircraft = GenericBuilder.of(Aircraft::new)
                .with((ac, value) -> ac.setThrust(value), "moderate")
                .with(Aircraft::setDesignation, "assault")
                .build();

        System.out.println(aircraft.toString());
    }
}
