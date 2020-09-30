package sports;

public class ClubFootball extends Football {
    public ClubFootball(int pitchLength, int pitchWidth) {
        super(pitchLength, pitchWidth);
    }
    public void VARPresence() {
        System.out.println("There is VAR in club football");
    }
}