package design_patterns.builder.demo10_generic_builder_player;



public class Runner {
    public static void main(String[] args) {


        Player p1 = Player.builder()
                .firstName("jamie")
                .lastName("de coco")
                .height(177)
                .pointAverage(34.2)
                .position(Player.Position.POINT_GUARD)
                .addGame(Game::new, "Miami")
                .addGame(Game::new, "Chicago")
                .addGame(Game::new, "New Jersey")
                .build();

        System.out.println(p1);
        p1.getGames().forEach(game -> System.out.println(game.getDescription()));
    }
}
