import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transaction.add(initialDeposit);
    }
}
public class Banking {
    public static void main(String[] args) {
    Customer akhi =new Customer("Akhilesh",100.0);
        System.out.println(akhi);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("akhilesh",500);
        System.out.println(bank);

        bank.addTransaction("akhilesh",100);
        bank.addTransaction("akhilesh",-10);
        bank.printStatement("akhilesh");
        bank.addNewCustomer("sakshi",100);
        bank.addTransaction("sakshi",200);
        bank.printStatement("sakshi");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for ( var customer : customers ){
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName) == null){
          Customer customer = new Customer(customerName, initialDeposit);
          customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer =  getCustomer(name);
        if(customer != null){
            customer.transaction().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for ( double d : customer.transaction()){  // unboxing
            System.out.printf("$%10.2f (%s)%n",d, d < 0 ? "debit" : "credit");
        }
    }
}

