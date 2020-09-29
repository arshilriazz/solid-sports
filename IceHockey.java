package sports;

public class IceHockey extends TeamSport implements INotBallSport, IRules{
    @Override
    public void thingsToPlayWith() {
        System.out.println("hockey sticks and pucks");
    }
    @Override
    public boolean isHittingAllowed() {
        return true;
    }
    @Override
    public boolean isCoachHelpAllowed() {
        return true;
    }
    @Override
    void winCriteria() {
        System.out.println("you win by scoring more than the opponent");
    }
}
