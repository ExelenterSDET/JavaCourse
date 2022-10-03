package Day39.Practice.Anthony.GroupProject8.Task1;


import static Day39.Practice.Anthony.GroupProject8.Task1.ElectricityAccount.bill;

public class ElectricBill {
    public static void main(String[] args) {
        System.out.println("==============================  TASK1  ====================================");

        Customer customer = new Customer();

        Customer customer1 = new Customer("Anthony", 36,1000, bill);//when I print it shows 0 for bill blocker 1
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        ElectricityAccount.calculateBill();


        Customer customer2 = new Customer("Casper", 116,3000,bill);//need to double check electricty account bill calc
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        ElectricityAccount.calculateBill();


        Customer customer3 = new Customer("Dude", 42,4500,bill);//need to double check electricty account bill calc
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        ElectricityAccount.calculateBill();

        Customer customer4 = new Customer("JavaMaster", 10000,800,bill);//need to double check electricty account bill calc
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        ElectricityAccount.calculateBill();



        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);

    }
}
