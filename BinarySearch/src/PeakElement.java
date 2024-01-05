public class PeakElement {
    // A peak element is an element that is strictly greater than its neighbors.
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = findPeakElement(nums);

        System.out.println("Peak Element found at index: " + peakIndex);
    }

   public static int findPeakElement(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid] > arr[mid+1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
   }

}
