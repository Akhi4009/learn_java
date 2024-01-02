public class Main {
    public static void main(String[] args){
        ComputerCase theCas = new ComputerCase("2208","DEll",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",
                27,"2540 * 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCas,theMonitor,theMotherBoard);

        thePC.powerUp();
    }
}
