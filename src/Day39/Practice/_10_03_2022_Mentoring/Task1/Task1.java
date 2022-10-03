package Day39.Practice._10_03_2022_Mentoring.Task1;

public class Task1 {
    public static void main(String[] args) {
        ElectricityAccount account1 = new ElectricityAccount();
        Customer customer1 = new Customer("Jack",26, 900, account1);
        customer1.consumeElectricity(100);
        customer1.consumeElectricity(200);
        customer1.consumeElectricity(50);
        double bill = account1.calculateBill();
        System.out.println(bill);
    }
}
