public class MainChallenge {
    public static void main(String[] args) {
        int num = 4;
        int count = 0;
        while (num <= 20) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }
            count++;

            System.out.println(num);
            if(count >= 5){
                break;
            }
        }
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
