package design_patterns.builder.demo9_generic_builder;

public class Aircraft {

    private String thrust;
    private String designation;

    public String getThrust() {
        return thrust;
    }

    public void setThrust(String thrust) {
        this.thrust = thrust;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "thrust='" + thrust + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
