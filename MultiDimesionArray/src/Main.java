import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int [4][4];
        System.out.println(Arrays.toString(arr));
        for( int[] outer : arr){
            for( int ele : outer){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        arr[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(arr));

    }

}
