public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti-800");
        runRace(car);

        Car ferrari = new GasPowerCar("Ferrari",
                12,6);
        runRace(ferrari);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println("_______");
    }
}
