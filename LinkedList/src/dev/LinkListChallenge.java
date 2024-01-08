package dev;


import java.util.LinkedList;

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
}
