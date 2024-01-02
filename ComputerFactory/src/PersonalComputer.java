public class PersonalComputer extends Product {
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;
    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }

    private void drawLogo(){
        monitor.drawPixelAt(10, 10, "gray");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "computerCase=" + computerCase +
                ", monitor=" + monitor +
                ", motherBoard=" + motherBoard +
                "} " + super.toString();
    }
}
