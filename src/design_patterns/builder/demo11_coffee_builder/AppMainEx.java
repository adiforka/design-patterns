package design_patterns.builder.demo11_coffee_builder;

public class AppMainEx {
    public static void main(String[] args) {

        Coffee coffee1 = Coffee.builder()
                .typeId(4)
                .description("Mild Javanese")
                .intensity(Coffee.Intensity.TWO)
                .origin("Java")
                .suggestedPurpose(Coffee.SuggestedPurpose.LATTE)
                .distributor(new Distributor("Coffee Inc."))
                .distributor(new Distributor("Smelly & Co."))
                .distributor(new Distributor("Cafeteria"))
                .build();

        System.out.println(coffee1);
        coffee1.getDistributors().forEach(distributor -> System.out.print(distributor + ", "));
    }
}
