public class Car {
    private String make = "Tesla";
    private  String model = "Model X";
    private  String  color = "gray";
    private  int doors = 2;
    private  boolean convertible = true;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }



    public void  describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

}
