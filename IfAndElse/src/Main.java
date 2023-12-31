public class Main {
    public static void main(String[] args){
      int akhilesh = calculateScore(true, 1000, 5, 100);
      System.out.println("Akhilesh Score was = " + akhilesh);

      int akhil =  calculateScore(true, 500, 7, 200);
        System.out.println("Akhil Score was = " + akhil);
    }

    public static  int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

}

