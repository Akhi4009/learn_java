package dev;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Lucknow");
        placesToVisit.add(0,"Delhi");
        placesToVisit.add("Bangalore");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        gettingElements(placesToVisit);
        printItinerary(placesToVisit);


    }
    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // queue methods

        list.offer("Kolkata");
        list.offerFirst("Kota");
        list.offerLast("Udaipur");
        // stack methods
        list.push("Jaipur");
    }
    private static void removeElements(LinkedList<String> list){
       list.remove(4);
       list.remove("Kota");

       System.out.println(list);
       String s1 = list.remove(); // removes first element
       System.out.println(s1 + " was removed");
        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");
        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");

        // Queue/Dequeue poll method
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");

        //Stack
        String sp1 = list.pop();
        System.out.println(sp1 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list){
       System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("Retrieved Element = " + list.getFirst());
        System.out.println("Retrieved Element = " + list.getLast());

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        // stack retrieval method
        System.out.println("Element from element() = " + list.peekFirst());
        System.out.println("Element from element() = " + list.peekLast());
        System.out.println("Element from element() = " + list.peek());

    }

    public static  void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for( int i =1; i< list.size(); i++){
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends with " + list.getLast());
    }
}
