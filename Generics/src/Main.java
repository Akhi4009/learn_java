
record BaseballPlayer(String name, String position){}
public class Main {
    public static void main(String[] args) {
        BaseballTeam mumbai = new BaseballTeam("Mumbai Indians");
        BaseballTeam chennai = new BaseballTeam("Chennai Super Kings");

        scoreResult(mumbai, 20,chennai,30);
    }
    public static void scoreResult(BaseballTeam team1, int t1_score,
                                    BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
