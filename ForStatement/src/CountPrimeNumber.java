public class CountPrimeNumber {
    public static void main(String[] args ) {
        System.out.println("range(100, 200), there is " + countPrimeNumber(100, 200) +" prime numbers.");
        System.out.println("range(1, 10), there is " + countPrimeNumber(1, 10) +" prime numbers.");
        System.out.println("range(1, 1000), there is " + countPrimeNumber(1, 1000) +" prime numbers.");
    }
    public static boolean isPrime(int number){
        if(number <= 2){
            return (number == 2);
        }
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNumber(int fNumber, int sNumber){
        int count = 0;

        for ( int i = fNumber ; i <= sNumber; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }


}
