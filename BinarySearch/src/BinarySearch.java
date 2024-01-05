public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 80;
        int result = binarySearch(sortedArray,target);
        if(result != -1){
            System.out.println("Element found at index " + result);
        }else {
            System.out.println("Element not found in the array");
        }
    }
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;

            // check if the target is present at the middle
            if(arr[mid] == target){
                return mid;
            }

            // if the target is greater, ignore the lr=eft half
            if(arr[mid] < target){
                left = mid + 1;
            } else {
                // if the target is smaller, ignore the right half
                right = mid-1;
            }

        }
        // if target is not present in the array
        return -1;
    }
}
