package design_patterns.builder.demo12_oven;

public class OvenBuilderDemo {
    public static void main(String[] args) {

        Oven siemensOven = Oven.builder()
                .id(1L)
                .brand("Siemens")
                .color(Oven.Color.BLACK)
                .model("AC30")
                .serialNumber("71239ja9323x3")
                .tags("premium")
                .tags("super-seller")
                .tags("on sale")
                .build();

        System.out.println(siemensOven);
    }
}
