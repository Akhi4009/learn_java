public class Main {
    public static void main(String[] args){

        int newScore = calculateScore("akhilesh", 100);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();
    }
    public static int calculateScore(String pName, int score){
        System.out.println("Player " + pName + " scored " + score + " points.");
        return 1000 * score;
    }
    public static int calculateScore( int score){
        System.out.println("Player unnamed scored " + score + " points.");
        return 1000 * score;
    }
    public static int calculateScore(){
        System.out.println("Player  scored  points.");
        return 0;
    }

}
