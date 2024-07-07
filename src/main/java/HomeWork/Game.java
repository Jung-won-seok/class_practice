package HomeWork;

public class Game {
    private int size;
    private Player[] players;

    public Game(){}
    public Game(int size, Player p1, Player p2) {
        this.size = size;
        this.players = new Player[]{p1, p2};
    }
    public void start() {

    }
}
