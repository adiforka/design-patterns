package design_patterns.factory.abstractFactory.demo2;

public class AbstractFactoryPatternTest2 {
    public static void main(String[] args) {

        MachineFactoryProducer.getFactory(false).getMachine("Vending Machine").start();
        MachineFactoryProducer.getFactory(true).getMachine("truck").start();
        MachineFactoryProducer.getFactory(false).getMachine("ticket printer").start();
        MachineFactoryProducer.getFactory(true).getMachine("Car").start();
    }
}

interface Machine {
    void start();
}

class Car implements Machine {
    public void start() {
        System.out.println("Inside the Car::start() method");
    }
}

class Truck implements Machine {
    public void start() {
        System.out.println("Inside the Truck::start() method");
    }
}

class VendingMachine implements Machine {
    public void start() {
        System.out.println("Inside the VendingMachine::start() method");
    }
}

class TicketPrinter implements Machine {
    public void start() {
        System.out.println("Inside the TicketPrinter::start() method");
    }
}

abstract class AbstractMachineFactory {

    abstract Machine getMachine(String type);
}

class MobileMachineFactory extends AbstractMachineFactory {

    public Machine getMachine(String type) {
        if (type.equalsIgnoreCase("CAR")) return new Car();
        else if (type.equalsIgnoreCase("TRUCK")) return new Truck();
        return null;
    }
}

class StationaryMachineFactory extends AbstractMachineFactory {
    public Machine getMachine(String type) {
        if (type.equalsIgnoreCase("VENDING MACHINE")) return new VendingMachine();
        else if (type.equalsIgnoreCase("TICKET PRINTER")) return new TicketPrinter();
        return null;
    }
}

class MachineFactoryProducer {
    public static AbstractMachineFactory getFactory(boolean mobile) {
        if (mobile) return new MobileMachineFactory();
        else return new StationaryMachineFactory();
    }
}
