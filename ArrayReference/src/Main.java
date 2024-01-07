import java.util.Arrays;

public class Main {
    public static void main(String...  args) {
        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        System.out.println("myIntArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[0] =1;

        System.out.println("myIntArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        String[] splitString = "Hello World again".split(" ");
        printText(splitString);
        System.out.println("-".repeat(20));
        printText("Hello");
        System.out.println("-".repeat(20));
        printText("Hello", "World", "again");
        System.out.println("-".repeat(20));
        printText();
        String [] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",",sArray));
    }
    private  static  void printText(String... textList ){
        for(String t: textList){
            System.out.println(t);
        }
    }
}
