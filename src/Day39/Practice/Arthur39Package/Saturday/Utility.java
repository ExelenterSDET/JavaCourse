package Day39.Practice.Arthur39Package.Saturday;

public class Utility {
    public static void main(String[] args) {
        ElectricityAccount cust1 = new ElectricityAccount();
        Customer customer1 = new Customer("bill", 50, 2000, cust1 );
        customer1.consumeElectricity(100);
        customer1.consumeElectricity(100);

        customer1.ea.bill = customer1.ea.calculateBill();


        System.out.println(customer1);
    }


}
