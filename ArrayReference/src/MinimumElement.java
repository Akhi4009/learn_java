import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int size = scanner.nextInt();
        int[] arr = readIntegers();
//        int min = findMin(arr);
//       System.out.println("Minimum value in arr = " + min);
        System.out.println(Arrays.toString(arr));
        int[] reverse = reverseArr(arr);
        System.out.println(Arrays.toString(reverse));
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
    private static int[] reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
