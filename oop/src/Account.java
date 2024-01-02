public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private  String customerPhone;

    public Account(){
        this("56789", 100.00, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
       this("99999",200.00, customerName, customerEmail, customerPhone);
    }

    public Account(String number, double balance, String name, String email, String phone){
    System.out.println("Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = name;
    this.customerEmail = email;
    this.customerPhone = phone;
    }
    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawAmount){
        if(balance - withdrawAmount < 0){
         System.out.println("Insufficient Funds! You only have $" + balance +
                 " in your account.");
        }else {
            balance -= withdrawAmount;
            System.out.println("Withdraw of $" + withdrawAmount + " made. New balance is $" + balance);
        }

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
