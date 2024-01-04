public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car -> startEngine");
    }
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
}

class GasPowerCar extends Car {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPowerCar(String description) {
        super(description);
    }

    public GasPowerCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n",
                cylinders);
    }

    @Override
    protected void runEngine() {
    System.out.printf("Gas -> usage exceeds the average: %2f %n",avgKmPerLiter);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}

class HybridCar extends Car {
    private double avgKmPerLiter;

    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}