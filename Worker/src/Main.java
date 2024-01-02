public class Main {
    public static void main(String[] args){

        Employee akhil = new Employee("akhilesh","31/05/1996",
                "01/01/2024");
        System.out.println(akhil);
        System.out.println("Age = " + akhil.getAge());
        System.out.println("Pay = " + akhil.collectPay());
        SalariedEmployee akhilesh = new SalariedEmployee("akhilesh","31/05/1998", "01/01/2024",
                12345);
       akhilesh.retire();
        System.out.println(akhilesh);
        System.out.println("Age = " + akhilesh.getAge());

        System.out.println("Pay = $" + akhilesh.collectPay());

        HourlyEmployee raj = new HourlyEmployee("Raj","31/05/1999", "01/01/2024",
                123);

        System.out.println(raj);
        System.out.println("Age = " + raj.getAge());

        System.out.println("Pay = $" + raj.collectPay());
        System.out.println("double Pay = $" + raj.DoublePay());
    }
}
