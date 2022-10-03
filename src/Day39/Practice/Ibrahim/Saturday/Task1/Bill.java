package Day39.Practice.Ibrahim.Saturday.Task1;

public class Bill {
    public static void main(String[] args) {
        ElectricityAccount bill = new ElectricityAccount();
        Customer customer = new Customer("Ibrahim", 40, 1500, bill);
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        bill.calculateBill();
        System.out.println(customer);

        Customer customer1 = new Customer("Zubeyir", 3500, bill);
        customer.consumeElectricity(400);
        customer.consumeElectricity(150);
        customer.consumeElectricity(350);
        bill.calculateBill();
        System.out.println(customer1);
    }

}
