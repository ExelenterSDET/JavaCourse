package Day40.Practice.Andrea.Mentoring.Task1;

public class Task1 {
    public static void main(String[] args) {

        ElectricityAccount account = new ElectricityAccount();
        Customer customer = new Customer("Andrea", 3400, 30, account);
        // account.calculateBill(customer);
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        double bill = account.calculateBill();
        System.out.println(customer);
        System.out.println(bill);

    }
}
