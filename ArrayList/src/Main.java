import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy",1);
    }
}
public class Main {
    public static void main(String[] args) {
       GroceryItem[] groceryItem = new GroceryItem[3];
        groceryItem[0] = new GroceryItem("Milk");
        groceryItem[1] = new GroceryItem("apples", "Produce",6);
        groceryItem[2] = new GroceryItem("curd");
        System.out.println(Arrays.toString(groceryItem));

        ArrayList objetList = new ArrayList();
        objetList.add(new GroceryItem("rice", "produce",3));
        objetList.add("Akhilesh");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add( new GroceryItem("dall", "produce",4));
        System.out.println(groceryList);
    }
}
