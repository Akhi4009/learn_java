package dev;


import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class LinkListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place delhi = new Place("Delhi",1000);
        addPlace(placesToVisit, delhi);
        Place lucknow = new Place("Lucknow",500);

        addPlace(placesToVisit, lucknow);
        addPlace(placesToVisit, lucknow);
        addPlace(placesToVisit, new Place("delhi",1000));
        addPlace(placesToVisit, new Place("bangalore",2000));
        addPlace(placesToVisit, new Place("agra",700));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;



        printMenu();

        while (!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("originating: " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.next().toUpperCase().substring(0,1);
            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    break;
                case "M":
                    printMenu();
                case "L":
                    System.out.println(placesToVisit);
                default:
                    quitLoop = true;
                    break;
            }
        }
    }
    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        for ( Place p : list){
            if( p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchIndex = 0;

        for ( var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchIndex, place);
                return;
            }
            matchIndex++;
        }
            list.add(place);


    }

    private static void printMenu(){
        System.out.println("""
                Available action (Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit """);
    }
}
