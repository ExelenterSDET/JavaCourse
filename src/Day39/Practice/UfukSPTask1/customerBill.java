package Day39.Practice.UfukSPTask1;

public class customerBill {
    public static void main(String[] args) {
        ElectricityAccount account1=new ElectricityAccount();
        Customer customer1=new Customer("Ufuk",45,3450,account1);
        customer1.consumeElectricity(100);
        customer1.consumeElectricity(200);
        customer1.consumeElectricity(50);
        account1.calculateBill(customer1);
        System.out.println("customer1 = " + customer1);
    }
}
