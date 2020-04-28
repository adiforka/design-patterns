package design_patterns.factory;

public class FactoryPatternModelsTest {
    public static void main(String[] args) {

        ModelFactory modelFactory = new ModelFactory();

            Model model1 = modelFactory.getInstance("blond", "Jenna", "Jameson");
            Model model2 = modelFactory.getInstance("brunette", "Tera", "Patrick");
            Model model3 = modelFactory.getInstance("blondeee", "Booboo", "DeGuerra");

            System.out.println(model1 + "\n" + model2 + "\n" + model3 + "\n");
    }
}

class ModelFactory {

    public Model getInstance(String type, String firstName, String lastName) throws RuntimeException {

            if (type.equalsIgnoreCase("blond")) return new BlondModel(firstName, lastName);
            else if (type.equalsIgnoreCase("brunette")) return new BrunetteModel(firstName, lastName);
            else return null;
    }
}

abstract class Model implements Cloneable {
    private String firstName;
    private String lastName;

    public Model(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class BlondModel extends Model {

    public BlondModel(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class BrunetteModel extends Model {

    public BrunetteModel(String firstName, String lastName) {
        super(firstName, lastName);
    }
}



