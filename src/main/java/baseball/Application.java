package baseball;

public class Application {
    public static void main(String[] args) {
        Game game;
        do {
            game = new Game();

            while(!game.isFinished()) {
                game.play();
            }

            if(!game.replay()) { game = null; };

        } while(game != null);
    }
}
