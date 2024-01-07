import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int size = scanner.nextInt();
        int[] arr = readIntegers();
        int min = findMin(arr);
       System.out.println("Minimum value in arr = " + min);
    }
    public static int[] readIntegers1(int size){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter element of array: ");
        for(int i = 0; i< size; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, seperated by commas:");
        String input = scanner.nextLine();
        String [] splits = input.split(",");
       int[] values = new int[splits.length];
       for(int i=0; i< splits.length; i++){
           values[i] = Integer.parseInt(splits[i].trim());
       }
        return values;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
