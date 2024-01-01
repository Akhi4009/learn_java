public class Main {
    public static  void main(String[] args ){
       Car car = new Car();
       car.setMake("Tata");
       car.setModel("Indica");
       car.setColor("gray");
       car.setDoors(4);
       car.setConvertible(true);
       car.describeCar();
       System.out.println("make = " + car.getMake());
       System.out.println("model = " + car.getModel());
       System.out.println("color = " + car.getColor());
    }
}
