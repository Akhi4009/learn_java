public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti-800");
        runRace(car);

        Car ferrari = new GasPowerCar("Ferrari",
                12,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red tesla Model 2",
                345,75);
        runRace(tesla);

        Car FerrariHybrid = new HybridCar("2022 Black Ferrari SF90",
                16,8,8);
        runRace(FerrariHybrid);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println("_______");
    }
}
