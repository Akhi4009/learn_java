import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add( new ArtObject("Oil Painting",200.00,"Impressionistic work by ABF painted in 2020"));

        storeProducts.add( new ArtObject("Sculpture", 2000,"Bronze work by JKF, produced in 1950"));

        listProducts();
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
