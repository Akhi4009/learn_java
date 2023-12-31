public class Method {
    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Akhilesh", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Raj", highScore);

        highScore = calculateHighScorePosition(700);
        displayHighScorePosition("Sakshi", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Priya", highScore);

        highScore = calculateHighScorePosition(20);
        displayHighScorePosition("Akhilesh", highScore);
    }

    public static void displayHighScorePosition(String pName, int highScorePosition) {
        System.out.println(pName + " managed to get into position " + highScorePosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int pScore) {
        if (pScore >= 1000) {
            return 1;
        } else if (pScore >= 500 && pScore <= 1000) {
            return 2;
        } else if (pScore >= 100 && pScore <= 500) {
            return 3;
        } else {
            return 4;
        }
    }
}