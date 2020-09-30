package sports;

public class ChessPlayer implements IPlayer {
    @Override
    public void name() {
        System.out.println("player name");
    }

    @Override
    public void age() {
        System.out.println(20);
    }
}
