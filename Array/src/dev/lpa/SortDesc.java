package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class SortDesc {
    public static void main(String[] args) {
        int[] arr = getRandomArray(3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortDesc1(arr)));
    }

    public static int [] sortDesc(int[] arr){
        Arrays.sort(arr);
        for( int i = 0; i < arr.length/2 ;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static int[] sortDesc1(int[] arr){
        boolean flag = true;
        int temp ;
        while(flag){
            flag = false;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] < arr[i+1]){
                  temp = arr[i];
                  arr [i] = arr[i+1];
                  arr[i+1] = temp;
                  flag = true;
                }
            }
//            System.out.println(flag);
        }
        return arr;
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0; i <len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
