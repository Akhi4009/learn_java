public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

}

class Monitor extends Product {
    private int size;
    private String  resolution;

    public Monitor(String model, String manufacturer){
        super(model,manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String  resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color %s",x,y, color
        ));
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", resolution='" + resolution + '\'' +
                "} " + super.toString();
    }
}
class MotherBoard extends Product {
    private int ramSlot;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer){
        super(model,manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlot, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlot = ramSlot;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
      System.out.println("Program " + programName + " is now loading..");
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "ramSlot=" + ramSlot +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                "} " + super.toString();
    }
}

class ComputerCase extends Product {
    private String powerSupply;
    public ComputerCase(String model, String manufacturer){
        super(model,manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
       System.out.println("Power button pressed");
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "powerSupply='" + powerSupply + '\'' +
                "} " + super.toString();
    }
}
