public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insSort = new InsertionSort();
        int arr[] = {2, 3, 1, 45, 34, 65, 76, 87, 56, 43, 56};
        insSort.insertionSort(arr);
        System.out.println("Sorted array");
        for ( int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    void insertionSort(int arr[]){
        int n = arr.length;
        for (int i =1; i <  n; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
