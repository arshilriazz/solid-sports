package sports;

public class Football extends TeamSport implements IBallSport, IRules {
    private int pitchLength;
    private int pitchWidth;
    public int getPitchLength() {
        return pitchLength;
    }
    public int getPitchWidth() {
        return pitchWidth;
    }
    public void setPitchLength(int pitchLength) {
        this.pitchLength = pitchLength;
    }
    public void setPitchWidth(int pitchWidth) {
        this.pitchWidth = pitchWidth;
    }
    @Override
    public int ballSize() {
        return 10;
    }
    public Football(int pitchLength, int pitchWidth) {
        this.pitchLength = pitchLength;
        this.pitchWidth = pitchWidth;
        this.teamSize = 11;
    }
    public void winCriteria() {
        System.out.println("You win if you score more goals than the opposition");
    }
    @Override
    public boolean isHittingAllowed() {
        return false;
    }
    @Override
    public boolean isCoachHelpAllowed() {
        return true;
    }
}