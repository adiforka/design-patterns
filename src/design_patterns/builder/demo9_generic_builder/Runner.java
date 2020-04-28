package design_patterns.builder.demo9_generic_builder;

public class Runner {
    public static void main(String[] args) {


        Aircraft aircraft1 = new Aircraft();
        Aircraft aircraft = GenericBuilder.of(Aircraft::new)

                /*the setters are instance methods in Aircraft.java, so how come we're using method references
                that look like static method references (type 1 in oracle tutorials method reference table)? We cannot
                access object created with the of() method above through a reference variable since no such reference is
                declared. But you cannot use static method references for instance methods since you cannot call instance
                methods on a type(statically). Here's the rub: maybe we're actually using option 3) from the oracle
                tutorial table: "Reference to an instance method of an arbitrary object of a particular type"? That just
                looks like it a static method reference, but it would actually be an instance method reference for that
                "arbitrary object" (arbitrary meaning that it is not assigned to a variable) of a particular type (meaning
                that it has an actual particular type).
                 */
                .with(Aircraft::setThrust, "moderate")
                .with(Aircraft::setDesignation, "assault")
                .build();

        System.out.println(aircraft.toString());
    }
}
