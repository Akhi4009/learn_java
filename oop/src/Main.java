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

       Account akhileshAccount = new Account("12345", 1000.00, "Akhilesh", "akhilesh@gmail.com",
               "8948228957");
       System.out.println(akhileshAccount.getNumber());
       System.out.println(akhileshAccount.getBalance());

       akhileshAccount.depositFunds(250);
       akhileshAccount.withdrawFunds(20);

    }
}
