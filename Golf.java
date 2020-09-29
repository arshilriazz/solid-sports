package sports;

public class Golf extends IndividualSport implements IBallSport, IRules {
    @Override
    void winCriteria() {
        System.out.println("You win by scoring in least tries");
    }

    @Override
    public int ballSize() {
        return 1;
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
