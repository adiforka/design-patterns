package design_patterns.builder.demo7_computer_builder;

class Runner {
    public static void main(String[] args) {

        Computer dell = new Computer.ComputerBuilder()
                .setCPU(new CPU("Intel MultiCore", 3.55))
                .setRAM(new RAM("Ultra Quick Memory", 32))
                .setManufacturer("DELL")
                .build();

        System.out.println(dell.toString());
    }
}


public class Computer {

    private final CPU cpu;
    private final RAM ram;
    private final String manufacturer;

    private Computer(CPU cpu, RAM ram, String manufacturer) {
        this.cpu = cpu;
        this.ram = ram;
        this.manufacturer = manufacturer;
    }

    public static class ComputerBuilder {
        private CPU cpu;
        private RAM ram;
        private String manufacturer;

        public ComputerBuilder setCPU(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRAM(RAM ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, ram, manufacturer);
        }
    }

    @Override
    public String toString() {
        return "Computer: " +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", manufacturer='" + manufacturer + '\'';
    }
}

class CPU {
    private final String description;
    private final double clockSpeed;

    public CPU(String description, double clockSpeed) {
        this.description = description;
        this.clockSpeed = clockSpeed;
    }

    public String getDescription() {
        return description;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "description='" + description + '\'' +
                ", clockSpeed=" + clockSpeed +
                '}';
    }
}

class RAM {

    private final String description;
    private final int capacity;

    public RAM(String description, int capacity) {
        this.description = description;
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "description='" + description + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
