package sports;

public class Main {
    public static void main(String[] args) {
        Chess chess = new Chess(new ChessPlayer());
        chess.chessPlayer.age();
        chess.thingsToPlayWith();
        IceHockey iceHockey = new IceHockey();
        System.out.println(iceHockey.isCoachHelpAllowed());
        Golf golf = new Golf();
        golf.winCriteria();
        Football football = new Football(120,90);
        football.winCriteria();
        ClubFootball clubFootball = new ClubFootball(120, 80);
        System.out.println(clubFootball.teamSize);
        clubFootball.winCriteria();
    }
}