package dev.lpa;

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
        newArray = new int[]{1, 2, 3, 4};
        for (int i =0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
