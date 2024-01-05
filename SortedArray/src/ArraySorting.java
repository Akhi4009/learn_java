import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of array from the user
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
//        System.out.println(size);

        // Get the array of integers from user
        int [] unsortedArray = getIntegers(size);
//        System.out.println(Arrays.toString(unsortedArray));
        // Print the unsorted array
        printArray(unsortedArray);

        // sort the array in descending order
        int [] sortedArray = sortIntegers(unsortedArray);
       printArray(sortedArray);

       scanner.close();

    }

    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static  void printArray(int[] arr){
        for( int element : arr){
            System.out.println("Element is "+ element);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int [] sortedArray = arr.clone();
        boolean flag =true;
        int temp ;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
