import java.util.*;

public class MoreList {
    public static void main(String[] args) {
        String [] items = {"apples", "bananas", "milk","eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","cheese"));
        System.out.println(nextList);
        nextList.add("apples");
        System.out.println(nextList);
        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println("Third item = " +groceries.get(2));
        if(groceries.contains("mustard")){
            System.out.println("List contained mustard");
        }
        groceries.add("papaya");
        groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println(groceries.indexOf("yogurt"));
        System.out.println(groceries.lastIndexOf("yogurt"));

        groceries.remove(1);
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);
        groceries.retainAll(List.of("apples", "milk","papaya"));
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());
        groceries.addAll(List.of("eggs","pickles","mustard"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        var groceryArray = groceries.toArray(new String[0]);
        System.out.println("-".repeat(20));
        System.out.println(Arrays.toString(groceryArray));
    }
}
