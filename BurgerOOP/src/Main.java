public class Main {
    public static void main(String[] args) {
//Item coke = new Item("drink","coke",1.5);
//coke.printItem();
//coke.setSize("LARGE");
//coke.printItem();

        Burger burger = new Burger("regular",4.00);
        burger.addToppings("BACON","CHEESE","MAYO");
        burger.printItem();
    }
}
