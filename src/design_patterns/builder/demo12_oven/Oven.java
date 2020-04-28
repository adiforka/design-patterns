package design_patterns.builder.demo12_oven;

import java.util.ArrayList;
import java.util.List;

public class Oven {

    private final Long id;
    private final String brand;
    private final String model;
    private final String serialNumber;
    private final Color color;
    private List<String> tags;

    public Oven(OvenBuilder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.serialNumber = builder.serialNumber;
        this.color = builder.color;
        this.tags = builder.tags;
    }

    public enum Color {
        CHROME,
        BLACK,
        WHITE
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Color getColor() {
        return color;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public String removeTagByIndex(int index) {
        
        if (index >= tags.size()) throw new IndexOutOfBoundsException("keep index between 0 and "
                + (tags.size() - 1) + ", inclusive ");
        return tags.remove(index);
    }

    public boolean removeTagByValue(String value) {
        return tags.remove(value);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color=" + color +
                ", tags=" +  tags.toString() +
                '}';
    }

    public static OvenBuilder builder() {
        return new OvenBuilder();
    }

    public static class OvenBuilder {

        private Long id;
        private String brand;
        private String model;
        private String serialNumber;
        private Color color;
        private final List<String> tags = new ArrayList<>();

        public OvenBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OvenBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public OvenBuilder model(String model) {
            this.model = model;
            return this;
        }

        public OvenBuilder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public OvenBuilder color(Color color) {
            this.color = color;
            return this;
        }

        public OvenBuilder tags(String tag) {
            tags.add(tag);
            return this;
        }

        public Oven build() {
            return new Oven(this);
        }
    }

}
