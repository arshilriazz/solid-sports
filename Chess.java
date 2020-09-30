package sports;

public class Chess extends IndividualSport implements INotBallSport, IRules {
    IPlayer chessPlayer;
    public Chess(IPlayer chessPlayer) {
        this.chessPlayer = chessPlayer;
    }
    public void winCriteria() {
        System.out.println("You win by killing the king of the opposite player");
    }
    @Override
    public void thingsToPlayWith() {
        System.out.println("Chess has black and white pieces");
    }
    @Override
    public boolean isHittingAllowed() {
        return false;
    }
    @Override
    public boolean isCoachHelpAllowed() {
        return false;
    }
}
