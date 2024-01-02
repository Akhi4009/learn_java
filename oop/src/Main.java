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

       Account akhileshAccount = new Account();
       akhileshAccount.setNumber("12345");
       akhileshAccount.setBalance(1000.00);
       akhileshAccount.setCustomerName("Akhilesh yadav");
       akhileshAccount.setCustomerEmail("akhileshyadav@gmail.com");
       akhileshAccount.setCustomerPhone("8948228957");
       akhileshAccount.depositFunds(250);
       akhileshAccount.withdrawFunds(20);
    }
}
