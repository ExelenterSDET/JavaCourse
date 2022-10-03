package Day39.Practice.Tohir_Week_8.Task1;

public class Cfunction {
    public static void main(String[] args) {

        Customer customer = new Customer("James",25,1500);
        ElectricityAccount electricityAccount = new ElectricityAccount();
        System.out.println(customer);
        electricityAccount.getTotalWph(5.2);
        System.out.println(electricityAccount.calculateBill());
        customer.electricityAccount = electricityAccount;
        System.out.println(customer);



    }
}
