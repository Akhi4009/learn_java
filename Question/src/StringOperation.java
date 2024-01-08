import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String a = scanner.next();
        String b = scanner.next();

        // Perform operations
        // 1. Sum the lengths of a and b
        int sumOfLengths = a.length() + b.length();
        System.out.println(sumOfLengths);

        // 2. Check if a is lexicographically greater than b
        String resultLex = a.compareTo(b) > 0 ? "Yes" : "No";
        System.out.println(resultLex);

        // 3. Capitalize the first letter in both a and b and print them
        String capitalizedA = capitalizeFirstLetter(a);
        String capitalizedB = capitalizeFirstLetter(b);
        System.out.println(capitalizedA + " " + capitalizedB);

        // Close the scanner
        scanner.close();
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
