package design_patterns.builder.demo10_player_builder;

public class Game {

    private String description;

    public Game() {
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
