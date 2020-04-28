package design_patterns.builder.demo11.coffee_builder;

import java.util.ArrayList;
import java.util.List;

public class Coffee {

    private final Integer typeId;
    private final String description;
    private final String origin;
    private final Intensity intensity;
    private final SuggestedPurpose suggestedPurpose;
    private final List<Distributor> distributors = new ArrayList<>();

    private Coffee(Builder builder) {
        typeId = builder.typeId;
        description = builder.description;
        origin = builder.origin;
        intensity = builder.intensity;
        suggestedPurpose = builder.suggestedPurpose;
        distributors.addAll(builder.distributors);
    }

    public int getTypeId() {
        return typeId;
    }

    public String getDescription() {
        return description;
    }

    public String getOrigin() {
        return origin;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public SuggestedPurpose getSuggestedPurpose() {
        return suggestedPurpose;
    }

    public List<Distributor> getDistributors() {
        return distributors;
    }

    enum Intensity {
        ONE, TWO, THREE, FOUR, FIVE
    }

    enum SuggestedPurpose {
        MOCHA, CAPPUCCINO, LATTE, ESPRESSO
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer typeId;
        private String description;
        private String origin;
        private Intensity intensity;
        private SuggestedPurpose suggestedPurpose;
        private final List<Distributor> distributors = new ArrayList<>();

        public Builder typeId(Integer typeId) {
            this.typeId = typeId;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder intensity(Intensity intensity) {
            this.intensity = intensity;
            return this;
        }

        public Builder suggestedPurpose(SuggestedPurpose suggestedPurpose) {
            this.suggestedPurpose = suggestedPurpose;
            return this;
        }

        public Builder distributor(Distributor distributor) {
            distributors.add(distributor);
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "typeId=" + typeId +
                ", description='" + description + '\'' +
                ", origin='" + origin + '\'' +
                ", intensity=" + intensity +
                ", suggestedPurpose=" + suggestedPurpose +
                '}';
    }
}