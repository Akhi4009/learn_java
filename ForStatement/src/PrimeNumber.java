public class PrimeNumber {
    public static void main(String[] args ) {
        System.out.println("0 is " + (isPrime(0) ? "" : "Not ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "Not ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "Not ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "Not ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "Not ") + "a prime number");
        System.out.println("41 is " + (isPrime(41) ? "" : "Not ") + "a prime number");
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
}
