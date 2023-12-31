public class MainChallenge {
    public static void main(String[] args) {
        System.out.println("Total height is "+ convertToCentimeter(6, 0)+ "cm");
    }
    public static double convertToCentimeter(int heightI){
        return 2.54 * heightI;
    }

    public static double convertToCentimeter(int heightF, int heightI){

        return convertToCentimeter(12 * heightF +heightI);
    }

}
