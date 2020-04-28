package design_patterns.factory;

public class VehicleFactoryDemo {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        try {
            Vehicle autoMobile = vehicleFactory.getInstance("automobile");
            autoMobile.propel();

            Vehicle aircraft = vehicleFactory.getInstance("aircraft");
            aircraft.propel();

            Vehicle bummer = vehicleFactory.getInstance("bummer");
            bummer.propel();
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

interface Vehicle {
    void propel();
}

class Automobile implements Vehicle {

    @Override
    public void propel() {
        System.out.println("Automobile in motion");
    }
}

class Aircraft implements Vehicle {

    @Override
    public void propel() {
        System.out.println("Aircraft in motion");
    }
}

class VehicleFactory {

    public Vehicle getInstance(String type) {

        if (type.equalsIgnoreCase("automobile"))
            return new Automobile();
        else if (type.equalsIgnoreCase("aircraft"))
            return new Aircraft();
        else
            throw new UnsupportedOperationException("Usage: type must be \"automobile\" or \"aircraft\"");
    }
}
