public class Selection {
    public static void main(String[] args) {
    Selection sel = new Selection();
    int arr[] = { 23,45,6,34,54,23,4,23,56,76,};

    sel.selectionSort(arr);
        System.out.println("Sorted array");
        for (int i =0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n;i++){
            int minindex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            if(minindex != i){
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }
    }
}
