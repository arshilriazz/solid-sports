package sports;

public class Main {
    public static void main(String[] args) {
        ClubFootball clubFootball = new ClubFootball(120, 80);
        System.out.println(clubFootball.teamSize);
        clubFootball.winCriteria();
    }
}
