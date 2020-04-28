package design_patterns.builder.demo6_airplane_builder;

class Runner {
    public static void main(String[] args) {

        Airplane mig29 = new Airplane.AirplaneBuilder()
                .setDescription("MIG29")
                .setWidth(14)
                .setLength(20)
                .setSpeed(2981)
                .setWeight(4023)
                .setPurpose("Assault")
                .setManufacturer("Russia Aerodynamics")
                .build();

        Airplane f22 = new Airplane.AirplaneBuilder()
                .setDescription("American Fighter Jet")
                .setWeight(18)
                .setLength(25)
                .setSpeed(2603)
                .setWeight(5032)
                .setPurpose("Ratatattattatta")
                .setManufacturer("Heather Locklear")
                .build();

        System.out.println(mig29.toString());
        System.out.println(f22.toString());
    }
}

public class Airplane {
    //nicely encapsulated. promotes immutability of created objects: private constructor, no no-args constructor, no setters
    private final String description;
    private final int width;
    private final int length;
    private final int speed;
    private final int weight;
    private final String purpose;
    private final String manufacturer;

    private Airplane(String description, int width, int length, int speed, int weight, String purpose, String manufacturer) {
        this.description = description;
        this.width = width;
        this.length = length;
        this.speed = speed;
        this.weight = weight;
        this.purpose = purpose;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Airplane: " +
                "description='" + description + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", speed=" + speed +
                ", weight=" + weight +
                ", purpose='" + purpose + '\'' +
                ", manufacturer='" + manufacturer + "\'";
    }

    public static class AirplaneBuilder {

        private String description;
        private int width;
        private int length;
        private int speed;
        private int weight;
        private String purpose;
        private String manufacturer;

        public AirplaneBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public AirplaneBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public AirplaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public AirplaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AirplaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public AirplaneBuilder setPurpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public AirplaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Airplane build() {
            return new Airplane(description, width, length, speed, weight, purpose, manufacturer);
        }
    }
}
