package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
       int[] arr1 =  getRandomArray(10);
       System.out.println(Arrays.toString(arr1));
       Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2,5);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = getRandomArray(5);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr3,arr3.length);
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = Arrays.copyOf(arr4,arr4.length-1);
        System.out.println(Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOf(arr4,10);
        System.out.println(Arrays.toString(arr6));

        String [] sArray = {"Akhi", "Raj", "Sakshi", "Priti","Retvik"};
        Arrays.sort(sArray);
        if(Arrays.binarySearch(sArray,"Raj") >= 0){
            System.out.println("Found Raj in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 5, 4};
        if(Arrays.equals(s1, s2)){
            System.out.println("Both are equal");
        }else {
            System.out.println("Arrays are not equal");
        }


    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0; i < len; i++){
           newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
