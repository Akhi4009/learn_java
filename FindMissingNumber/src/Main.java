import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int findMissingNumber(int arr[]){
        int n = arr.length+1;
        int totalSum = (n*(n+1))/2;
        int arraySum = 0;
        for (int num : arr){
            arraySum +=num;
        }
        return totalSum - arraySum;
    }
    public static int findDuplicate(int arr[]){
        Set<Integer> seen = new HashSet<>();
        for (int num :arr){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1; // Duplicate not found;
    }
    public static void main(String[] args) {
    int[] arr = {1,2,3,3,4,5};
        System.out.println(findDuplicate(arr));

        int [] arr1 = {1,2,3,4,6};
        System.out.println(findMissingNumber(arr1));

    }
}
