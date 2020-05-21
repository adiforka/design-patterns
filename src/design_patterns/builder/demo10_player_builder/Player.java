package design_patterns.builder.demo10_player_builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Player {

    private final String firstName;
    private final String lastName;
    private final Integer height;
    private final Double pointAverage;
    private final Position position;
    private final List<Game> games = new ArrayList<>();

    enum Position {
        POINT_GUARD, SHOOTING_GUARD, SMALL_FORWARD, POWER_FORWARD, CENTER
    }

    private Player(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        height = builder.height;
        pointAverage = builder.pointAverage;
        position = builder.position;
        games.addAll(builder.games);
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getHeight() {
        return height;
    }

    public Double getPointAverage() {
        return pointAverage;
    }

    public Position getPosition() {
        return position;
    }

    public List<Game> getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", pointAverage=" + pointAverage +
                ", position=" + position +
                '}';
    }

    //put the Builder getter in the enclosing class itself
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private Integer height;
        private Double pointAverage;
        private Position position;
        private List<Game> games = new ArrayList<>();

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        public Builder pointAverage(Double pointAverage) {
            this.pointAverage = pointAverage;
            return this;
        }

        public Builder position(Position position) {
            this.position = position;
            return this;
        }

        public Builder addGame(Supplier<Game> gameSupplier, String description) {
            Game game = gameSupplier.get();
            game.setDescription(description);
            games.add(game);
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}

