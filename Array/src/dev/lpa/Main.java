package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;

        double[] myDoubleArray = new double[10];
        myDoubleArray[3] = 23.00;
        System.out.println(myDoubleArray[3]);
        int[] firstSix ={1, 2, 3, 4, 5, 6};
        System.out.println(firstSix[firstSix.length - 1]);
        int arrayLength = firstSix.length;
        System.out.println("length of array = " + arrayLength);
        int[] newArray;
//        newArray = new int[]{1, 2, 3, 4};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length-i;
        }
        for (int j : newArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array.");
        }
        System.out.println(((int[]) objectVariable).length);
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        System.out.println(objectArray[1]);
        objectArray[2] = newArray;
    }
}
