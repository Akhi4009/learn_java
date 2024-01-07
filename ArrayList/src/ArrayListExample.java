import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");
        System.out.println(myArrayList);

        String firstEle = myArrayList.get(0);
        System.out.println(firstEle);

        myArrayList.set(1,"Papaya");
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        for(String element : myArrayList){
            System.out.println(element);
        }

    }
}
