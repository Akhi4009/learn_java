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

    public static  int[] rotateArray(int[] nums,int k){
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }

    public static int[] reverse(int[] arr,int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
//    int[] arr = {1,2,3,3,4,5};
//        System.out.println(findDuplicate(arr));

        int [] arr1 = {1,2,3,4,6};
        // 6, 4, 3, 2, 1
//        System.out.println(findMissingNumber(arr1));
        rotateArray(arr1,5);
        for (int num : arr1 ){
            System.out.print(num + " ");
        }

    }
}
